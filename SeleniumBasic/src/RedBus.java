import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
	    WebDriver driver=new ChromeDriver();
	    
	 // maximize browser window
	 	driver.manage().window().maximize();
	 		// implicit wait
	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    //getting url
	    driver.get("https://www.redbus.in/");
	    
	    //Select journey from-to 
	    driver.findElement(By.id("src")).sendKeys("Pune");
	    driver.findElement(By.cssSelector("li[data-no='8']")).click();
	    
	    driver.findElement(By.cssSelector("input[id='dest']")).sendKeys("Sawantwadi");
	    driver.findElement(By.cssSelector(" li[data-no='1']")).click();
	    
	    //click on calendar next button and select date
	    driver.findElement(By.cssSelector("tbody td[class='next']")).click();
	    driver.findElement(By.xpath("//td[text()='7']")).click();
	    
	    //searchbutton buses
	    driver.findElement(By.id("search_btn")).click();
	    
	    //select departure time
	    driver.findElement(By.xpath("//label[contains(@for,'dtBefore 6 am')]")).click();
	    
	    //select bus type  AC
	    //driver.findElement(By.xpath("//label[contains(@for,'bt_SLEEPER')]")).click();
	    
	    driver.findElement(By.xpath("//label[contains(@for,'bt_AC')]")).click();
	    
	   //Fetch bus name
	WebElement busname= driver.findElement(By.cssSelector(" ul.bus-items .travels "));
	 System.out.println(busname.getText());
	   //bus fare
	 WebElement busfare=driver.findElement(By.cssSelector("ul.bus-items .seat-fare .fare>span"));
	 System.out.println(busfare.getText());
	    
	    
	    

	}

}
