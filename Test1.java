import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
      
	public static void main(String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
		
		//driver.findElement(By.name("emailid")).sendKeys(Keys.ENTER);
		 
		//driver.findElement(By.id("message9")).sendKeys(Keys.ENTER);
		
		
		
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		
		
		driver.manage().window().maximize();	
		
            
	        
		   //Thread.sleep(5000);
		   //driver.close();
	}
}
