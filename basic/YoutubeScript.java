package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/shivaconceptsolution");
        driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/paper-tab[3]/div")).click();
        driver.findElement(By.xpath("//*[text()='Selenium Tutorial']")).click();; 
        WebElement ele = driver.findElement(By.partialLinkText("Selenium"));
		ele.click();
        //  driver.findElement(By.xpath("//a[contains(text(),'Selenium Tutorial')]")).click(); 
       // driver.findElement(By.xpath("//*[@id=\"view-more\"]")).click(); 
      //  WebElement ele=driver.findElement(By.cssSelector("h3.ytd-grid-playlist-renderer"));
        //WebElement ele=driver.findElement(By.cssSelector("h3.a[title='Selenium Tutorial']"));
       // driver.navigate().to("https://www.youtube.com/playlist?list=PLDSXZnDE8NYXJ8HtczrQ1mDBMKboF5arI");
        //ele.click();
	}

}
