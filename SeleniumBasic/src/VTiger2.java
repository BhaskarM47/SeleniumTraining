import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger2 {

	public static void main(String[] args) throws InterruptedException {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement usernameinfield=driver.findElement(By.id("username"));
		usernameinfield.clear();
		usernameinfield.sendKeys("admin");
		
		WebElement passwordinfield=driver.findElement(By.id("password"));
		passwordinfield.clear();
		passwordinfield.sendKeys("Test@123");
		
		WebElement loginbutton=driver.findElement(By.className("button"));
		loginbutton.click();
		
		//widget operations
		WebElement widget=driver.findElement(By.className("btn-group"));
		widget.click();
		
		
		WebElement element1=driver.findElement(By.cssSelector("a[data-name='History']"));//[AttributeName=AttributeValue]
																						//[PropertyName=PropertyValue]
		element1.click();
		
		
		driver.findElement(By.className("btn-group"));//everytime u need to click on widget button to select any widgetproperty
		widget.click();
		WebElement element2=driver.findElement(By.cssSelector("a[data-name='TopPotentials']"));
	    element2.click();
	
	    driver.findElement(By.className("btn-group"));
		widget.click();
		WebElement element3=driver.findElement(By.cssSelector("a[data-name='KeyMetrics']"));
		element3.click();
		 
		Thread.sleep(2000);
		
		//Remove added widget elements
		//1 history
		driver.findElement(By.cssSelector("i[class='fa fa-remove']")).click();
		WebElement remove1=driver.findElement(By.cssSelector("button[class='btn confirm-box-ok confirm-box-btn-pad btn-primary']"));
		remove1.click();
		
		driver.navigate().refresh();
		
		//2
		driver.findElement(By.cssSelector("a[class='widget']")).click();
	WebElement remove2=driver.findElement(By.cssSelector("button[class='btn confirm-box-ok confirm-box-btn-pad btn-primary']"));
	remove2.click();
		
		driver.navigate().refresh();
		//3
		driver.findElement(By.cssSelector("a[class='widget']")).click();
		WebElement remove3=driver.findElement(By.cssSelector("button[class='btn confirm-box-ok confirm-box-btn-pad btn-primary']"));
		remove3.click();
		
		
		WebElement logoutpersonimage=driver.findElement(By.cssSelector(".userName"));
		logoutpersonimage.click();
		
		//driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		

	}

}
