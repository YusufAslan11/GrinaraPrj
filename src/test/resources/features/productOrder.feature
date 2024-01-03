@product
Feature: Grinara webpage product Test

  Background: Grinara webpage test
    Given Kullanici "Grinara_Url" sayfasina gider
    Then  Kullanici account butonuna basar
    And Kullanici login icin mail adresini girer
    And Kullanici password girer
    And Kullanici login butonuna tiklar
    And Kullanici login olunabildigini dogrular

  @product1
  Scenario:Grinara webpage icin product test
    Given Kullanici shop sekmesini acar
    Then Kullanici begendigi bir urunu secer
   # And Kullanici urun seceneklerinden secim yapar
    And Kullanici urunu sepete ekler
    And Kullanici sayfayi kapatir





