(ns conversor.interpretador-opcoes
  (:require [clojure.tools.cli :refer [parse-opts]]))

(def opcoes-programa
  [["-d" "--de moeda" "Moeda base para conversão" :default "BRL"]
   ["-p" "--para moeda" "Moeda destino da conversão"]])

(defn interpretar-opcoes [argumentos]
  (:options (parse-opts argumentos opcoes-programa)))
