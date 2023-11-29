package pageObjects;

import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.confgReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
public class BaseTest {

    public WebDriver driver;
    public confgReader prop;


    @BeforeSuite
    public void setUpSuite()
    {
        prop=new confgReader();

    }


    @BeforeMethod(alwaysRun = true)
    public void startApplication()
    {
        driver = BrowserFactory.browserSetup(prop.getBrowser(), prop.getURL());
    }
    @AfterMethod(alwaysRun = true)
    public void closeApplication()
    {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    public void login()
    {
       // new LoginPage(driver).login(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
    }
}
