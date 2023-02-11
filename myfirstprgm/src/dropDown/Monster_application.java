package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Monster_application {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String applicationurladdress="https://my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
          driver=new ChromeDriver();
         driver.get(applicationurladdress);
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         
//identify the current location dropdown.IT'S BEHEAV LIKE HOW DEVELOPER DEVELEPED TO SELECT ONE OR MORE IN DROPDOWN
         //class=border_grey1
         By currentloactionlocator=By.className("border_grey1");
         WebElement currentlocation=driver.findElement(currentloactionlocator);
         
         Select currentlocationselect=new  Select(currentlocation);
         currentlocationselect.selectByIndex(1);
         //value should be taken from the property of the optional value given by developer
         Thread.sleep(10000);
   //<option value="6">Hyderabad / Secunderabad</option>
          currentlocationselect.selectByValue("6");
    //<option value="5">Gurgaon / Gurugram</option>
          currentlocationselect.selectByVisibleText("Gurgaon / Gurugram");
 //IN INDUTRY  DEVELOPER DEVELEPED TO SELECT  MORE THEN ONE IN DROPDOWN
          //id="id_industry"
          By industrylocator=By.id("id_industry");
          WebElement industry=driver.findElement(industrylocator);
          Select industryselect=new Select(industry);
          industryselect.selectByIndex(0);
  //<option value="31">IT/Computers - Hardware &amp; Networking</option>
          industryselect.selectByValue("31");
  //<option value="45">Power/Energy</option>
         industryselect.selectByVisibleText("Power/Energy");
         
         currentlocationselect.deselectByIndex(1);
         industryselect.deselectAll();
	}

}
