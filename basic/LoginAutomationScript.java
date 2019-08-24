package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement txtuser = driver.findElement(By.name("userName"));
		txtuser.sendKeys("tutorial");
		WebElement txtpass = driver.findElement(By.name("password"));
        txtpass.sendKeys("tutorial");
        WebElement btn = driver.findElement(By.name("login"));
        btn.click();
        
	}

}
