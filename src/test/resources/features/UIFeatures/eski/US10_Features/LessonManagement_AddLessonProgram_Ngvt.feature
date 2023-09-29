

Feature:Vice Dean Add Lesson Program
  Background: ManagementonSchool_login
    Given kullanici "https://managementonschools.com/" sayfasina gider
    When kullanici anasayfa login bolumune tiklar
    And kullanici vice dean hesabi login icin User Name alanina kullanici adi girer
    And kullanici vice dean hesabi icin Password alanina password girer
    Then kullanici login butonuna tiklar
    And kullanici menu secenegine tiklar
    And kullanici Lesson Management secenegine tiklar
    And kullanici Lesson Program secenegine tiklar


   @lessonP
    Scenario Outline:
      And kullanici cikan bolumdeki bilgileri doldurur "<chooseLesson>","<EducationTerm>","<day>","<startTime>","<stopTime>"

      And add lesson kullanici sayfayi kapatir

      Examples:
        | chooseLesson | EducationTerm | day    | startTime | stopTime |
        |              | FALL_SEMESTER | FRIDAY | 1100A     | 1200P    |
        | Java         |               | FRIDAY | 1100A     | 1200P    |
        | Java         | FALL_SEMESTER |        | 1100A     | 1200P    |
        | Java         | FALL_SEMESTER | FRIDAY |           | 1200P    |
        | Java         | FALL_SEMESTER | FRIDAY | 1100A     |          |

