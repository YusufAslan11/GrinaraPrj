
Feature: Vice Dean ogretmen atayabilmeli

  Background:Add Lesson Program
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici vice dean hesabi login icin User Name alanina kullanici adi girer
    And kullanici vice dean hesabi icin Password alanina password girer
    Then kullanici login butonuna tiklar
    And kullanici menu secenegine tiklar
    And kullanici Lesson Management secenegine tiklar
    And kullanici Lesson Program secenegine tiklar
    And kullanici Choose Lessons listesinde ders secer
    And kullanici Choose Education Term bolumunden donem secer
    And kullanici Choose Day listesinden gun secer
    And kullanici Start Time secebilmelidir
    And kullanici Stop Time secebilmelidir
    And Lesson Program bolumundeki submit butonuna tiklar


    Scenario: Vice Dean lesson Program Assignment
      And kullanici ders programini Choose Lesson bolumunde gorur
      And kullanici Choose Lesson bolumunden ders secer
      And kullanici Choose Teacher bolumunden ogretmen secer
      And kullanici Lesson Program Assignment `taki submit secenegine tiklar
      And kullanici teacher assignment ettigini dogrular
      And add lesson kullanici sayfayi kapatir