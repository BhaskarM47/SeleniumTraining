import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTime2 {

	public static void main(String[] args) throws InterruptedException {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		//Explicit wait 
		Thread.sleep(2000);
		
		
		//Homepage validation//home page title will occur
				String homepageTitle=driver.getTitle();
				System.out.println("Homepage title is:"+homepageTitle);
				System.out.println("homepage validation:"+homepageTitle.contains("actiTIME - Enter Time-Track"));
				
				driver.findElement(By.className("logout")).click();
					
		
		
		
		//Identify username field
		WebElement usernameinputfield=driver.findElement(By.className("textField"));
		System.out.println("Usernamefield is displayed or not?-"+usernameinputfield.isDisplayed());
		//Identify password field
		WebElement passwordinputfield=driver.findElement(By.name("pwd"));
		System.out.println("passwordinputfield is displayed or not?-"+passwordinputfield.isDisplayed());
		
		//placeholder input field default value validation
		
		String defaultvalueinusernamefield=usernameinputfield.getAttribute("placeholder");
		System.out.println("Default value of username input field:"+defaultvalueinusernamefield);
		System.out.println("Default value validation for username input field status:"+defaultvalueinusernamefield.equals("Username"));
		
		String defaultvaluepasswordfield=passwordinputfield.getAttribute("placeholder");
		System.out.println("Default value of password input field:"+defaultvaluepasswordfield);
		System.out.println("Default value validation for password input field status:"+defaultvaluepasswordfield.equals("Password"));
		
		//identify keepLoggedInLabel 
		WebElement keepMelog=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("Keep me log in link is displayed or not?"+keepMelog.isDisplayed());
		System.out.println("Keep me log in checkbox is enabled or not?"+keepMelog.isEnabled());
		
		String CheckboxTextName=keepMelog.getText();
		System.out.println("Checkbox text name appearing as:"+CheckboxTextName);
		
	}

}
