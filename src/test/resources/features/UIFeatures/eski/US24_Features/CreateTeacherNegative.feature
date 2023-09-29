Feature: vice dean ogretmen olusturabilmelidir(Negative)

  Background: kullanici oturum acar
    Given kullanici managementonschools web adresinde admin rolu ile hesap acar

  Scenario Outline: bazı bilgilerin eksik girilmesi durumunda ogretmen olusmamalidir
    Given kullanici menuden teacher management bolumune tiklar
    And kullanici "<ders>","<name>","<surname>","<birth place>","<email>","<phone>","<cinsiyet>","<dogum tarihi>","<SSN>","<username>","<password>" bilgilerini girer
    And kullanici submit butonuna tiklar
    And kullanici girilmeyen bilgiden dolayi ogretmenin olusmadigini dogrular
    Then driver kapat
    Examples:
      | ders | name | surname | birth place | email           | phone        | dogum tarihi | SSN         | username | password |
      | java |      | demir   | london      | email@gmail.com | 987-121-1224 | 10101978     | 440-12-2324 | emre123  | 12345678 |
      | java | emre |         | london      | email@gmail.com | 987-121-1224 | 10101978     | 440-12-2324 | emre123  | 12345678 |
      | java | emre | demir   |             | email@gmail.com | 987-121-1224 | 10101978     | 440-12-2324 | emre123  | 12345678 |
      | java | emre | demir   | london      |                 | 987-121-1224 | 10101978     | 440-12-2324 | emre123  | 12345678 |
      | java | emre | demir   | london      | email@gmail.com |              | 10101978     | 440-12-2324 | emre123  | 12345678 |
      | java | emre | demir   | london      | email@gmail.com | 987-121-1224 |              | 440-12-2324 | emre123  | 12345678 |
      | java | emre | demir   | london      | email@gmail.com | 987-121-1224 | 10101978     |             | emre123  | 12345678 |
      | java | emre | demir   | london      | email@gmail.com | 987-121-1224 | 10101978     | 440-12-2324 |          | 12345678 |
      | java | emre | demir   | london      | email@gmail.com | 987-121-1224 | 10101978     | 440-12-2324 | emre123  |          |


