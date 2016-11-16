(defproject com.cemerick/cljsbuild-reload-bug "1.0.0-SNAPSHOT"
  :profiles {:dev {:plugins [[lein-cljsbuild "1.1.4"]]}}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]]

  :cljsbuild {:builds
              [{:source-paths ["src" "test"]
                :compiler
                {:optimizations :none
                 :main "foo.bar"
                 :target :nodejs
                 :output-to "target/foo.js"
                 :output-dir "target"
                 :source-map true}}]})
