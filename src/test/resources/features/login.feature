@login
Feature: Grinara webPage login testi

  Background: Grinara webpage test
    Given Kullanici "Grinara_Url" sayfasina gider
    Then  Kullanici account butonuna basar

  @loginPositive
  Scenario: Grinara webpage positive login testi
    And Kullanici login icin mail adresini girer
    And Kullanici password girer
    And Kullanici login butonuna tiklar
    And Kullanici login olunabildigini dogrular
    And Kullanici sayfayi kapatir

  @loginNegative
  Scenario Outline: Grinara webpage negative login testi
    And Kullanici login negatif test icin gecersiz senaryo olusturur  "<Email>","<password>"
    And Kullanici login butonuna tiklar
    And Kullanici negatif senaryolarda login olunamadigini dogrular
    And Kullanici sayfayi kapatir

    Examples:
      | Email                       | password |
      | aaa@gmail.com               | 265874   |
      | abc@bbb                     | 12345678 |
      | abcgmail.com                | 12345678 |
      | prish.kaelen@free2ducks.com | jxuhy2C& |
      | harold.arben@free2ducks.com | 12345?!. |
      | harold.arben@free2ducks.com | 12345    |
      |                             |          |






