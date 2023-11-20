package atb5x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class unifyagegroup {

        WebDriver driver;
        WebDriverWait wait;

        @BeforeTest
        public void openbrowser()
        {
            driver=new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
            driver.get("https://impl-unified.etpgroup.sg/");

            //wait=new WebDriverWait(driver,Duration.ofSeconds(30));
            //wait.until(ExpectedConditions.urlToBe("https://impl-unified.etpgroup.sg/)"));

        }

        @Test
        public void testpostivetest() throws InterruptedException {

            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
            //wait=new WebDriverWait(driver,Duration.ofSeconds(5));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id=\"txtLoginId\"")));
            //Thread.sleep(2000);

            WebElement email=driver.findElement(By.xpath("//input[@id=\"txtLoginId\"]"));
            email.sendKeys("om.panhale@etpgroup.com");

            WebElement pass= driver.findElement(By.id("inputPassword"));
            pass.sendKeys("Etp@1234567");

            WebElement login= driver.findElement(By.id("btnLogin"));
            login.click();

            wait=new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Sylphy Test']")));

            WebElement companygroup= driver.findElement(By.xpath("//p[normalize-space()='Sylphy Test']"));
            companygroup.click();

            wait=new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\" Welcome back  Om Panhale!\"]")));

            WebElement welcomemessage= driver.findElement(By.xpath("//p[text()=\" Welcome back  Om Panhale!\"]"));
            System.out.println(welcomemessage.getText());

            WebElement humburger= driver.findElement(By.xpath("//div[@id=\"nav-icon1\"]"));

            Actions act=new Actions(driver);
            act.moveToElement(humburger).click().perform();

            wait=new WebDriverWait(driver,Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=\"CRM \"]")));


            WebElement menuclick= driver.findElement(By.xpath("//span[text()=\"CRM \"]"));
            menuclick.click();

            WebElement submenuclick= driver.findElement(By.xpath("//a[text()=\"Age Group Definition\"]"));
            submenuclick.click();

            wait=new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\" Age Group \"]")));

            WebElement agegroup= driver.findElement(By.xpath("//a[text()=\" Age Group \"]"));
            System.out.println(agegroup.getText());

            WebElement addagegroup= driver.findElement(By.xpath("//span[text()=\"ADD AGE GROUP\"]"));
            addagegroup.click();

            WebElement fromage= driver.findElement(By.id("fromAge"));
            fromage.sendKeys("1");

            WebElement toage= driver.findElement(By.id("toAge"));
            toage.sendKeys("9");

            WebElement agegroupname= driver.findElement(By.id("ageGrpName"));
            agegroupname.sendKeys("Small Child");

            WebElement addbutton= driver.findElement(By.xpath("//button[text()=\"ADD\"]"));
            addbutton.click();
            //just want to see whether changes is commit into git or not
        }

        /*@AfterTest
        public void closebrowser()
        {
            driver.close();

        }*/

}
