import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.driver;


public class leadcodes {
    @Test
    public static void programs(){
        driver.get("https://techno.study");

        MyFunction.Wait(2);

        WebElement sdet=driver.findElement(By.xpath("//*[@id='rec482366375']/div/div/div[2]/div[2]/ul/li[1]/a"));
        sdet.click();

        MyFunction.Wait(2);

        driver.get("https://techno.study");

        WebElement android=driver.findElement(By.xpath("//*[@id='rec482366375']/div/div/div[2]/div[2]/ul/li[2]/a"));
        android.click();

        MyFunction.Wait(2);

        driver.get("https://techno.study");

        WebElement data=driver.findElement(By.xpath("//*[@id='rec482366375']/div/div/div[2]/div[2]/ul/li[3]/a"));
        data.click();

        MyFunction.Wait(2);

        driver.get("https://techno.study");

        WebElement master=driver.findElement(By.xpath("//*[@id='rec482366375']/div/div/div[2]/div[2]/ul/li[4]/a"));
        TechnoStudy.aksiyonlar.moveToElement(master).click().build();

        MyFunction.Wait(2);

    }
    @Test
    public static void kurslar(){
        driver.get("https://techno.study/tr");

        MyFunction.Wait(2);

        WebElement sdet=driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[2]/div[2]/ul/li[1]/a"));
        sdet.click();

        MyFunction.Wait(2);

        WebElement android=driver.findElement(By.xpath("//*[@id='rec516096137']/div/div/div[2]/div[2]/ul/li[2]/a"));
        android.click();

        MyFunction.Wait(2);

        WebElement data=driver.findElement(By.xpath("//*[@id='rec516096782']/div/div/div[2]/div[2]/ul/li[3]/a"));
        data.click();

        MyFunction.Wait(2);

        WebElement master=driver.findElement(By.xpath("//*[@id='rec516097518']/div/div/div[2]/div[2]/ul/li[4]/a"));
        TechnoStudy.aksiyonlar.moveToElement(master).click().build();

        MyFunction.Wait(2);

    }
}
