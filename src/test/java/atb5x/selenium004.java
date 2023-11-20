package atb5x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium004
{
    public static void main(String[] args) throws InterruptedException {
        /*
        1.Open the browser maximize it get url
        2.get title and current url of page
        3.minimize the window
        4.Close the browser
        5.add sleep for 2 sec

         */

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(2000);
        System.out.println("Title of the website is-:"+driver.getTitle());
        System.out.println("Current Url of the website is-:"+driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.close();

    }
}
