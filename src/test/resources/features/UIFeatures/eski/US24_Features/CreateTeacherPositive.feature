@
Feature: vice dean ogretmen olusturabilmelidir.

  Background: kullanici oturum acar
    Given kullanici managementonschools web adresinde admin rolu ile hesap acar

  Scenario: kullanici ogretmen olusturur
    Given kullanici menuden teacher management bolumune tiklar
    And kullanici herhangi bir dersi secer
    And kullanici name bilgisini girer
    And kullanici surname bilgisini girer
    And kullanici birth place bilgisini girer
    And kullanici email bilgisini girer
    And kullanici phone bilgisini girer
    And kullanici is advisor teacher seceneginin secilebildigini kontrol eder
    And kullanici cinsiyet secer
    And kullanici dogum tarihini girer
    And kullanici SSN numarasini girer
    And kullanici username girer
    And kullanici password girer
    And kullanici submit butonuna tiklar
    Then kullanici ogretmenin olustugunu dogrular


