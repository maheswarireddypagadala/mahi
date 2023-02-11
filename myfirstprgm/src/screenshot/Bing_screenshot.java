package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_screenshot {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver;
	String applicationurlurl="http://bing.com";
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
	driver=new ChromeDriver();	
	driver.get(applicationurlurl);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	    //screenshot is a interafce in selenium webdriver 
		//output type is an interface in selenium webdriver
	
	File binghomepagescreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(binghomepagescreenshot,new File("./screnshots/bing.png"));
	}

}
