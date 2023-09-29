@DN
Feature: Dean_Hesabi_Olusturma
  Background: ManagementSchool_login
    Given Admin "https://managementonschools.com/" sitesine giderKBY17
    When Kullanici login sekmesine tiklar.KBY17
    When Kullanici Admin olarak adminname girer.KBY17
    When Kullanici Admin olarak password girer.KBY17
    When kullanici login butonuna tiklar.KBY17

  Scenario: Admin_Hesabi_ile_Dean_Hesabi_OlusturamamaKBY17
    When Admin Menu butonuna tıklarKBY17
    Then Admin Dean Management  butonuna tıklarKBY17
    And Admin  bir name girmezKBY17
    And Admin  bir  surname girmezKBY17
    And Admin bir  Birth Place girmezKBY17
    Then Admin bir cinsiyet secmezKBY17
    And Admin bir dogum tarihi girmezKBY17
    And kullanici Phone a dokuz haneli telefon numarasi girerKBY17
    And kullanici Ssn a sekiz haneli kimlik bilgisi girerKBY17
    And Admin Username ini girmezKBY17
    And Admin  buyuk harf kullanmadan password girerKBY17
    And kullanici Submit alanini tiklayarak Dean olusturamazKBY17