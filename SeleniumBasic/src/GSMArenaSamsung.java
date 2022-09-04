import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArenaSamsung {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.gsmarena.com/");
		//Thread.sleep(2000);
		//click on the samsung phone link present on the phone finder
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
		
		List<WebElement> deviceCount=driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
		System.out.println("device count:"+deviceCount.size());
		
		for(int i=0;i<deviceCount.size();i++) {
			System.out.println(deviceCount.get(i).getText());
	}

}
}
