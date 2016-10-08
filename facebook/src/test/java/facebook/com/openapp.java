package facebook.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class openapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://SeleniumSoftwares//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        // driver.get("https://www.yahoo.com/");
         String urlname=driver.getCurrentUrl();
         System.out.println(urlname);
         
         driver.findElement(By.name("email")).sendKeys("toricha79@yahoo.co.in");
         driver.findElement(By.name("pass")).sendKeys("");
         driver.findElement(By.id("u_0_n")).click();
       
         driver.findElement(By.name("email")).clear();
         driver.findElement(By.name("pass")).clear();
         
         
         //driver.findElement(By.linkText("Create a Page")).click();
         
       /*  String s1=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/h2")).getText();
         System.out.println(s1);*/
         
         
         
         //driver.quit();
	}

}
