@
Feature: US14-TC01 vice dean ogretmenleri gorebilmeli

    Scenario: : vice dean hesabi ile bir ogretmen olusturulur
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
      Then olusturulan ogretmenin listenin sonunda gozuktugu dogrulanir



