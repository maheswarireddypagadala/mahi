package browserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
	 WebDriver driver;
	 String appicationurl="http://facebook.com";
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(appicationurl);
     
     String expected_facebookwebpagetitle="facebook";
     System.out.println("expected_facebookwebpagetitle :" + expected_facebookwebpagetitle);
     
     String actual_facebookwebpagetitle=driver.getTitle();
     System.out.println("expected_facebookwebpagetitle :"+ actual_facebookwebpagetitle);
     
     if(actual_facebookwebpagetitle.equals(expected_facebookwebpagetitle))
     {
    	 System.out.println("facebookwebpagetitle is same ");
     }else {
    	 
    	 System.out.println("facebookwebpagetitle is not same");
     }
     
     
     String expected_facebookcurrenturladdress="facebook.com";
     System.out.println("expected_facebookwebpagetitle :" + expected_facebookwebpagetitle);
     
     String actual_facebookcurrenturladdress=driver.getCurrentUrl();
     System.out.println("expected_facebookwebpagetitle :"+ actual_facebookwebpagetitle);
     
     if(actual_facebookcurrenturladdress.contains(expected_facebookcurrenturladdress))
     {
    	 System.out.println("facebookcurrenturladdressis is same ");
     }else {
    	 
    	 System.out.println("facebookcurrenturladdress is not same");
     }
    //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
      By usernamel=By.name("email");
      WebElement username=driver.findElement(usernamel);
      username.sendKeys("pagadalamaheswari117@gmail.com");
      
     
     
    // <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
     By passwordl=By.name("pass");
     WebElement password=driver.findElement(passwordl);
     password.sendKeys("pagadala@123");
     
     
     
    // <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_5_TS">Log in</button>
	By loginl=By.name("login");
	WebElement login=driver.findElement(loginl);
	login.click();
     
     
	}

}
