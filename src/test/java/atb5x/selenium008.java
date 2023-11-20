package atb5x;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium008
{
    EdgeDriver driver;
    @BeforeTest
    public void openbrowser()
    {
          driver=new EdgeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.vwo.com/");
    }

    @Owner("Om")
    @Test
    public void negativetestcase() throws InterruptedException
    {
        //driver.manage().window().maximize();
        Thread.sleep(2000);

        System.out.println("Current Url of the Website is-:"+driver.getCurrentUrl());

        System.out.println("Title of the website is-:"+driver.getTitle());

        driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id=\"login-password\"]")).sendKeys("123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]")).click();
        Thread.sleep(2000);

        WebElement errormessage=driver.findElement(By.xpath("//div[@id=\"js-notification-box-msg\"]"));
        System.out.println(errormessage.getText());

        Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(2000);
    }

    @AfterTest
    public void closebrowser()
    {
        driver.close();
    }

}
