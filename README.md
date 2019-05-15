# pfc-conversor

A simple Clojure command line application for currency quotation.

It's a sample program from the book ["Programação funcional: Uma introdução em Clojure"](https://www.casadocodigo.com.br/products/livro-programacao-funcional-clojure)

## Installation

Install [Leiningen](https://leiningen.org/) and clone this application source code.

## Usage

Open the project directory and run: 
   
    $ API_KEY=MY_API_KEY lein run -d MOEDA -p MOEDA

MY_API_KEY is the key to access the currency quotation API.
You can obtain it for free in https://free.currencyconverterapi.com/free-api-key

-d: Param is the source currency for the conversion

-p: Param is the target currency for the conversion

----

It's also possible to run a standalone jar of the application. To generate the jar run:

    $ lein uberjar

Then enter the target directory and run the following command to run the app:

    $ API_KEY=MY_API_KEY java -jar pfc-conversor-0.1.0-SNAPSHOT-standalone.jar -d MOEDA -p MOEDA

## Options

    --de MOEDA          Origin/Source currency for the conversion  
    -d MOEDA            --de shorthand
    --para MOEDA        Target/Destination currency for the conversion
    -p MOEDA            --para shorthand

## Examples

    $ API_KEY=111111111 lein run -d USD -p BRL
    
    "1 USD equivale a 3.99375 em BRL"

--- 

    $ API_KEY=111111111 java -jar pfc-conversor-0.1.0-SNAPSHOT-standalone.jar -d EUR -p BRL
    
    "1 EUR equivale a 4.486302 em BRL"

## Tests

Tests use [Midje](https://github.com/marick/Midje). Run them with:
    
    $ lein midje