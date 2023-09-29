
Feature:Vice_Dean_Lesson_olusturma


  Background: : ManagementonSchool_ViceDean_olarak_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici login icin User Name alanina ViceDean olarak kullanici adi girer.
    And kullanici login icin Password alanina password girer
    Then kullanici login butonuna tiklar


  @VD_ders
  Scenario: Vice_Dean_Lesson_olusturma

    Given kullanici Lesson Management sekmesine tiklar
    And kullanici Lessons bolumune tiklar
    And kullanici Lesson Name bolumune ders ismi girer
    And kullanici Compulsory alanini tiklayarak zorunlu ders oldugunu belirtir
    And kullanici Credit Score bolumune kredi notu girer
    And kullanici Submit butonina tiklar
    And kullanici girdigi Lesson Name, Compulsory ve Credit Score alanlarina bilgi girebildigini dogrular
    And kullanici sayfayi kapatirYA
