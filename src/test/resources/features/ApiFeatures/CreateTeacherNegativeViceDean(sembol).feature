@api
Feature: US13_TC03 vice dean ogretmen olusturabilmelidir(negative).
  Scenario: kullanici name surname username bilgilerini sembol olarak girmesi durumunda ögretmen olusmamalidir
    Given kullanici api icin base url olusturur
    And kullanici name surname username bilgilerini sembol olarak girerek expected data yi olusturur
    And kullanici vice dean ile post request yaparak bir ogretmen olusturur
    And kullanici ogretmenin olusmadigini dogrulama yapar