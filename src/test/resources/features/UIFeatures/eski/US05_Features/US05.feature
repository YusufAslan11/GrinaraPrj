@ds
Feature: Dean_Hesabi_Olusturma
  Background: ManagementSchool_login
    Given Admin "https://managementonschools.com/" Sayfasina giderK17
    When Kullanici login sekmesine tiklarK17
    When Kullanici Admin olarak adminname girerK17
    When Kullanici Admin olarak password girerK17
    When kullanici login butonuna tiklar.K17


  Scenario: Admin_Hesabi_ile_Dean_Bilgileri_Guncelleyebilme

    When Admin Menu Butonuna tıklarK17
    Then Admin Dean Management  Butonuna tıklarK17
    And Admin sayfanin asagisina inerK17
    And Admin Dean List in en son sayfasina  giderK17
    And Admin sayfanin asagisina inerK17
    And Admin Dean List in en son sayfasina  giderK17
    And Admin Listeye en son eklenen Dean in edit butonuna tiklarK17
    Then Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeliK17
    And Admin Dean in dogum yerini guncellerK17
    And Admin Dean in ismini guncellerK17
    And Admin Dean in soyismini guncellerK17
    And Admin Dean in cinsiyetini guncellerK17