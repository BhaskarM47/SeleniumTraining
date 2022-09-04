import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthSequenceValidation {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
        
        WebElement monthdropdown=driver.findElement(By.cssSelector("select[placeholder='Month']"));
        Select selectmonth=new Select(monthdropdown);
        List<WebElement> options=selectmonth.getOptions();
    	
        List OriginalListmonth = new ArrayList();
		for (WebElement e : options) {
			OriginalListmonth.add(e.getText());
		}
			
			OriginalListmonth.remove("Month");
			 System.out.println("Options in dropdown-Original MonthList: " +OriginalListmonth);
			 
			  List templistmonth = new ArrayList(OriginalListmonth);
		        System.out.println("Temp List: " + templistmonth);
		        
		        
		        if(OriginalListmonth.equals(templistmonth)) {
		            
		            System.out.println(" month List is in sequence");
		            
		        }else {
		            
		            System.out.println("month List is not in sequence");
		        }
		        
	}

}
