@US07
Feature: US07 Dean Management
  https://reports.cucumber.io/reports/185fdb0c-1974-4f59-b09a-5cde90487654

  @US07_TC01
  Scenario: TC01 Dean, silme butonunu gorebilmeli
    Given kullanici "managementon_Url" sayfasına gider
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name box'a tıklar
    And kullanıcı User Name Boxa "dean_username" data'yı girer
    Then kullanici Password box'a tıklar
    And kullanıcı Password Boxa "deanpassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Dean Management butonuna tıklar
    And kullanıcı Dean data User Nameyi bulur
    And kullanıcı delete butonuna tıklar



    @US07_TC02
  Scenario: TC02 Dean, mesajları gorebilmeli
      Given kullanici "managementon_Url" sayfasına gider
      And kullanıcı Menu butonuna tıklar
      And kullanıcı Log Out butonuna tıklar
      And kullanıcı Log Out Yes butonuna tıklar
      When Kullanici Login Butonuna tıklar
      Then kullanici User Name box'a tıklar
      And kullanıcı User Name Boxa "deanSaid" data'yı girer
      Then kullanici Password box'a tıklar
      And kullanıcı Password Boxa "deanSaidPassword" data'yı girer
      And kullanıcı Login butonuna tıklar
      And kullanıcı Menu butonuna tıklar
      And kullanıcı Contact Get All butonuna tıklar
      And kullanıcı acilan sayfada bekleneni dogrular
      And kullanıcı sayfayı kapatır

      @US07_TC03
      Scenario: TC03 Dean mesajları silebilmelidir
        Given kullanici "managementon_Url" sayfasına gider
        When Kullanici Login Butonuna tıklar
        Then kullanici User Name box'a tıklar
        And kullanıcı User Name Boxa "dean_username" data'yı girer
        Then kullanici Password box'a tıklar
        And kullanıcı Password Boxa "deanpassword" data'yı girer
        And kullanıcı Login butonuna tıklar
        And kullanıcı Menu butonuna tıklar
        And kullanıcı Contact Get All butonuna tıklar
        And kullanıcı mesajlardan birisine tıklar
        And kullanıcı delete butonuna tıklar