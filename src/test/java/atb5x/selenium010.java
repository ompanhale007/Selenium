package atb5x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import javax.swing.*;
import java.util.List;

public class selenium010
{
    //Cura  Health Service Appointment Website
    EdgeDriver driver;
    @BeforeMethod
    public void openbrowser() throws InterruptedException
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);
    }

    @Test
    public void curaappointment() throws InterruptedException
    {
        System.out.println("Url of the website is-:"+driver.getCurrentUrl());
        System.out.println("Title of the website is-:"+driver.getTitle());

        WebElement appoinment= driver.findElement(By.xpath("//a[contains(@id,\"btn-make\")]"));
        appoinment.click();
        Thread.sleep(2000);

        WebElement Username= driver.findElement(By.xpath("//input[starts-with(@id,\"txt-user\")]"));
        Username.click();
        Thread.sleep(1500);
        Username.sendKeys("John Doe");
        Thread.sleep(1500);

        WebElement Password= driver.findElement(By.xpath("//input[contains(@id,\"txt-pas\")]"));
        Password.click();
        Thread.sleep(1500);
        Password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(1500);

        WebElement login= driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        Thread.sleep(2000);
        login.click();

        WebElement Facility= driver.findElement(By.id("combo_facility"));

        Select select=new Select(Facility);

        select.selectByIndex(1);
        Thread.sleep(2000);
        //select.selectByValue("Seoul CURA Healthcare Center");
        //Thread.sleep(2000);
        //select.selectByVisibleText("Tokyo CURA Healthcare Center");

        Thread.sleep(1500);
        WebElement Apply= driver.findElement(By.id("chk_hospotal_readmission"));
        Apply.click();
        Thread.sleep(1500);

        WebElement Hcprogram= driver.findElement(By.id("radio_program_none"));
        Hcprogram.click();
        Thread.sleep(1500);

        WebElement visitdate= driver.findElement(By.id("txt_visit_date"));
        visitdate.click();
        Thread.sleep(1500);
        visitdate.sendKeys("17/03/1998");
        Thread.sleep(1500);

        WebElement comment= driver.findElement(By.id("txt_comment"));
        comment.click();
        comment.sendKeys("Appointment is book by om panhale i am having cold andd cough plz confrim by Appointment ASAP");
        Thread.sleep(2000);

        WebElement bookappointment= driver.findElement(By.id("btn-book-appointment"));
        bookappointment.click();

        Thread.sleep(2000);
        WebElement message= driver.findElement(By.xpath("//h2[text()=\"Appointment Confirmation\"]"));
        System.out.println("Conformation message-: "+message.getText());
        Thread.sleep(2000);

        //After conformation page then Again Come Back to Home page
        WebElement homepage= driver.findElement(By.xpath("//a[text()=\"Go to Homepage\"]"));
        homepage.click();
        Thread.sleep(2000);

        //After Coming to Home Page then Logout account and close the browser
        WebElement menu= driver.findElement(By.id("menu-toggle"));
        menu.click();
        Thread.sleep(2000);

        WebElement logout= driver.findElement(By.xpath("//a[text()=\"Logout\"]"));
        logout.click();
        System.out.println("Your Account Has Successfully logout");
        Thread.sleep(2000);


    }
    @AfterMethod
    public void closebrowser()
    {
        driver.close();
    }
}
