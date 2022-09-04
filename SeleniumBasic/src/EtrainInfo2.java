import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EtrainInfo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize browser window
		 	driver.manage().window().maximize();
		 		// implicit wait
		 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //getting url
		    driver.get("https://etrain.info/in");
		    
		    //Select journey from-to 
		    driver.findElement(By.id("tbsfi1")).sendKeys("Mumbai");
		    driver.findElement(By.cssSelector(" #suggest_row3")).click();
		    
		    driver.findElement(By.id("tbsfi3")).sendKeys("Pune");
		    driver.findElement(By.cssSelector(" #suggest_row1")).click();
		    
		    
	       //select quota
		    WebElement QuotaDropdown=driver.findElement(By.id("tbsfi5"));
		    Select selectoption=new Select (QuotaDropdown);
		    selectoption.selectByIndex(1);
		    
		    //calendar click
		    driver.findElement(By.id("tbsfi4")).click();
		    driver.findElement(By.cssSelector("div.dpdd  input[class='nav']")).click();
		    //select date
		    driver.findElement(By.cssSelector("tbody td input[value='7']")).click();
		    
		    //get trains
		    driver.findElement(By.id("tbssbmtbtn")).click();
		    
		 
		    
	}

}
