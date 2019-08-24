package basic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		WebDriver fdriver=new FirefoxDriver();
		
		fdriver.get("https://accounts.google.com/signin");
		
		//fdriver.manage().window().maximize();
		
		//WebElement sign = fdriver.findElement(By.linkText("Sign in"));
		//sign.click();
		
		//fdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//fdriver.findElement(By.id("identifierId")).sendKeys("test.surtel@gmail.com"); 
		
		fdriver.findElement((By.id("identifierId"))).sendKeys("test.surtel@gmail.com");
		WebDriverWait wait=new WebDriverWait(fdriver, 20);               

        fdriver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();         
	//	fdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	//	WebElement passnextbtn=fdriver.findElement((By.xpath("//html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")));         
	//	passnextbtn.click(); 
		
	//	fdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
       // fdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);        

        fdriver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("12345");             
		
		//fdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//WebElement passnextbtn1=fdriver.findElement((By.xpath("//html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")));         
		//passnextbtn1.click(); 

	}

}
