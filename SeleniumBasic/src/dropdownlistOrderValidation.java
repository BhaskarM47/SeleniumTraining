import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlistOrderValidation {

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
		
		WebElement skilldropdown=driver.findElement(By.id("Skills"));
		
		//Create an instance of Select class and pass above element into its constructor
		Select selskills=new Select(skilldropdown);
		
			List<WebElement> options=selskills.getOptions();
			
			
				List OriginalList = new ArrayList();
				for (WebElement e : options) {
					OriginalList.add(e.getText());
				}
					
					OriginalList.remove("Select Skills");
					 System.out.println("Options in dropdown: " +OriginalList);
				        
				         List templist = new ArrayList(OriginalList);
				        System.out.println("Temp List: " + templist);
				        
				        //Sorting the Original List 
				        Collections.sort(OriginalList);
				        System.out.println("Sorted List:" + OriginalList );
				        
				        
				        if(OriginalList.equals(templist)) {
				            
				            System.out.println("List is Sorted");
				            
				        }else {
				            
				            System.out.println("List is unsorted");
				        }
				        
				       
				        
				        
				      
				        
				        
				     
				        
				    }
				}
	
				
				
	    
	
				
	


