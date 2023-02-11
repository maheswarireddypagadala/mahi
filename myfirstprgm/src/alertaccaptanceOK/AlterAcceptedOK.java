package alertaccaptanceOK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterAcceptedOK {

	public static void main(String[] args) {
		WebDriver driver;
		String applicationurl="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get(applicationurl);
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		By checkavailabilitylocator=By.id("searchBtn");
		WebElement checkavailability=driver.findElement(checkavailabilitylocator);
		checkavailability.click();
		System.out.println("attribute of check avalability "+  checkavailability.getAttribute("class"));
 //alert is a interface for package -import --org.openqa.selenium.Alert
//from the current webpage-switching  into the alert and performing operation
		Alert alert=driver.switchTo().alert();
		alert.accept(); //will perform operation on OK button
		//alert.dismiss();//will perform operation on  CANCEL button
		//driver.quit();
		
	}

}
