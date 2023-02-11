package cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_tsrtc {
		
		WebDriver driver;
		String applicationurl="https://www.tsrtconline.in/oprs-web/";
	    
		public void applicationLunch(){			
		    System.setProperty("webdriver.chrome.driver","./browserdrivefiles/chromedriver.exe");
			driver=new ChromeDriver();
		    driver.get(applicationurl);
		    }
	
		public void handlingcookies() {
			Set<Cookie>tsrtcCookies=driver.manage().getCookies();
			int tsrtccookiescount=tsrtcCookies.size();
			System.out.println("count"+ tsrtccookiescount );
			Iterator<Cookie>tsrtcCookiesIt=tsrtcCookies.iterator();
			while(tsrtcCookiesIt.hasNext()) {
	          
			Cookie cookieit=tsrtcCookiesIt.next();	
			System.out.println(cookieit.getDomain()+" "+cookieit.getName());
			driver.manage().deleteAllCookies();
			
			tsrtcCookies=driver.manage().getCookies();
			tsrtccookiescount=tsrtcCookies.size();	
			
			 }
			}
			public void closeapplications()
			{
				driver.quit();
			}
			
			public static void main(String[] args) {
	    	Cookies_tsrtc  cook=new Cookies_tsrtc();
	    	cook.applicationLunch();
	    	cook.handlingcookies();
            cook.closeapplications();}
}

