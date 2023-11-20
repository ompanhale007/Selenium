package atb5x;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vwologintest
{

    WebDriver driver;

    @BeforeMethod
    public void openbrowser() throws InterruptedException
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.get("https://app.vwo.com/#/login");
    }

    @Owner("Om")
    @Test
    public void testnegative() throws InterruptedException
    {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(1500);

        WebElement email= driver.findElement(By.id("login-username"));
        email.click();
        Thread.sleep(1000);
        email.sendKeys("abc@gmail.com");
        Thread.sleep(1500);

        WebElement pass= driver.findElement(By.id("login-password"));
        pass.click();
        Thread.sleep(1000);
        pass.sendKeys("123");
        Thread.sleep(1500);

        WebElement signin= driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]"));
        signin.click();
        Thread.sleep(1500);

        WebElement errormessage= driver.findElement(By.id("js-login-btn"));
        System.out.println(errormessage.getText());

        Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");


    }

    @Owner("Om")
    @Test
    public void positivetestcase()
    {
        System.out.println("positive test case");
    }

    @AfterMethod
    public void closebrowser()
    {

    }
}
