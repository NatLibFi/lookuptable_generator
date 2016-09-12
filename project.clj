(defproject lookuptable-generate "2.0.0"
  :description "A script to generate USEMARCON Look Up Tables from Excel sheets."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [dk.ative/docjure "1.10.0"]]
  :main ^:skip-aot lookuptable-generate.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
