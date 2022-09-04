import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlistDayValidation {

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
        
        WebElement Daydropdown=driver.findElement(By.id("daybox"));
        Select selectDay=new Select(Daydropdown);
        List<WebElement> options=selectDay.getOptions();
    	
        List OriginalListDay = new ArrayList();
		for (WebElement e : options) {
			OriginalListDay.add(e.getText());
		}
			
			OriginalListDay.remove("Day");
			 System.out.println("Options in dropdown: " +OriginalListDay);
		        
		         List templistDay = new ArrayList(OriginalListDay);
		        System.out.println("Temp DayList: " + templistDay);
		        
		        //Sorting the Original List 
		        Collections.sort(OriginalListDay);
		        System.out.println("Sorted DayList:" + OriginalListDay );
		        
		        
		        if(OriginalListDay.equals(templistDay)) {
		            
		            System.out.println(" Day List is Sorted");
		            
		        }else {
		            
		            System.out.println("Day List is unsorted");
		        }
		        
	}

}
