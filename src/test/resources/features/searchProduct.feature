@Search
Feature: Grinara webPage product search section

  Background: Grinara login
    Given Kullanici "Grinara_Url" sayfasina gider
    Then  Kullanici account butonuna basar
    And Kullanici login icin mail adresini girer
    And Kullanici password girer
    And Kullanici login butonuna tiklar
    And Kullanici login olunabildigini dogrular

  @searchproduct
  Scenario Outline: Grinara webpage product search section
    Then Kullanici arama bolumunde "<Pro>" aratir
    Then Kullanici aranan urunlerin bulundugunu dogrular
    And Kullanici sayfayi kapatir

    Examples:
      | Pro       |
      | Biofactur |
      | Komfortec |


