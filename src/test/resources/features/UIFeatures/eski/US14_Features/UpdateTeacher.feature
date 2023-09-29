
Feature: US14-TC02 vice dean ogretmen bilgilerini guncelleyebilmeli
  Scenario: vice dean hesabi ile bir ogretmen olusturulur ve bilgileri guncellenir
    Given kullanici managementonschools web adresinde vice dean rolu ile hesap acar
    And kullanici menuden teacher management bolumune tiklar
    And kullanici herhangi bir dersi secer
    And kullanici name bilgisini girer
    And kullanici surname bilgisini girer
    And kullanici birth place bilgisini girer
    And kullanici email bilgisini girer
    And kullanici phone bilgisini girer
    And kullanici cinsiyet secer
    And kullanici dogum tarihini girer
    And kullanici SSN numarasini girer
    And kullanici username girer
    And kullanici password girer
    And kullanici submit butonuna tiklar
    And kullanici teacher listin en sonuna gider
    And kullanici olusturdugu ogretmenin edit bolumune tiklar
    And kullanici select lesson bolumune farkli bir ders adi girer
    And kullanici name bolumune farkli bir isim girer
    And kullanici surname bolumune farkli bir surname girer
    And kullanici birthplace bolumune farkli bir birthplace girer
    And kullanici email bolumune farkli bir email girer
    And kullanici phone bolumune farkli bir phone girer
    And kullanici SSN bolumune farkli bir SSN girer
    And kullanici is advisor secenegini isaretler
    And kullanici female secenegini isaretler
    And kullanici date of birth bolumune farkli bir tarih girer
    And kullanici username bolumune farkli bir username girer
    And kullanici password bolumune farkli bir password girer
    And kullanici guncellemeyi tamamlamak icin submit butonuna tiklar
    Then kullanici updated uyarisini gorur



