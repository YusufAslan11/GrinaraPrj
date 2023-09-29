
Feature:ViceDean_DersListesi_Islemleri


  Background: : ManagementonSchool_ViceDean_olarak_login2
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici login icin User Name alanina ViceDean olarak kullanici adi girer.
    And kullanici login icin Password alanina password girer
    Then kullanici login butonuna tiklar

  @VD_Ders_Listesi
  Scenario: Vice_Dean_Lesson_Islemleri

    Given kullanici Lesson Management sekmesine tiklar
    And kullanici Lessons bolumune tiklar
    And kullanici Vice Dean olusturmus oldugu lessons u lessons listesinde gorur
    And kullanici oluşturduğu Compulsory i gorur
    And kullanici olusturduğu Credit Score u gorur
    And kullanici girmis oldugu dersi gunceller
    And kullanici yaptigi guncellemeyi dogrular
    And kullanici girmis oldugu dersi siler
    And kullanici dersin silindigini dogrular


