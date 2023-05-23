package Tests.Day_11_TestNG_Framework;

public class Reviews {

    /*
    TestNG ile olusturacagimiz bu framework, isyerinde
kullanilabilecek kullanisli bir framework olacak.
TestNG
TestNG ile uygulayacagimiz POM (Page Object Model)
icin Test’lerimizin oldugu class’lar disinda bazi
package ve class’lar daha olusturulacaktir.
Olusturulacak POM (Page Object Model) ile
- tum ekip ile sorunsuz sekilde calisabilecegimiz,
- test datalarini kolayca yonetebilecegimiz
- Kod tekrarlarindan kurulacagimiz
bir yapi olusturulacaktir.
1- File menusunden New, Project secip yeni proje olusturun.
2- src/test/java package’i altinda iki package olusturun
- tests
- utilities
3- Yeni olusturdugumuz tests package’i altinda gunluk package ve test class’i olusturun
     */


    /*         ======== REVIEW =========

    DRIVER CLASS : Olusturacagimiz framework`de webDriver`i Driver Class`indaki getDriver()`dan alacagiz. Driver Class`ini
    biraz daha gelistirecegiz, farkli browser`lar ile de calisabilir hala gelecek.

    PAGE CLASS : Surekli kullanilan locate / login islemleri method halinda page class`in da olusturuyoruz.
    Page class`in da ki ilk adim parametresiz bir constructor olusuturup, icinde PageFactory.innitElements(webDriver, this) ile
    driver`a page sayfasibda ilk deger atamasini yapmak olmalidir.

    ASSERTION : Iki tip assertion yontemi vardir.

    Hard Assert : Ilk failed olan assertion`da calismayi durdurur ve rapor verir.
    Soft Assert : Raporla diyene kadar assertion`lar failed olsa bile calismaya devam eder. assertAll() ile raporlamasini
    istedigimizde failed olan assertion varsa raporlar ve calismayi durdurur.

   `Test edin` dendiginde hard assert, `Dogrulayin (VERIFY)` dendiginden soft assert kullanilir.Kural degil, genel kabul
    bu sekilde.

     */

    /* =========== PAGE OBJECT MODEL (POM) ========

    POM, testlerimizi daha kolay ve duzenli olarak hazirlalamiz ve calistirmamiz icin olusturulmis bir modeldir.

    Framework icin uretilmis benzer modeller olmakla birlikte en guncel olan ve en cok kullanilan POM`dur.

     Dosya Yapisi

     -- Pages : Test yapacagimiz web page’ler icin Pages package’in altinda bir class olusturuyoruz.
     Bu class’larda mutlaka yapmamiz gereken sey driver’i olusturdugumuz Driver clasindan alip PageFactory.initElements
     ile ilk deger atamasi yapmaktir. Sonrasinda web sayfamizda kullanacagimiz WebElementlerin tamamini public olarak
     olusturmak ve @FindBy notasyonu ile locate etmektir. Eger istersek login gibi bazi adimlari yapacak methodlari da
     bu class’da olusturabiliriz. Test clasimizdan Page sayfasindaki variable ve method’lara obje olusturup erisim
     saglariz.

     -- configuration.properties : Bu dosyayi testlerimizde kullanacagimiz url,test datalari gibi kullanicidan aldigimiz
      datalari dinamik yapmak icin kullaniriz. Tum testlerimizi bu sayfadan alacagimiz datalara gore dizayn ederiz.
      Boylece bu dosyada yapacagimiz bir deger degisikligi ile tum testCase’lerindeki test datalarini guncelleyebiliriz.
      Bu sayfayi basit bir text dosyasi gibi dizayn ederiz her test datasini key=value seklinde key,value ile
      olustururuz.

     -- ConfigReader : Bu class test clasimiz ile configuration.properties dosyasi arasinda tercumanlik yapar.
      Icinde .properties uzantili dosyalari okumak icin gerekli bir static blok olustururuz. Ayrica Test classlarimizdan
       cagirmak icin getPropert() methodunu olustururuz. Bu method test class’indan gonderdigimiz key degerini static
       blok yardimi ile configuration.properties’de bulup karsisindaki value’yu bize dondurur.


     */



}
