# Look Up Table -generator 2.0

A script that generates USEMARCON Look Up Table -files from Excel spreadsheets. This tool is best suited for parsing large amounts of value pairs such as lists of term translations.

## Dependencies

- Java
- [Leiningen](http://leiningen.org/)

## Installation

First clone the repository:

    $ git clone https://github.com/NatLibFi/lookuptable_generator

Then (optionally) compile:

    $ lein uberjar

## Usage

Place your input sheet into ./data. Edit settings into config.edn, then:

    $ java -jar target/uberjar/lookuptable-generate-2.0.0-standalone.jar

Or, using Leiningen:

    $ lein run


## Examples

An example config.edn:

```clojure
{:file "./data/example.xlsx"
 :outputfilename "outputfile.tbl"
 :preamble "First line in the output file (a description or title)"
 :sheet "first_sheet"
 :in-column :A
 :out-column :B
 :title-rows 1 ; Rows to skip before the data proper
 :use-default true ; If a default value is used
 :default "COPY"}

```

## License

Copyright © 2014-2016 University of Helsinki (The National Library of Finland)

Distributed under the Eclipse Public License version 1.0.
