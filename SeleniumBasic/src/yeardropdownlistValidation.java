import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yeardropdownlistValidation {

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
		//date of birth year validation
        
        WebElement yeardropdown=driver.findElement(By.id("yearbox"));
        Select selectyear=new Select(yeardropdown);
        List<WebElement> options=selectyear.getOptions();
    	
        List OriginalListyear = new ArrayList();
		for (WebElement e : options) {
			OriginalListyear.add(e.getText());
		}
			
			OriginalListyear.remove("year");
			 System.out.println("Options in dropdown: " +OriginalListyear);
		        
		         List templistyear = new ArrayList(OriginalListyear);
		        System.out.println("Temp List: " + templistyear);
		        
		        //Sorting the Original List 
		        Collections.sort(OriginalListyear);
		        System.out.println("Sorted List:" + OriginalListyear );
		        
		        
		        if(OriginalListyear.equals(templistyear)) {
		            
		            System.out.println(" Year List is Sorted");
		            
		        }else {
		            
		            System.out.println("Year List is unsorted");
		        }
		        

	}

}
