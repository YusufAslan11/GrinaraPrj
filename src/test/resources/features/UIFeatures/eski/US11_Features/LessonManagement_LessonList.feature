
Feature: Vice Dean ders listesini gorebilmeli ve guncelleyebilmelidir

  Scenario:

    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici vice dean hesabi login icin User Name alanina kullanici adi girer
    And kullanici vice dean hesabi icin Password alanina password girer
    Then kullanici login butonuna tiklar
    And kullanici menu secenegine tiklar
    And kullanici Lesson Management secenegine tiklar
    And kullanici Lesson Program secenegine tiklar
    And kullanici Lesson Program List`te Lesson,Day,Start Time ve Stop Time gorur
    And kullanici Lesson Program List`ten guncelleme yapar
    And kullanici Lesson Program List`ten silme yapar
    And add lesson kullanici sayfayi kapatir