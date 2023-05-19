package Tests.Day10_TestNG_Framework;

public class Review {

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



}
