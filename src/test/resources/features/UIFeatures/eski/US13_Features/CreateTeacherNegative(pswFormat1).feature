@
Feature: vice dean ogretmen olusturabilmelidir(negative test).

  Background: kullanici oturum acar
    Given kullanici managementonschools web adresinde vice dean rolu ile hesap acar

  Scenario: kullanici password bilgisini istenen formattan farkli girememelidir
    Given kullanici menuden teacher management bolumune tiklar
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
    And kullanici yedi karakterli password girer
    And kullanici submit butonuna tiklar
    Then kullanici password invalid uyarisini dogrular

