(ns conversor.formatador-test
  (:require [midje.sweet :refer :all]
            [conversor.formatador :refer [formatar-mensagem]]))

(fact "Mensagem formatada de cotação é exibida"
      (formatar-mensagem "3.9921" "USD" "BRL") => "1 USD equivale a 3.9921 em BRL")
