@tc3
Feature: Dean_ViceDean_Hesabi_Olusturma
  Background: ManagementonSchool_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And oKullanici Dean olarak deanname girer
    And oKullanici Dean olarak password girer
    And kullanici login butonuna tiklar


  Scenario: Dean_Hesabi_ile_ViceDean_Hesabi_Olusturma
    When okullanici Menu butonuna tiklar
    Then okullanici Vice Dean Management sekmesine tiklar
    And okullanici Name alanina eksik karakter girer
    And okullanici Surname alanina eksik karakter girer
    And okullanici Birth Place alanina eksik karakter girer
    And okullanici Gender alaninda cinsiyet secer
    And okullanici DateOf Birth alanina hatali dogum tarihi girer
    And okullanici Phone alanina (xxx-xxx-xxx) formatinda telefon numarasi girer
    And okullanici Ssn alanina (xxx-xx-xxx) formatina kimlik bilgisi girer
    And okullanici User Name alanina kullanici eksik karakter girer
    And okullanici Password alanina eksik password girer
    And okullanici Submit alanini tiklayarak Vice Dean olusturamaz
    And okullanici sayfayi kapatir
