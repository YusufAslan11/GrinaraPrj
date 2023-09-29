@ZG
Feature: Meet_Olusturma
  Background: ManagementSchool_login
    Given Admin "https://managementonschools.com/" sayfasina gider
    When Kullanici login sekmesine tiklar
    When Kullanici Admin olarak adminname girer
    When Kullanici Admin olarak password girer
    When kullanici login butonuna tiklar

  Scenario: Meet_Guncelleme
    When kullanici Menu butonuna tiklar
    Then kullanici Meet Management sekmesine tiklar
    And kullanici Meet List bilgilerini görüntüler

    Then kullanici edit butonuna tiklar
    And kullanici cikan sekmede öğrenci seçer
    And kullanici öğrenci, gün ve saati secip günceller
    And kullanici submit butonuna tiklar

    Then kullanici delete butonuna tiklar
    And kullanici olusturduğu toplantıyı siler