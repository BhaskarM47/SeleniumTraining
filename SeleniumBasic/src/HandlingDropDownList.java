import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//identify dropdownlist
		WebElement skilldropdown=driver.findElement(By.id("Skills"));
		
		//Create an instance of Select class and pass above element into its constructor
		Select selskills=new Select(skilldropdown);
		
		 //check whether dropdown is multiselect dropdown or not
			System.out.println("Is dropdown is allowing you to select multiple option:"+selskills.isMultiple());
			
		//get default or already select option
//			WebElement SelectOption=selskills.getFirstSelectedOption();
//			String SelectedOpName=SelectOption.getText();
//			System.out.println("By default or already selected option name:"+ SelectedOpName);
//			or
			System.out.println("By default or already selected option name:"+selskills.getFirstSelectedOption().getText());
			
			//get option count 
			
			List<WebElement> options=selskills.getOptions();
			System.out.println("options count:"+options.size());
			
			//Get dropdown option names
			for(int i=0;i<options.size();i++) {
				System.out.println(+i+options.get(i).getText());//+i>count will print like 0 1 2 3
				//and if we doesnt print +i in syso then it will only show us option names like c c++ java photoshop 
				
				//select options from dropdown
				selskills.selectByIndex(6);
				System.out.println("Selected option by index:"+selskills.getFirstSelectedOption().getText());
				//or
//				selskills.selectByValue("MySQL");
//				System.out.println("Selected option by value:"+selskills.getFirstSelectedOption().getText());
				//or
				//selskills.selectByVisibleText("Analytics");
				//System.out.println("Selected option by visible text:"+selskills.getFirstSelectedOption().getText());
				
			
				
				
			}
			
	}

}
