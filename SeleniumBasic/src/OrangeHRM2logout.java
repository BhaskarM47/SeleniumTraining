import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2logout {

	public static void main(String[] args) {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//<after setting this ..log out is happening -remember this
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login page validation
		System.out.println("Login page validation:"+driver.getTitle().equals("OrangeHRM"));
		
		
		
		
		//operations
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
		
				
				//homepage validation
		
		String Homepagetitle=driver.getTitle();
				
		System.out.println("Homepage title:"+Homepagetitle);
				
		System.out.println("Homepage validation:"+Homepagetitle.contains("OrangeHRM"));
		
		
		WebElement welcomepaul=driver.findElement(By.id("welcome"));
		welcomepaul.click();
		
		driver.findElement(By.linkText("Logout")).click();
		
	
		//driver.close();
		
	}

}
