@api
@api1
Feature:US22_Admin hesabi ile admin ekleme
  Scenario Outline: Admin hesabi ile admin eklenebilmeli
    Given kullanici api icin base url olusturur.
    And kullanici expected data yi olusturur."<userId>","<birthDay>","<birthPlace>","<built_in>","<gender>","<name>","<password>","<phoneNumber>","<ssn>","<surname>","<username>"
    And kullanici post request yaparak bir admin olusturur
    And kullanici admin olustugunu dogrular
  
  Examples:
    | userId | birthDay   | birthPlace | built_in | gender | name  | password | phoneNumber  | ssn         | surname | username |
    |        | 1977-03-03 | Istanbul   | true     | MALE   | John1 | 12345678 | 651-171-1023 | 431-45-1223 | taha1   | tahataha |



