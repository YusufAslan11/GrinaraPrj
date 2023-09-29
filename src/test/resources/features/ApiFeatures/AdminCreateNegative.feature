@api
@api1_N
Feature:US22_Admin hesabi ile admin ekleme

  Scenario Outline: Eksik bilgi ile admin eklenememelidir
    Given kullanici api icin base url olusturur.
    And kullanici expected data yi olusturur."<userId>","<birthDay>","<birthPlace>","<built_in>","<gender>","<name>","<password>","<phoneNumber>","<ssn>","<surname>","<username>"
    And kullanici post request yaparak bir admin olusturur
    And kullanici eksik bilgi ile admin olusmadigini dogrular
    Examples:
      | userId | birthDay   | birthPlace | built_in | gender | name | password | phoneNumber  | ssn           | surname | username |
      |        |            | Edirne     | true     | MALE   | Taha | 24681234 | 128-657-9246 | 614-81-2976   | TTCan1  | TTCan1   |
      |        | 1982-05-05 |            | true     | MALE   | Taha | 24681234 | 128-657-9246 | 614-81-2976   | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     |        | Taha | 24681234 | 128-657-9246 | 614-81-2976   | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   |      | 24681234 | 128-657-9246 | 614-81-2976   | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha |          | 128-657-9246 | 614-81-2976   | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha | 24681234 |              | 614-81-2976   | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha | 24681234 | 128-657-9246 |               | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha | 24681234 | 128-657-9246 | 614812976     | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha | 24681234 | 128-657-9246 | 614-81-297624 | TTCan1  | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha | 24681234 | 128-657-9246 | 614-81-2976   |         | TTCan1   |
      |        | 1982-05-05 | Edirne     | true     | MALE   | Taha | 24681234 | 128-657-9246 | 614-81-2976   | TTCan1  |          |

