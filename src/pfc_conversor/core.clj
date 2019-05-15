(ns pfc-conversor.core
  (:require [conversor.formatador :refer [formatar-mensagem]]
            [conversor.interpretador-opcoes :refer [interpretar-opcoes]]
            [conversor.cambista :refer [cotar]])
  (:gen-class))


(defn -main
  [& args]
  (prn args)
  (let [{:keys [de para]} (interpretar-opcoes args)]
    (->
     (cotar de para)
     (formatar-mensagem de para)
     (prn))))