import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPage {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",ChromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual page title is:"+actualTitle);
		String ExpectedTitle="Facebook – log in or sign up";
		System.out.println("Expected Title is:"+ExpectedTitle);
		System.out.println("Validation of title:"+actualTitle.equals(ExpectedTitle));
		driver.navigate().to("https://www.google.com");

		driver.close();
				
	}

}
