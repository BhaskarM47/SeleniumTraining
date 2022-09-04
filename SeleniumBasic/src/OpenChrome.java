import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	"D:\\AccelerationTesting\\Practiceprogram\\eclipseworkspace\\SeleniumBasic\\Executables\\chromedriver.exe");

		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
	}

}
