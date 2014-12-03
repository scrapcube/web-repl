(defproject web-repl "0.1.0-SNAPSHOT"
  :description "An in-browser clojurescript REPL service."
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [om "0.8.0-alpha2"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "web-repl"
              :source-paths ["src"]
              :compiler {
                :output-to "web_repl.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
