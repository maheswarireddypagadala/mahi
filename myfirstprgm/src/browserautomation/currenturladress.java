package browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenturladress {

  public static void main(String[] args) {
		
  WebDriver driver;
  String applicationUrladdress="http://Google.com";
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get(applicationUrladdress);
  
  String expected_googlehomepagetitle="Google";
  System.out.println("expected_googlehomepagetitle :" + expected_googlehomepagetitle);
  
  //String expected_googlehomepagecurrenturladdress="Google.com";
  //System.out.println("expected_googlehomepagetitle :" + expected_googlehomepagecurrenturladdress);
  
  String actual_googlehomepagetitle=driver.getTitle();
  System.out.println("actual_googlehomepagetitle"+ actual_googlehomepagetitle);
  
  //String actual_googlehomepagecurrenturladdress=driver.getCurrentUrl();
  //System.out.println("actual_googlehomepagecurrenturladdress:" +actual_googlehomepagecurrenturladdress);
  
  //Validate
  if(actual_googlehomepagetitle.equals(expected_googlehomepagetitle)) {
	  System.out.println(" googlehomepagetitle same");
	  
  }
  else {
	  System.out.println(" googlehomepagetitle not same");
  }
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


  String expected_googlehomepagecurrenturladdress="google.com";
  System.out.println("expected_googlehomepagetitle :" + expected_googlehomepagecurrenturladdress);
  
  String actual_googlehomepagecurrenturladdress=driver.getCurrentUrl();
  System.out.println("actual_googlehomepagecurrenturladdress:" +actual_googlehomepagecurrenturladdress);
  

   if(actual_googlehomepagecurrenturladdress.contains(expected_googlehomepagecurrenturladdress)) {
	  
	  System.out.println("googlehomepagecurrenturladdress same -pass");
  }
  else
   {
	  System.out.println("googlehomepagecurrenturladdress not same -fail");
    }
  //driver.close();
  }
}
 


