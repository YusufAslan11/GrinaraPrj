@elif
Feature: Vice Dean ders programi olusturabilmelidir

  Background: ManagementonSchool_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici vice dean hesabi login icin User Name alanina kullanici adi girer
    And kullanici vice dean hesabi icin Password alanina password girer
    Then kullanici login butonuna tiklar
    And kullanici menu secenegine tiklar
    And kullanici Lesson Management secenegine tiklar
    And kullanici Lesson Program secenegine tiklar


    Scenario: Vice Dean desr programi olusturur
    And kullanici Choose Lessons listesinde ders secer
    And kullanici Choose Education Term bolumunden donem secer
    And kullanici Choose Day listesinden gun secer
    And kullanici Start Time secebilmelidir
    And kullanici Stop Time secebilmelidir
    And Lesson Program bolumundeki submit butonuna tiklar
    And kullanici Created Lesson Program yazisini gorur
      And add lesson kullanici sayfayi kapatir

