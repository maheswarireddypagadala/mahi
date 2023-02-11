package assignTOmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmlaunch {
	public WebDriver driver;
    String applicationalurladdress="http://127.0.0.1/orangehrm-4.2.0.1/";
    
    
    
    public void hrmapplicationlaunch() {
    	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
      driver=new ChromeDriver(); 
      driver.get(applicationalurladdress);
    }
    
    public void hrmapplicationclose() {
    	driver.quit();
    }
    
    
  /*public static void main(String[] args) {
    	Orangehrmlaunch launch= new Orangehrmlaunch ();
    	launch.hrmapplicationlaunch();
    	launch.hrmapplicationclose();
	}*/
}
