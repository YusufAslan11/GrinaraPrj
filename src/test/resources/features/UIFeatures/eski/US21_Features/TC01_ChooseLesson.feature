@US21
Feature: US16 Öğrenciler, dersi, notları ve duyuruyu seçebilmeli


  @US21_TC01
  Scenario: TC01 Öğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Choose Lesson butonuna tıklar
    And kullanıcı Lesson, Teacher, Day, Start Time, Stop Time bilgilerini görebildiğini doğrular


    #sıkıntı var
  @US21_TC02
  Scenario: TC02 İstediğin ders veya dersleri seçebilmeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Choose Lesson butonuna tıklar
    And kullanıcı bir ders seçer
    And kullanıcı Submit butonuna tıklar
    And kullanıcı dersin seçildiğini doğrular
    And kullanıcı birden fazla ders seçer
    And kullanıcı Submit butonuna tıklar
      #And kullanıcı dersin seçildiğini doğrular


  #sıkıntı var
  @US21_TC03
  Scenario: TC03 Aynı gün ve saate denk gelen dersleri seçememeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Choose Lesson butonuna tıklar
    And kullanıcı Aynı gün ve aynı saate denk gelen dersleri seçer
    And kullanıcı Submit butonuna tıklar


  @US21_TC04
  Scenario: TC04 Seçtiği bir dersi silebilmelidir.
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Choose Lesson butonuna tıklar
    And kullanıcı Lesson Program List'i görür
    And Kullanıcı seçtiği herhangi bir dersin Delete butonuna tıklar


  @US21_TC05
  Scenario: TC05 Seçtiği dersleri Lesson Program List’te görebilmeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Choose Lesson butonuna tıklar
    And kullanıcı Lesson Program List'i görür


  @US21_TC06
  Scenario: TC06 Seçtiği dersleri Lesson Program List’te görebilmeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Grades and Announcements butonuna tıklar
    And kullanıcı açılan sayfada Student Info List'i görür


  @US21_TC07
  Scenario: TC07 Seçtiği dersleri Lesson Program List’te görebilmeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    And kullanıcı User Name Boxa "studentSaidUserName" data'yı girer
    And kullanıcı Password Boxa "studentSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Grades and Announcements butonuna tıklar
    And kullanıcı açılan sayfada Student Info List ve Meet List'i görür