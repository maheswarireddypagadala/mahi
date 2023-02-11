package cityandtime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
	 WebDriver driver; 
		String applicationurl="https://timeanddate.com/worldclock";
				 
	    public void applicationlaunch()
				{
				  System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
				    driver=new ChromeDriver();
				    driver.get(applicationurl);
				    driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				    
				   }
	    public void applicationclose() {
	    	driver.close();
	    }
	   
}
