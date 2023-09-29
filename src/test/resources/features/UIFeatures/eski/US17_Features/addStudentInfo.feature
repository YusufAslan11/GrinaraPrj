@US17
Feature:

    Scenario: : Student Info Management
        Given kullanici "https://managementonschools.com/" sayfasina gider..
        When kullanici anasayfa login bolumune tiklar..
        Given kullanici teacher username ile login olur..
        And kullanici teacher password ile login olur..
        And kullanici login butonuna tiklar..
        When Kullanıcı Choose Lesson secer..
        And Kullanıcı Choose Student secer..
        And Kullanıcı Choose Education Term secer..
        And Secilen ögrenci icin devamsızlık bilgisi girisi yapılır..
        And Secilen ögrenci icin midterm notu girilmelidir..
        And Secilen ögrenci icin final sınavı notu girilmelidir..
        And Seçilen ögrenciyle info note girisi yapılır..
        And Add Student Info bölümde submit butonuna tıklar..


