import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
"D:\\AccelerationTesting\\Practiceprogram\\eclipseworkspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		FirefoxDriver fxd=new FirefoxDriver();
		fxd.get("https://www.google.com");
	}

}
