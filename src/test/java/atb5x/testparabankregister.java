package atb5x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testparabankregister
{
    WebDriver driver;
    @BeforeMethod
    public void openbrowser() throws InterruptedException
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        Thread.sleep(2000);
    }

    @Test
    public void testparabankregister() throws InterruptedException
    {
        System.out.println("Url of the website"+driver.getCurrentUrl());
        Thread.sleep(1000);
        System.out.println("Title of website"+driver.getTitle());
        Thread.sleep(1000);

        WebElement registerpage= driver.findElement(By.xpath("//div[@id=\"loginPanel\"]/p/a[text()=\"Register\"]"));
        registerpage.click();
        Thread.sleep(2000);

        WebElement firstname= driver.findElement(By.xpath("//input[@id=\"customer.firstName\"]"));
        firstname.click();
        Thread.sleep(1000);
        firstname.sendKeys("Om");
        Thread.sleep(1500);

        WebElement lastname=driver.findElement(By.xpath("//input[@id=\"customer.lastName\"]"));
        lastname.click();
        Thread.sleep(1000);
        lastname.sendKeys("Panhale");
        Thread.sleep(1500);

        WebElement address=driver.findElement(By.xpath("//input[@id=\"customer.address.street\"]"));
        address.click();
        Thread.sleep(1000);
        address.sendKeys("CBS Nashik");
        Thread.sleep(1500);

        WebElement city=driver.findElement(By.xpath("//input[@id=\"customer.address.city\"]"));
        city.click();
        Thread.sleep(1000);
        city.sendKeys("Nashik");
        Thread.sleep(1500);

        WebElement state=driver.findElement(By.xpath("//input[@id=\"customer.address.state\"]"));
        state.click();
        Thread.sleep(1000);
        state.sendKeys("Maharashtra");
        Thread.sleep(2000);

        WebElement zipcode=driver.findElement(By.xpath("//input[@id=\"customer.address.zipCode\"]"));
        zipcode.click();
        Thread.sleep(1000);
        zipcode.sendKeys("422103");
        Thread.sleep(2000);

        WebElement phone=driver.findElement(By.xpath("//input[@id=\"customer.phoneNumber\"]"));
        phone.click();
        Thread.sleep(1000);
        phone.sendKeys("88888888888");
        Thread.sleep(2000);

        WebElement ssn=driver.findElement(By.xpath("//input[@id=\"customer.ssn\"]"));
        ssn.click();
        Thread.sleep(1000);
        ssn.sendKeys("1731");
        Thread.sleep(2000);

        WebElement username=driver.findElement(By.xpath("//input[@id=\"customer.username\"]"));
        username.click();
        Thread.sleep(1000);
        username.sendKeys("op007");
        Thread.sleep(2000);

        WebElement pass=driver.findElement(By.xpath("//input[@id=\"customer.password\"]"));
        pass.click();
        Thread.sleep(1000);
        pass.sendKeys("op@123");
        Thread.sleep(2000);

        WebElement cnfpass=driver.findElement(By.xpath("//input[@id=\"repeatedPassword\"]"));
        cnfpass.click();
        Thread.sleep(1000);
        cnfpass.sendKeys("op@123");
        Thread.sleep(2000);

        WebElement register=driver.findElement(By.xpath("//input[@value=\"Register\"]"));
        register.click();
        Thread.sleep(2000);

        WebElement cnfmessage=driver.findElement(By.xpath("//div[@id=\"rightPanel\"]/p[text()=\"Your account was created successfully. You are now logged in.\"]"));
        System.out.println(cnfmessage.getText());
        Thread.sleep(2000);

        WebElement logout=driver.findElement(By.xpath("//a[text()=\"Log Out\"]"));
        logout.click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closebrowser()
    {
        driver.close();
    }
}
