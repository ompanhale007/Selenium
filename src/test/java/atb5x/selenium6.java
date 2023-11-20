package atb5x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium6
{
    /*
        1.Open the browser maximize it get url app.Vwo.com
        2.get title and current url of page
        3.get size of the page
        4.get postion of the page
        5.Then close the browser

         */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        Thread.sleep(2000);
        System.out.println("Title of the Website is-:"+driver.getTitle());
        System.out.println("Current url of the website is-:"+driver.getCurrentUrl());
        Thread.sleep(2000);
        System.out.println("Current Size of the browser is-:"+driver.manage().window().getSize());
        Thread.sleep(1000);
        System.out.println("Current Postion Of the browser is-:"+driver.manage().window().getPosition());
        Thread.sleep(1500);
        driver.close();
    }
}
