import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utility.BaseDriver.driver;

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

        WebElement basvur=driver.findElement(By.xpath("//a[@class='tn-atom js-click-zero-stat']"));
        basvur.click();


        WebElement adsoyad=driver.findElement(By.xpath("//input[@placeholder='Adı Soyadı']"));
        adsoyad.sendKeys("test test");


        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("test_sdet0106@gmail.com");

        WebElement telephone=driver.findElement(By.xpath("//input[@type='tel']"));
        telephone.sendKeys("9999999999");

        WebElement ulke=driver.findElement(By.id("sb-1667664755026"));
        ulke.sendKeys("Andorra");

        WebElement kurs=driver.findElement(By.name("course"));
        kurs.sendKeys("SDET Türkçe");

        WebElement nerdenduydun=driver.findElement(By.name("survey"));
        nerdenduydun.sendKeys("Başka");

        WebElement kutu=driver.findElement(By.cssSelector("[class='t-checkbox__indicator']"));
        kutu.click();

        WebElement gonder=driver.findElement(By.xpath("//button[@type='submit']"));
        gonder.click();

    }
}
