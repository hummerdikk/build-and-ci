# Build és Folyamatos Integráció

## 1. A Beadandó Feladat
Konfiguráljunk fel Jenkins alá egy Pet projectet, vagy akár az órán elkezdett Calculator projectet,
úgy hogy a következő metrikákat nyerjük ki a build során:

* Unit Test eredmények
* Unit Test Coverage
* FindBugs
* CheckStyle
* PMD

Tipp: A Jacoco működik, ha a Gradle-t valaki felfejleszti legalább 2.13-as verzióra (```calculator-gradle/gradle/wrapper/gradle-wrapper.properties). Mindehez Jenkins 2 LTS és egy friss Jacoco Plugin kell 2.x verzió.```)

Aki eddig (2016. december 11.) beküldte annak Jacoco nélkül elfogadom a beadandót 5-re, aki most küldi annak csak 4-es ha hiányzik a Jacoco.

## 2. A Beadandó Formája
A következő dolgokat kérem szállítani:
1. Build Scriptek
1. ScreenShot a Jenkins Job konfigurációjáról
1. ScreenShot az utolsó Jenkins build summary lapról
1. ScreenShot vagy nyers log az utolsó Jenkins buildről

## 3. Határidő
2016 december 16.

Mindezt zip / tar.gz formátumban a következő címre: laszlo_kishalmi@epam.com, ELTE/PPKE Beadandó tárgy megjelöléssel.
