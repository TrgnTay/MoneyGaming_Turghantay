package come.moneygaming.tests;

import come.moneygaming.utilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeMethod
    public void setUp(){
WebDriver driver= utilities.WebDriverFactory.getDriver("chrome");

    }


    @Test
    public void test1() {


    }
@AfterMethod
    public void tearDown(){



}


}
