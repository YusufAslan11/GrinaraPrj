@
Feature: vice dean ogretmen olusturabilmelidir(negative test).

  Background: kullanici oturum acar
    Given kullanici managementonschools web adresinde admin rolu ile hesap acar

  Scenario: kullanici name surname username bilgilerini sembol olarak girmesi durumunda ögretmen olusmamalidir
    Given kullanici menuden teacher management bolumune tiklar
    And kullanici herhangi bir dersi secer
    And kullanici name bilgisini sembol olarak girer
    And kullanici surname bilgisini sembol olarak girer
    And kullanici birth place bilgisini girer
    And kullanici email bilgisini girer
    And kullanici phone bilgisini girer
    And kullanici cinsiyet secer
    And kullanici dogum tarihini girer
    And kullanici SSN numarasini girer
    And kullanici username bilgisini sembol olarak girer
    And kullanici password girer
    And kullanici submit butonuna tiklar
    Then kullanici sembollerden dolayi ogretmenin olusmadigini dogrular

