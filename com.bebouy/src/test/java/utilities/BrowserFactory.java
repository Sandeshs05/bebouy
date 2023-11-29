package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    static WebDriver driver;
    public static WebDriver browserSetup(String browserName, String URL)
    {
        if(browserName.equalsIgnoreCase("Chrome"))
        {
            //WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }
        else if(browserName.equalsIgnoreCase("Firefox"))
        {
            //WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("Edge"))
        {
            //WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else if(browserName.equalsIgnoreCase("Safari"))
        {
            //WebDriverManager.safaridriver().setup();
            driver=new SafariDriver();
        }
        else
        {
            System.out.println("Browser Do not Support");
        }
        driver.manage().window().maximize();
        driver.get(URL);
        return driver;
    }
}
