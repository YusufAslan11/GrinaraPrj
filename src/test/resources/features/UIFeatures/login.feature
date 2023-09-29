@login
  Feature: Grinara webPage login testi

    Scenario: Grinara webpage positive login testi
      Given Kullanici "Grinara_Url" sayfasina gider
      Then  Kullanici account butonuna basar
      And Kullanici login icin mail adresini girer
      And Kullanici password girer
      And Kullanici login butonuna tiklar




