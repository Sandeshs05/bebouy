package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage {


    WebDriver driver;
    public loginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this.driver);
    }

}