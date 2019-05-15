(defproject pfc-conversor "0.1.0-SNAPSHOT"
  :description "Conversor de moeda - Exemplo do livro 'Programação funcional: Uma introdução em Clojure'"
  :url "https://tecnowlogia.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.4.1"]
                 [clj-http "3.9.1"]
                 [cheshire "5.8.1"]]


  :main ^:skip-aot pfc-conversor.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[midje "1.9.6"]]
                   :plugins [[lein-midje "3.2.1"]]}})
