import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(600,650));
	    driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement forgetpass=driver.findElement(By.linkText("Forgot your password?"));
		forgetpass.click();
		System.out.println("foget your password link url:"+driver.getCurrentUrl());
		
	//come back to previous page
		
		driver.navigate().back();
		System.out.println("Login page url:"+driver.getCurrentUrl());
		
		 //go back to next page again
		driver.navigate().forward();
		System.out.println("forget your password url:"+driver.getCurrentUrl());
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com");

	}

}
