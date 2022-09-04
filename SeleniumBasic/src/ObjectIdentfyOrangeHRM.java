import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectIdentfyOrangeHRM {

	public static void main(String[] args) {
		String currworkindirect=System.getProperty("user.dir");
		String FoxPath=currworkindirect+("\\Executables\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver",FoxPath);
	    WebDriver driver=new FirefoxDriver(); 
	    //getting url
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    String actualTitle=driver.getTitle();
	    String expectedTitle=("OrangeHRM");
	    
	    System.out.println("actual title is:"+actualTitle);
	    System.out.println("expected title is:"+expectedTitle);
	    
	    System.out.println("Validation of title is:"+actualTitle.equals(expectedTitle));
	    System.out.println("Page title length is:"+actualTitle.length());
	    
	    String pageSrc=driver.getPageSource();
	    //System.out.println(pageSrc);
	    System.out.println("PageSource length:"+pageSrc.length());
	    
	   //operations
	    
	    
	    WebElement Usname=driver.findElement(By.id("txtUsername"));
	    Usname.sendKeys("admin");
	    
	    WebElement pswd=driver.findElement(By.id("txtPassword"));
	    pswd.sendKeys("admin123");
	    
	    WebElement loginbtn=driver.findElement(By.className("button"));
	    loginbtn.click();
	   //driver.close();
	   
		
		

	}

}
