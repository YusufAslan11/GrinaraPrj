@Z
Feature: Meet_Olusturma
  Background: ManagementSchool_login
    Given Admin "https://managementonschools.com/" sayfasina gider
    When Kullanici login sekmesine tiklar
    When Kullanici Admin olarak adminname girer
    When Kullanici Admin olarak password girer
    When kullanici login butonuna tiklar

  Scenario: Meet_Duzenleme
    When kullanici Menu butonuna tiklar
    Then kullanici Meet Management sekmesine tiklar
    And kullanici Choose Student secer
    And kullanici Date of Meet secer
    And kullanici Start Time secer
    And kullanici Stop Time secer
    And kullanici Description girer
    And kullanici Submit alanini tiklayarak Meet olusturur