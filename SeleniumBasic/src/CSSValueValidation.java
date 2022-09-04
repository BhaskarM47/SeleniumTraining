import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValueValidation {

	public static void main(String[] args) {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
	    WebDriver driver=new ChromeDriver();
	    
	 // maximize browser window
	 	driver.manage().window().maximize();
	 		// implicit wait
	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    //getting url
	    driver.get("https://courses.letskodeit.com/practice");
	    
	    //PracticePage header validation
	    WebElement PracticePageHeader=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
	    System.out.println("PracticePage header font-weight:"+PracticePageHeader.getCssValue("font-weight"));
	    System.out.println("PracticePage header color :"+PracticePageHeader.getCssValue("color"));
	    
	    //scrolldown apple option validation
	    WebElement scrolldwnapple=driver.findElement(By.xpath("//option[@value='apple']"));
	    System.out.println("Scrolldown option apple background color :"+scrolldwnapple.getCssValue("background-color"));
	    System.out.println("Scrolldown option apple color :"+scrolldwnapple.getCssValue("color"));
	    
	    //position validation pending
	    
	    //open window button validation
	    WebElement openwindowbtn=driver.findElement(By.cssSelector("button[id='openwindow']"));
	    System.out.println("Open window button background color :"+openwindowbtn.getCssValue("background-color"));
	    System.out.println("Open window button color :"+openwindowbtn.getCssValue("color"));

	
	
	
	
	}
	

}
