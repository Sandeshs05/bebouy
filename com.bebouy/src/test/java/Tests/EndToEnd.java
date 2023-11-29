package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Set;

public class EndToEnd {
    @Test
    public void Testcase() throws InterruptedException {
        //WebDriverManager.edgedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://157.241.30.5:3001/#/login");
        driver.findElement(By.name("userName")).sendKeys("mtsadmin@mts.com");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Merchant Onboarding']")).click();
        driver.findElement(By.xpath("//a[.='Merchant']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[.='Add Merchant']")).click();
        driver.findElement(By.id("name")).sendKeys("P   SP");
        driver.findElement(By.id("isPsp")).click();
        Assert.assertEquals(driver.findElement(By.id("isPsp")).isDisplayed(), true);
        driver.close();
    }
}
