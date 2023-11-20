package atb5x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class wait2
{
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void openbrowser()
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
    }

    @Test
    public void  testpostivetest()
    {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement email= driver.findElement(By.id("login-username"));
        email.sendKeys("ompanhale007@gmail.com");

        WebElement pass= driver.findElement(By.id("login-password"));
        pass.sendKeys("Om@123456");

        WebElement signin=driver.findElement(By.id("js-login-btn"));
        signin.click();

        wait=new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.textToBe(By.xpath("//span[@data-qa=\"lufexuloga\"]"), "Om Panhale"));

        WebElement username= driver.findElement(By.xpath("//span[@data-qa=\"lufexuloga\"]"));
        System.out.println(username.getText());

    }
    @AfterTest
    public void closebrowser()
    {
        driver.close();
    }
}
