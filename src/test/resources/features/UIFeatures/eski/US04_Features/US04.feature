@D
Feature: Dean_Hesabi_Olusturma
  Background: ManagementSchool_login
    Given Admin "https://managementonschools.com/" sayfasina giderKB17
    When Admin login sekmesine tiklarKB17
    When Admin Admin olarak adminname girerKB17
    When Admin Admin olarak password girerKB17
    When Admin login butonuna tiklarKB17


  Scenario: Admin_Hesabi_ile_Dean_Hesabi_Olusturma

    When Admin Menu Butonuna tıklarKB17
    Then Admin Dean Management  Butonuna tıklarKB17
    And Admin  bir name girerKB17
    And Admin  bir  surname girerKB17
    And Admin bir  Birth Place girerKB17
    Then Admin bir cinsiyet secerKB17
    And Admin bir dogum tarihi girerKB17
    Then Admin Phone a  telefon numarasi girerKB17
    Then Admin Ssn a kimlik bilgisi girerKB17
    And Admin Username ini girebilmelidirKB17
    And Admin password girebilmelidirKB17
    And kullanici Submit alanini tiklayarak Dean olusturabilmelidirKB17