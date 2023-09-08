import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static Utility.BaseDriver.*;

public class TechnoStudy {
    static Actions aksiyonlar = new Actions(driver);

    @Test
    public void TechnoStudyTest() {
        driver.get("https://techno.study");

        leadcodes.programs();
        leadcodes.kurslar();


    }

    @Test
    public void BasvuruTest() {
        driver.get("https://techno.study/tr");

        MyFunction.Wait(1);

        WebElement basvur = driver.findElement(By.xpath("//a[@class='tn-atom js-click-zero-stat']"));
        basvur.click();


        WebElement adsoyad = driver.findElement(By.xpath("//input[@placeholder='Adı Soyadı']"));
        adsoyad.sendKeys("test test");


        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test_sdet0106@gmail.com");

        WebElement telephone = driver.findElement(By.xpath("//input[@type='tel']"));
        telephone.sendKeys("9999999999");

        WebElement ulke = driver.findElement(By.id("sb-1667664755026"));
        ulke.sendKeys("Andorra");

        WebElement kurs = driver.findElement(By.name("course"));
        kurs.sendKeys("SDET Türkçe");

        WebElement nerdenduydun = driver.findElement(By.name("survey"));
        nerdenduydun.sendKeys("Başka");

        WebElement kutu = driver.findElement(By.cssSelector("[class='t-checkbox__indicator']"));
        kutu.click();

        WebElement gonder = driver.findElement(By.xpath("//button[@type='submit']"));
        gonder.click();

    }

    @Test
    public void Test() {

        driver.get("https://techno.study/tr");

        WebElement detayliBilgi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5159634201661161478639']//a[@class='tn-atom']"));
        detayliBilgi.click();

        MyFunction.Wait(1);
        WebElement detayBilgi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160263341622986986995']//a[@class='tn-atom']"));
        detayBilgi.click();

        MyFunction.Wait(1);
        WebElement yazi = driver.findElement(By.xpath("//div[@class='t-section__container t-container']//div[@style='font-size: 46px;']"));

        if (yazi.getText().contains("Yazılım Test Uzmanı")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failled");
        }

        MyFunction.Wait(1);
        WebElement logoVarMi = driver.findElement(By.xpath("//img[@class='t228__imglogo ']"));
        Assert.assertTrue("logo gözüktü = ", logoVarMi.isDisplayed());


    }

    @Test
    public void Test1() {

        driver.get("https://techno.study/tr");

        WebElement detayliBilgi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5159634201663336291315']//a[@class='tn-atom']"));
        detayliBilgi.click();

        MyFunction.Wait(1);
        WebElement detayBilgi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459551622986986995']//a[@class='tn-atom']"));
        detayBilgi.click();

        MyFunction.Wait(1);
        WebElement yazi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459591527519905659']//div[@class='tn-atom']"));

        if (yazi.getText().contains("Android uygulama geliştirme")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failled");
        }

        MyFunction.Wait(1);
        WebElement logoVarMi = driver.findElement(By.xpath("//img[@class='t228__imglogo ']"));
        Assert.assertTrue("logo gözüktü = ", logoVarMi.isDisplayed());

    }

    @Test
    public void Test2() {

        driver.get("https://techno.study/tr");

        WebElement detayliBilgi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5159634201490289915734']//a[@class='tn-atom']"));
        detayliBilgi.click();

        MyFunction.Wait(1);
        WebElement detayBilgi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459551622986986995']//a[@class='tn-atom']"));
        detayBilgi.click();

        MyFunction.Wait(1);
        WebElement yazi = driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459591527519905659']//div[@class='tn-atom']"));

        if (yazi.getText().contains("Veri Analisti")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failled");
        }

        MyFunction.Wait(1);
        WebElement logoVarMi = driver.findElement(By.xpath("//img[@class='t228__imglogo ']"));
        Assert.assertTrue("logo gözüktü = ", logoVarMi.isDisplayed());


    }

    @Test
    public void ErdemTest() {

        driver.get("https://techno.study/tr/");

        MyFunction.Wait(1);
        WebElement kullanimSartlari = driver.findElement(By.cssSelector("#rec515963432 > div > div > div:nth-child(4) > div:nth-child(1) > div.t420__descr.t-descr.t-descr_xxs > ul > li:nth-child(1) > a"));
        kullanimSartlari.click();


    }
@Test
    public void TechnoStudyTestMsb() throws IOException {
        driver.get("https://techno.study/tr");
        MyFunction.Wait(1);
        WebElement kurslar = driver.findElement(By.xpath("//*[@class='t-menu__link-item t966__tm-link']"));
        Actions aksiyonlar = new Actions(driver);
        aksiyonlar.moveToElement(kurslar).build().perform();
        MyFunction.Wait(1);
        TakeScreenshot(driver);
        MyFunction.Wait(1);


        WebElement girisYap = driver.findElement(By.linkText("Campus Login"));
        girisYap.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[loading='eager']")));
        TakeScreenshot(driver);
    }
}