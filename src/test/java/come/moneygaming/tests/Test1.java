package come.moneygaming.tests;

import come.moneygaming.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
driver= utilities.WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();

driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }


    @Test
    public void test1() throws InterruptedException {  //SIGNATURE
        WebElement nameBox= driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Mike");
        WebElement surnameBox= driver.findElement(By.xpath("//input[@name='map(lastName)']"));
surnameBox.sendKeys("smith");
Thread.sleep(5000);
    }


@AfterMethod
    public void tearDown(){



}


}
