package Tests.Day15_Xml_Files;

public class Review {

    /*
    ISTENEN CLASSLARI CALISTIRMA
    TestNG ile toplu dosya calistirmak icin xml uzantili dosyalar kullaniriz.
     xml dosyalari HTML kodlarina benzer sekilde yazilan xml kodlarindan olusur.
     Toplu calistima icin ihtiyacimiz olan xml kodlari testng.org sayfasindan alinir.

     Tum testNG xml dosyalari <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" > kodu ile baslamalidir.
     Bu Kode testNG sayfasindan alinabilir.

     Daha sonra calistiracagimiz testleri hiyerarsik olarak xml dosyasinda belirleyebiliriz.
    Suite ve test ile basladiktan sonra class istedigimiz gibi listeleyebiliriz ama oncelik Suite ve Test olarak baslamak.


    ISTENEN GRUPLARI CALISTIRMA
    Toplu calistirmada calisacak methodlari tek tek xml dosyasia islemek yerine, her method`un dahil olacagi test gruplarini
    methodlarin bulundudu yerde isaretliyebiliriz.

   Ornegin smoke test icin buradan tek tek method secmek yerine smoke olarak calisacak test methodl`larini framework`de
   gruplayabiliriz.

   Bir gruba dahil olan test method`lari farkli konumlarda olabilecegi gibi, bir tek test method`u birden fazla gruba dahil
   olabilir. Bu durumda grup calistirmasi icin iki hiyerarsi olusturulmalidir.
   1- calisacak veya calismayacak gruplari belirlemek icin
   2- calistirmak istedigimiz method`larin yerini gostermek icin

    Include ve exclude birden fazla kullanilabilir. istedigimiz ozelliklere sahip methodlari net olarak belirleyebiliriz.
    Include ve exclude cakisinca exclude sozu gecer.



    ISTENEN METHODLARI CALISTIRMA
    Bir class`in icinde bir tek test method var ise class calistirmak method calismasi yeterli olacaktir.
     Method secimi birden fazla test method u barindiran class`lar da spesifik olarak bazi methodlari calistirmak ya da
     spesifik olarak belirlenen test method`lari disinda ki tum method`lari calistirmak icin kullanilir.

     Eger bir xml dosyasi ile istedigimiz package / clas ya da class taki methodlari calistirmak istersek, hiyerarsiye
     uygun yerden yapiyi yeniden baslatabiliriz.

     Include: Sadece verilen methodlari calistirir.
     Exclude: Verilen method harici olanlari calistirir.

     TUM TESTLERI CALISTIRMA
     Tests.* seklinde kullanim


     */
}
