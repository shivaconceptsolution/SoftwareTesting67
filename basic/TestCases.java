package basic;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCases {
	public static void main(String[] args) 
	{
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.efixman.com/");
		
		driver.manage().window().maximize();
		
		Select brand= new Select(driver.findElement((By.xpath("//*[@id='brandname']"))));
		brand.selectByVisibleText("APPLE");
		wait = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		By container = By.id("productname");
		wait.until(ExpectedConditions.presenceOfElementLocated(container));
		//Select device= new Select(driver.findElement((By.xpath("//*[@id=\'productname\']"))));
		//brand.selectByVisibleText("I Phone 6");
		
		WebElement search = driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[1]/div/div/div/div/div/div/form/div[3]/button/i"));
		search.click();
		
		WebElement alertmobile = driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div/div[2]/div/div/div/div/form/div/input"));
		alertmobile.sendKeys("9874564321");
		
		WebElement alertok = driver.findElement(By.xpath("//html/body/div[1]/div[3]/div/div/div[1]/button"));
		alertok.click();
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();

	}
}
