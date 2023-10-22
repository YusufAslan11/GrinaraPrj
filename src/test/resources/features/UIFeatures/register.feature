@register
  Feature: Grinara webpage register testi
    Scenario:Grinara webpage icin register yapilabilmeli
      Given Kullanici "Grinara_Url" sayfasina gider
      Then Kullanici account butonuna basar
      And Kullanici register sekmesine tiklar
      And Kullanici mail adresini girer
      And Kullanici register butonuna basar



