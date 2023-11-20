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

public class wait1
{
    WebDriver driver;
    @BeforeTest
    public void openbrowser()
    {
         driver=new EdgeDriver();
         driver.manage().window().maximize();
         driver.get("https://app.vwo.com/#/login");
    }

    @Test
    public void negativetest()
    {
        System.out.println(driver.getTitle());
        System.out.println("*************************");
        System.out.println(driver.getCurrentUrl());

        WebElement email= driver.findElement(By.id("login-username"));
        email.sendKeys("ompanhale007@gmail.com");

        WebElement pass= driver.findElement(By.id("login-password"));
        pass.sendKeys("abc@1234");

        WebElement signin= driver.findElement(By.id("js-login-btn"));
        signin.click();

        WebElement Error_msg=driver.findElement(By.id("js-notification-box-msg"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(Error_msg,"Your email, password, IP address or location did not match"));

        System.out.println(Error_msg.getText());

    }

    @AfterTest
    public void closebrowser()
    {
        driver.close();

    }
}
