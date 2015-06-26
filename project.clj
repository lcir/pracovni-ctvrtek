(defproject hello "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}

            :jvm-opts ^:replace ["-Xmx1g" "-server"]

            :dependencies [[org.clojure/clojure "1.7.0-beta3"]
                           [org.clojure/clojurescript "0.0-3211"]
                           [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                           [org.omcljs/om "0.8.8"]
                           [ring "1.3.2"]
                           [compojure "1.3.1"]
                           [racehub/om-bootstrap "0.5.1"]]

            :plugins [[lein-cljsbuild "1.0.5"]
                      [lein-figwheel "0.3.3"]]


            :source-paths ["src/cljs"]
            :resource-paths ["resources"]
            :clean-targets ^{:protect false} ["resources/public/js/out"
                                              "resources/public/js/main.js"]

            :figwheel {:ring-handler hello-world.hello/handler}

            :cljsbuild {:builds [{:id "dev"
                                  :source-paths ["src/cljs"]
                                  :figwheel true
                                  :compiler {:output-to "resources/public/js/main.js"
                                             :output-dir "resources/public/js/out"
                                             :main hello-world.hello
                                             :asset-path "js/out"
                                             :optimizations :none
                                             :source-map true}}]})
