package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UI {
	
	
	
	public static void main(String...args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumee\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com"); //
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		//hover Dresses
        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(By.xpath("//div[@id='block_top_menu']"));
        
        
        
        ((JavascriptExecutor) driver).executeScript("document.getElementById('block_top_menu').style.display='block';");
        

        WebElement we = driver.findElement(By.xpath("//div[@id='block_top_menu']/..//*[@title='Dresses']"));
        //action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[@id='block_top_menu']/..//*[@title='Dresses']"))).click().build().perform();
        
        
        
        

	}

}
