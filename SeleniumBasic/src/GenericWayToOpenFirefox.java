import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefox {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String FirefoxExePath=currentWorkingDir+"\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver",FirefoxExePath);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Google";
		
		System.out.println("Actual google page title is:"+ActualTitle);
		System.out.println("Expected google page title is:"+ExpectedTitle);
		System.out.println("Google title validation:"+ActualTitle.equals(ExpectedTitle));
		
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://www.google.com";
		
		System.out.println("Actual google Url:"+ActualUrl);
		System.out.println("Expected google Url:"+ExpectedUrl);
		System.out.println("Google Url validation:"+ActualUrl.contains(ExpectedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page source content length is:"+pageSource.length());
		driver.close();

	}

}
