@
Feature: vice dean ogretmen olusturabilmelidir(negative test).

  Background: kullanici oturum acar
    Given kullanici managementonschools web adresinde admin rolu ile hesap acar

  Scenario: kullanici cinsiyet bilgisini girmeden ogretmen olusturamamalidir
    Given kullanici menuden teacher management bolumune tiklar
    And kullanici herhangi bir dersi secer
    And kullanici name bilgisini girer
    And kullanici surname bilgisini girer
    And kullanici birth place bilgisini girer
    And kullanici email bilgisini girer
    And kullanici phone bilgisini girer
    And kullanici dogum tarihini girer
    And kullanici SSN numarasini girer
    And kullanici username girer
    And kullanici password girer
    And kullanici submit butonuna tiklar
    Then kullanici girilmeyen cinsiyetten dolayi ogretmenin olusmadigini dogrular

