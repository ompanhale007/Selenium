package atb5x;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class selenium009
{
    //App.vwo.com Account Creation using testng
    EdgeDriver driver;
    @BeforeMethod
    public void openbrowser() throws InterruptedException {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");
        Thread.sleep(2000);
    }

    @Owner("Om")
    @Test
    public void appvwoaccountcreate() throws InterruptedException {
        System.out.println("Current Url of the website is-:"+driver.getCurrentUrl());
        System.out.println("Title of the website is-:"+driver.getTitle());

        WebElement freetrial=driver.findElement(By.xpath("//a[@data-qa=\"bericafeqo\"]"));
        freetrial.click();

        Thread.sleep(2000);

        WebElement workemail=driver.findElement(By.xpath("//input[@id=\"page-v1-step1-email\"]"));
        workemail.click();
        Thread.sleep(2000);
        workemail.sendKeys("ompanhale007@gmail.com");

        Thread.sleep(1000);

        //Click on the free trial account
        driver.findElement(By.xpath("//button[text()=\"create a free trial account\"]")).click();
        Thread.sleep(2000);

        WebElement firstname=driver.findElement(By.xpath("//input[@data-qa=\"page-su-v1-fname\"]"));
        firstname.click();
        Thread.sleep(1000);
        firstname.sendKeys("Om");

        Thread.sleep(1000);
        WebElement lastname=driver.findElement(By.xpath("//input[@data-qa=\"page-su-v1-lname\"]"));
        lastname.click();
        Thread.sleep(1000);
        lastname.sendKeys("Panhale");

        Thread.sleep(1500);
        WebElement phonenumber=driver.findElement(By.xpath("//input[@data-qa=\"page-su-v1-pnumber\"]"));
        phonenumber.click();
        Thread.sleep(1000);
        phonenumber.sendKeys("9405604290");
        Thread.sleep(2000);

        WebElement password= driver.findElement(By.xpath("//input[@data-qa=\"page-su-v1-pwd\"]"));
        password.click();
        Thread.sleep(1500);
        password.sendKeys("Om@123456");
        Thread.sleep(2000);
        password.findElement(By.xpath("//span[text()=\"show\"]")).click();
        Thread.sleep(1500);

        WebElement createaccount= driver.findElement(By.xpath("//button[text()=\"create account\"]"));
        createaccount.click();

        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[@data-qa=\"btn-next\"]")).click();



    }
    @AfterMethod
    public  void closebrowser()
    {
           driver.close();


    }
}
