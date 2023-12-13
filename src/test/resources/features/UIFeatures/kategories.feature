Feature: Grinara webPage Categories test

  Background: Grinara login
    Given Kullanici "Grinara_Url" sayfasina gider
    Then  Kullanici account butonuna basar
    And Kullanici login icin mail adresini girer
    And Kullanici password girer
    And Kullanici login butonuna tiklar
    And Kullanici login olunabildigini dogrular

  @categories
  Scenario: Grinara webpage Categories test

    Then Kullanici kategoriler sekmesini tiklar
    And Kullanici Oturma Odasi sekmesine tiklar
    And Oturma Odasi sekmesinin aktif oldugu dogrulanir
    And Kullanici Yatak Odasi sekmesine tiklar
    And Yatak Odasi sekmesinin aktif oldugu dogrulanir
    And Kullanici Mutfak sekmesine tiklar
    And Mutfak sekmesinin aktif oldugu dogrulanir
    And Kullanici Banyo sekmesine tiklar
    And Banyo sekmesinin aktif oldugu dogrulanir
    And Kullanici Acikhava ve Seyahat sekmesine tiklar
    And Acikhava ve Seyahat sekmesinin aktif oldugu dogrulanir
    And Kullanici Isitma Cihazlari sekmesine tiklar
    And Isitma Cihazlari sekmesinin aktif oldugu dogrulanir
    And Kullanici Indirimler sekmesine tiklar
    And Indirimler sekmesinin aktif oldugu dogrulanir





