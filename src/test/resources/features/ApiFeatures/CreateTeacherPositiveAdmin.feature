@api
Feature: US24_TC01 vice dean ogretmen olusturabilmelidir.
  Scenario: kullanici  ogretmen olusturur
    Given kullanici api icin base url olusturur
    And kullanici expected data yi olusturur
    And kullanici admin ile post request yaparak bir ogretmen olusturur
    And kullanici dogrulama yapar