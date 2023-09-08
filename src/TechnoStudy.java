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
}
