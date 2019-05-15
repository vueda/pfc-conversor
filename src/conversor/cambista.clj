(ns conversor.cambista
  (:require [clj-http.client :as http-client]
            [cheshire.core :refer [parse-string]]))

(def api-key (System/getenv "API_KEY"))

(def api-url "https://free.currconv.com/api/v7/convert")

(defn- parametrizar-moedas [de para]
  (str de "_" para))

(defn- consumir-api [moedas api-key]
  (http-client/get api-url {:query-params {"q" moedas "apiKey" api-key}}))

(defn cotar [de para]
  (let [moedas (parametrizar-moedas de para)]
    (->
     (:body (consumir-api moedas api-key))
     (parse-string)
     (get-in ["results" moedas "val"]))))