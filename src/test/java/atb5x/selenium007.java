package atb5x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium007
{
    //App.vwo.com Script To Create an Account
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\"Start a free trial\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-step1-email")).sendKeys("ompanhale001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"create a free trial account\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("page-v1-fname")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-fname")).sendKeys("Om");
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-lname")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-lname")).sendKeys("Panhale");
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-pnumber")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-pnumber")).sendKeys("8010569576");
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-pwd")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("page-v1-pwd")).sendKeys("Om@12345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"create account\"]")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
