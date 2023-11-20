package atb5x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium5
{
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Open the browser maximize it get url
        2.get title and current url of page
        3.forward it to google .com
        4.Then Come back to app.Vwo.com
        5.Then Refresh the browser
        5.add sleep for 2 sec
         */
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(2000);
        System.out.println("Title of the Website is-:"+driver.getTitle());
        System.out.println("Current url of the website is-:"+driver.getCurrentUrl());
        driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
        Thread.sleep(2000);
        System.out.println("Title of website is-:"+driver.getTitle());
        System.out.println("Current Url of the Website-:"+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(1500);
        driver.close();
    }
}
