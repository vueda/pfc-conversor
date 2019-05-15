(ns conversor.cambista-test
  (:require [midje.sweet :refer :all]
            [conversor.cambista :refer [cotar]]))

(def resposta-sucesso {:status 200 :body "{\"results\" : { \"USD_BRL\" : {\"val\" : 3.9923}}}"})

(fact "Cotação de USD para BRL retorna valor"
      (with-redefs [conversor.cambista/api-key "MY_KEY_1234"]
      (cotar "USD" "BRL") => 3.9923
      (provided (#'conversor.cambista/consumir-api "USD_BRL" "MY_KEY_1234") => resposta-sucesso)))