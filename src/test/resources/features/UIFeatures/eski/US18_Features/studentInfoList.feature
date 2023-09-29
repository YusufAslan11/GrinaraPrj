@18
Feature: Student info listesini görebilmeli ve güncelleyebilmeli

Scenario:Teacher student info list bölümünden güncelleme yapar

Given kullanici "https://managementonschools.com/" sayfasina gider..
When  kullanici anasayfa login bolumune tiklar..
Given kullanici teacher username ile login olur..
And   kullanici teacher password ile login olur..
And   kullanici login butonuna tiklar..
And   Teacher, öğrenciye verdiği notları görür..
And   Student Info List bölümünde Edit butonuna tıklar..
And   Kullanıcı And Student Info Listte Lesson Name secimi yapar..
When  Kullanıcı Choose Education Term secimi yapar..
And   Kullanıcı Devamsızlık günceller..
And   Kullanıcı Midterm notu günceller..
And   Kullanıcı Final Note günceller..
And   Kullanıcı Info Note günceller..
And   Kullanıcı Submit butonuna tıklar..
And   Cıkan sayfayı kapatmak icin carpıya tıklar..
And   Ögrenci not bilgisi silmek icin cöp kutusu butonuna tıklanır..
And   Not bilgisi silindigi görüntülenir..
