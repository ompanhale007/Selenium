package atb5x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium003
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        System.out.println("Title of the website is-:"+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.quit();

    }
}
