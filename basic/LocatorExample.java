package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://shivaconceptsolution.com/test.html");;
		//WebElement ele = driver.findElement(By.id("txt1"));
		//ele.sendKeys("shivaconcept");
		//WebElement ele = driver.findElement(By.name("txt2"));
		//ele.sendKeys("shivaconcept");
		//WebElement ele = driver.findElement(By.linkText("Click"));
		//ele.click();
		//WebElement ele = driver.findElement(By.partialLinkText("shivaconcept"));
		//ele.click();
		//WebElement ele = driver.findElement(By.cssSelector("input.abc"));
	   // ele.sendKeys("welcome ");
	   // WebElement ele1 = driver.findElement(By.cssSelector("input#b"));
	   // ele1.sendKeys("welcome2 ");
		// WebElement ele1 = driver.findElement(By.cssSelector("input[value='click']"));
		// ele1.sendKeys("welcome2 ");
		//WebElement ele1 = driver.findElement(By.cssSelector("input.abc[value='hi']"));
	    //ele1.sendKeys("welcome3");
		
		//WebElement ele1 = driver.findElement(By.cssSelector("input[value='FeMale']"));
	   // ele1.click();
	  //  WebElement ele1 = driver.findElement(By.cssSelector("p.contains('hi')"));
	   // System.out.print(ele1.getText());
			
		
		
		

	}

}
