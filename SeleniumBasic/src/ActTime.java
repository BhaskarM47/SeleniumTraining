import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActTime {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		System.out.println("Actual page title is: "+actualTitle);
		System.out.println("Expected page title is: "+expectedTitle);
		System.out.println("Page title validation: "+actualTitle.equals(expectedTitle));
		System.out.println("Page title length:"+actualTitle.length());
		
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://demo.actitime.com";
		
		System.out.println("Actual Url:"+ActualUrl);
		System.out.println("Expected Url:"+ExpectedUrl);
		System.out.println("Url validation:"+ActualUrl.contains(ExpectedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page source content length is:"+pageSource.length());
		//driver.close();

		
		
		
		
		
		
		
	}

}
