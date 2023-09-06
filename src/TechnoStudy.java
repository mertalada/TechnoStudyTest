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

        MyFunction.Wait(1);

        WebElement sdet = driver.findElement(By.xpath("//*[@id='rec482366375']/div/div/div[2]/div[2]/ul/li[1]/a"));
        sdet.click();

    //    WebElement leanmoreSDET = driver.findElement(By.xpath("//a[@href='#rec491903214'"));
    //    leanmoreSDET.click();

        MyFunction.Wait(1);

       WebElement android = driver.findElement(By.className("t-menu__link-item t966__tm-link"));
       android.click();

       WebElement a=driver.findElement(By.className("t966__menu-item-title t-name"));
       a.click();

    //   MyFunction.Wait(1);

    //   WebElement leanmoreANDROID = driver.findElement(By.className("tn-atom"));
    //   leanmoreANDROID.click();

       MyFunction.Wait(1);

       WebElement datasience = driver.findElement(By.xpath("//*[@class='t396']/div/div/div/div/div/div/a"));
       datasience.click();

    //   MyFunction.Wait(1);

    //   WebElement leanmoreDATA = driver.findElement(By.className("tn-atom"));
    //   leanmoreDATA.click();

       MyFunction.Wait(1);

       WebElement master = driver.findElement(By.xpath("//*[@id=\"rec491928654\"]/div/div/div[2]/div[2]/ul/li[4]/a"));
       master.click();

    //   MyFunction.Wait(1);

    //   WebElement leanmoreMASTER = driver.findElement(By.className("tn-atom"));
    //   leanmoreMASTER.click();
    }
}
