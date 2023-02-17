# Crowdar

Correr la automatización desde el runner TestRunner ubicado en ../test/java/runner/TestRunner

Los casos de pruebas estan escritos en gherkin dentro del archivo loginchallenge.feature

El caso erroneo intencionalmente intenta buscar el valor 1 dentro del indicador que se encuentra en el shopping cart cuando se remueven todos los articulos
El caso correcto seria que intente identificar el valor "0".

Dentro de ../reports/ se encuentra el reporte .html para google chrome
Dentro de ChallengeCrowdar/test-output se guardan las screenshots al fallar un scenario
