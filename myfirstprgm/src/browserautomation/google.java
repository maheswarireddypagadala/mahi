package browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
		WebDriver mahi=new ChromeDriver();
        mahi.get("http://Google.com");
        mahi.getTitle();
        String expected_titles="Google";
        System.out.println("expected_title: " + expected_titles);
        String actual_titles="Google";
        System.out.println("actual_title: " + actual_titles);
       
        String actual_titless="Google";
        char charAtindex=actual_titless.charAt(0);
        System.out.println("charAtindex :"+charAtindex);
        
        if(actual_titles.equals(expected_titles))
          {
       	 System.out.println("same");
         }
           if(charAtindex=='G'){
       	 
        	System.out.println("google firstletteruppercase");
          }
        else
          {
       	 System.out.println("not same");
	    }
	}
}
