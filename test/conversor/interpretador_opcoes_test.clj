(ns conversor.interpretador-opcoes-test
  (:require [midje.sweet :refer :all]
            [conversor.interpretador-opcoes :refer [interpretar-opcoes]]))

(fact "Sem opções tem apenas moeda base padrão como BRL"
      (interpretar-opcoes '()) => {:de "BRL"})

(fact "Parametro -d define a moeda base em :de"
      (interpretar-opcoes '("-d" "USD")) => {:de "USD"})

(fact "Parametro --de define a moeda base em :de"
      (interpretar-opcoes '("--de" "EUR")) => {:de "EUR"})

(fact "Parametro -p define a moeda alvo em :para"
      (interpretar-opcoes '("-p" "EUR")) => {:de "BRL" :para "EUR"})

(fact "Parametro --para define a moeda alvo em :para"
      (interpretar-opcoes '("--para" "USD")) => {:de "BRL" :para "USD"})