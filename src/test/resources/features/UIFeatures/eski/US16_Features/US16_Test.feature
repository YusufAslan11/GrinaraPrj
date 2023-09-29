@US16
Feature: US16 Vice Dean, kullaniciların gönderdiği mesajları görebilmelidir.
#https://reports.cucumber.io/reports/65a03659-faf6-49f0-98b4-dd4f121c841e

  @US16_TC01
  Scenario: TC01 Vice Dean silme butonunu gorebilmeli
    Given kullanici "managementon_Url" sayfasina gider
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name box'a tıklar
    And kullanıcı User Name Boxa "dean_username" data'yı girer
    Then kullanici Password box'a tıklar
    And kullanıcı Password Boxa "deanpassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Vice Dean Management butonuna tıklar
    And kullanıcı Vice Dean data usernameyi bulur
    And kullanıcı delete butonuna tıklar


  @US16_TC02
  Scenario: TC02_Vice Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir
    Given kullanici "managementon_Url" sayfasina gider
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Log Out butonuna tıklar
    And kullanıcı Log Out Yes butonuna tıklar
    When Kullanici Login Butonuna tıklar
    Then kullanici User Name box'a tıklar
    And kullanıcı User Name Boxa "viceDeanSaid" data'yı girer
    And kullanıcı Password Boxa "viceDeanSaidPassword" data'yı girer
    And kullanıcı Login butonuna tıklar
    And kullanıcı Menu butonuna tıklar
    And kullanıcı Contact Get All butonuna tıklar
    And kullanıcı cok az asagiya iner
    And kullanıcı sayfayı kapatır


    @US16_TC03
    Scenario: TC03_Vice Dean mesajları silebilmelidir.
      Given kullanici "managementon_Url" sayfasina gider
      When Kullanici Login Butonuna tıklar
      Then kullanici User Name box'a tıklar
      And kullanıcı User Name Boxa "dean_username" data'yı girer
      And kullanıcı Password Boxa "deanpassword" data'yı girer
      And kullanıcı Login butonuna tıklar
      And kullanıcı Menu butonuna tıklar
      And kullanıcı Contact Get All butonuna tıklar
      And kullanıcı mesajlardan birisine tıklar
      And kullanıcı delete butonuna tıklar
