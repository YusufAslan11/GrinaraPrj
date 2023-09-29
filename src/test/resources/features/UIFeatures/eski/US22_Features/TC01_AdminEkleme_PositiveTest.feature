@AdminPositive
Feature: Admin_Ekleme_PositiveTest

  Background: ManagementonSchool_Admin_olarak_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici login icin User Name alanina kullanici adi girer
    And kullanici login icin Password alanina password girer
    Then kullanici login butonuna tiklar

  Scenario Outline: Admin_Ekleme_PositiveTest
    And kullanici "<Name>" alanina isim girer
    And kullanici "<Surname>" alanina soyisim girer
    And kullanici "<BirthPlace>" alanina doğum yeri girer
    And kullanici  Gender alaninda cinsiyet secer
    And kullanici "<DateOfBirth>" alanina doğum tarihi girer
    And kullanici "<Phone>" alanina (xxx-xxx-xxxx) formatinda telefon numarasi girer
    And kullanici "<Ssn>" alanina (xxx-xx-xxxx) formatinda kimlik bilgisi girer
    And kullanici "<UserName>" alanina kullanici adi girer
    And kullanici "<Password>" alanina pasword girer
    And kullanici Submit alanini tiklar.
    And kullanici admin eklendiğini doğrular
      Examples:
        | Name     | Surname | BirthPlace | DateOfBirth | Phone        | Ssn         | UserName | Password |
        | Albbyhju | Almn    | Ibvnbul    | 01012015    | 494-918-3468 | 258-54-9638 | poyhtg   | 12345678 |
        | Name      | Surname | BirthPlace | DateOfBirth | Phone        | Ssn         | UserName      | Password |
        | Albbvfeb1 | Alivn   | Ieedenbul  | 01012015    | 434-552-9944 | 890-93-9941 | daa6abgsxca23 | 12345678 |

