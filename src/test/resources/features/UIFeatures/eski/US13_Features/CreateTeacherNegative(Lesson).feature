@
Feature: vice dean ogretmen olusturabilmelidir(negative test).

  Background: kullanici oturum acar
    Given kullanici managementonschools web adresinde vice dean rolu ile hesap acar

  Scenario: kullanici lesson bilgisini girmeden ogretmen olusturamamalidir
    Given kullanici menuden teacher management bolumune tiklar
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
    Then kullanici ogretmenin olusmadigini dogrular

