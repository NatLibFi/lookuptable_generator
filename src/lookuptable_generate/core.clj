(ns lookuptable-generate.core
  (:require [clojure.string :as string]
            [clojure.edn :as edn]
            [dk.ative.docjure.spreadsheet :as sheet])
  (:gen-class))

(defn hexify [string]
  (string/join " " (map #(format "0x%02x" %) (.getBytes (str string) "UTF-8"))))

(defn transform-string [string]
  (string/join " " (map 
                     (fn [character] 
                       (let [hexch (hexify character)] 
                         (if (or 
                               (> (count hexch) 4) 
                               (= hexch "0x20")) 
                           hexch character)))
                     string)))

(defn process-line [linemap]
  (str (transform-string (:in linemap)) \tab "|" \tab (transform-string (:out linemap))))

(defn load-sheet [config]
  (->> (sheet/load-workbook (:file config))
       (sheet/select-sheet (:sheet config))
       (sheet/select-columns {(:in-column config) :in, (:out-column config) :out})
       (drop (:title-rows config))))

(defn load-config [file]
  (edn/read-string (slurp file)))

(defn -main [& args]
  (let [config (load-config "config.edn") data (load-sheet config)]
    (let [parsed (str (:outputfilename config) "\n" 
                      (:preamble config) "\n\n" 
                      (string/join "\n" (map process-line data))
                      (if (:use-default config) (str "\n#DEFAULT\t|\t" (:default config) "\n")))]
      (do (spit (:outputfilename config) parsed)
          (println 
            (str "Done, written " (count data) " key-value pairs to " (:outputfilename config) "."))))))
