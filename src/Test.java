import Utility.BaseDriver;
import Utility.MyFunction;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import java.io.IOException;



public class Test extends BaseDriver {
@org.testng.annotations.Test
    public void TechnoStudyTest() throws IOException {
        driver.get("https://techno.study/tr");
    MyFunction.Wait(1);
    WebElement kurslar = driver.findElement(By.xpath("//*[@class='t-menu__link-item t966__tm-link']"));
    Actions aksiyonlar = new Actions(driver);
    aksiyonlar.moveToElement(kurslar).build().perform();
    MyFunction.Wait(1);
    TakeScreenshot(driver);
    MyFunction.Wait(1);



    WebElement girisYap=driver.findElement(By.linkText("Campus Login"));
    girisYap.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[loading='eager']")));
    TakeScreenshot(driver);
/*
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement kurslarPenceresi = driver.findElement(By.xpath("//*[@class='t966__content']"));
    js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", kurslarPenceresi);
    MyFunction.Wait(1);


    WebElement SDETButonu=driver.findElement(By.xpath("(//*[@class='t966__menu-item-title t-name'])[1]"));
    SDETButonu.click();
    MyFunction.Wait(1);
    String SDETLinki="https://techno.study/tr/sdet";
    MyFunction.Wait(1);
    Assert.assertTrue(driver.getCurrentUrl().equals(SDETLinki));


    MyFunction.Wait(1);
    aksiyonlar.moveToElement(kurslar).build().perform();
    WebElement AndroidBtn=driver.findElement(By.xpath("//*[@field='li_title__1607692276801']"));
    MyFunction.Wait(1);
    AndroidBtn.click();
    MyFunction.Wait(1);
    String AndroidLink="https://techno.study/tr/androidapp";
    Assert.assertTrue(driver.getCurrentUrl().equals(AndroidLink)); ;



    aksiyonlar.moveToElement(kurslar).build().perform();
    WebElement veriBtn=driver.findElement(By.xpath("//*[@field='li_title__1607692281884']"));
    aksiyonlar.moveToElement(veriBtn).build().perform();
    MyFunction.Wait(1);
    veriBtn.click();
    MyFunction.Wait(1);
    String veriLink="https://techno.study/tr/data";
    Assert.assertTrue(driver.getCurrentUrl().equals(veriLink));


    aksiyonlar.moveToElement(kurslar).build().perform();
    WebElement jobBtn=driver.findElement(By.xpath("//*[@field='li_title__1663426353172']"));
    aksiyonlar.moveToElement(jobBtn).build().perform();
    MyFunction.Wait(1);
    jobBtn.click();
    MyFunction.Wait(1);
    String jobLink="https://techno.study/jobcenter";
    Assert.assertTrue(driver.getCurrentUrl().equals(jobLink));

*/



}
}
