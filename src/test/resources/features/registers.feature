

@register2
Feature: Grinara webpage register testi

  Background: Grinara webpage test
    Given Kullanici "Grinara_Url" sayfasina gider
    Then  Kullanici account butonuna basar

  @register1
  Scenario: Grinara webpage icin kayit yapilabilmeli
    And Kullanici register sekmesine tiklar
    And Kullanici mail adresini girer
    And Kullanici register butonuna basar




