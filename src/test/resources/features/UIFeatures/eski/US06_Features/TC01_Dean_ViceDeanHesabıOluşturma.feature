@VD
Feature: Dean_ViceDean_Hesabi_Olusturma
  Background: ManagementonSchool_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    And Kullanici Dean olarak deanname girer
    And Kullanici Dean olarak password girer
    And kullanici login butonuna tiklar

    Scenario: Dean_Hesabi_ile_ViceDean_Hesabi_Olusturma
      When kullanici Menu butonuna tiklar
      Then kullanici Vice Dean Management sekmesine tiklar
      And kullanici Name alanina isim girer
      And kullanici Surname alanina soyisim girer
      And kullanici Birth Place alanina dogum yeri girer
      And kullanici Gender alaninda cinsiyet secer
      And kullanici DateOf Birth alanina dogum tarihi girer
      And kullanici Phone alanina (xxx-xxx-xxxx) formatinda telefon numarasi girer
      And kullanici Ssn alanina (xxx-xx-xxxx) formatina kimlik bilgisi girer
      And kullanici User Name alanina kullanici adi girer
      And kullanici "Password" alanina pasword girer
      And kullanici Submit alanini tiklayarak Vice Dean olusturur
      And okullanici sayfayi kapatir


