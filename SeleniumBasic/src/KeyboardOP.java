import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOP {

	public static void main(String[] args) throws InterruptedException {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type first name as admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all
		//in first name field use ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));//copy the content
		//in last name field use ctrl+v
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
					.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
		.sendKeys(Keys.TAB);
					
					//paste the first name in the last name field
		Thread.sleep(2000);
		//Enter address
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Dist-Sindhudurga,Tal-Sawantwadi,Maharashtra,India");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7686845680");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@type='radio']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("absjk");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("absjk");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		
		
		
		
		
	}

}
