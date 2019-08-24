package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://shivaconceptsolution.com/test.html");;
       // driver.findElement(By.xpath("//input[@id='txt1']")).sendKeys("XPATH");
		//driver.findElement(By.xpath("//*[contains(@value,'FeM')]")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).click();
		//driver.findElement(By.xpath("//*[@type='text' or @class='abc']")).sendKeys("First TEXT");;
	//	driver.findElement(By.xpath("//*[@type='text' and @class='abc']")).sendKeys("First TEXT");
		driver.findElement(By.xpath("//input[starts-with(@class,'a')]")).sendKeys("Class TEXT");
	
	}

}
