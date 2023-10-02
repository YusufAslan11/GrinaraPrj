@login
Feature: Grinara webPage login testi

  Background: Grinara webpage test
    Given Kullanici "Grinara_Url" sayfasina gider
    Then  Kullanici account butonuna basar


  Scenario: Grinara webpage positive login testi
    And Kullanici login icin mail adresini girer
    And Kullanici password girer
    And Kullanici login butonuna tiklar
    And Kullanici login olunabildigini dogrular

  Scenario Outline: Grinara webpage negative login testi
    And Kullanici login negatif test icin gecersiz senaryo olusturur  "<Email>","<password>"
    And Kullanici login butonuna tiklar
    And Kullanici negatif senaryolarda login olunamadıgini dogrular
    Examples:
      | Email                       | password |
      | aaa@bbb@gmail.com           | 12345678 |
      | abc@bbb@gmail               | 12345678 |
      | abcgmail.com                | 12345678 |
      | prish.kaelen@free2ducks.com | jxuhy2C& |
      | prish.kaelen@free2ducks.com | 12348    |







