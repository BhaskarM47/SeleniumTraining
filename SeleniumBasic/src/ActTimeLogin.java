import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		String currworkindirect=System.getProperty("user.dir");
		String chromePath=currworkindirect+("\\Executables\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",chromePath);
	    WebDriver driver=new ChromeDriver();
	    
	 // maximize browser window
	 	driver.manage().window().maximize();
	 		// implicit wait
	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    //getting url
	    driver.get("https://demo.actitime.com");
	    
	    String actualTitle=driver.getTitle();
	    String expectedTitle=("actiTIME - Login");
	    
	    System.out.println("actual title is:"+actualTitle);
	    System.out.println("expected title is:"+expectedTitle);
	    
	    System.out.println("Validation of title is:"+actualTitle.equals(expectedTitle));
	    System.out.println("Page title length is:"+actualTitle.length());
	    
	    //operations

	    WebElement username=driver.findElement(By.className("textField"));
	    
	    username.sendKeys("admin");
	    
	    WebElement password=driver.findElement(By.name("pwd"));
	    password.sendKeys("manager");
	    
	    WebElement loginbtn=driver.findElement(By.id("loginButton"));
	    loginbtn.click();
	    
	   //Task creation
	    
	  driver.findElement(By.id("container_tasks")).click();//task link-after setting implicitwait task link is opened
	  
	 driver.findElement(By.cssSelector("div.title.ellipsis")).click();//add new button
	 
	 driver.findElement(By.cssSelector("div.item.createNewTasks")).click();//new task
	 
	 driver.findElement(By.cssSelector("div.projectSelector .selectedItem")).click();//select flight operations
	 
	//Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("div.projectSelector .searchItemList>*:nth-child(4)")).click();
	 driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Automation Test");
	    
	    //driver.close();
	}

}
