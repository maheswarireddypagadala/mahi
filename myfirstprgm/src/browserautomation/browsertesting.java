package browserautomation;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class browsertesting {

	public static void main(String[] args) {
		
		
		//automatic chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
        //ChromeDriver =new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http://Bing.com");
       //String  a=driver.getTitle();
       //System.out.println(a);
        
         String expected_title="Bing";
         System.out.println("expected_title: " + expected_title);
         
         
         String actual_title=driver.getTitle();
         System.out.println("actual_title: " + actual_title);
         
         if(actual_title.equals(expected_title))
         {
        	 System.out.println(" title same");
         }
         else
         {
        	 System.out.println(" title not same");
         }
        /* WebDriver mahi=new ChromeDriver();
         mahi.get("http:/Google.com");
         mahi.getTitle();
         String expected_titles="Google";
         System.out.println("expected_title: " + expected_titles);
         String actual_titles="Google";
         System.out.println("actual_title: " + actual_titles);
        
         String actual_titless="Google";
         char charAtindex=actual_titless.charAt(0);
         System.out.println("charAtindex :"+charAtindex);
         if(expected_titles.equals(actual_titles))
           {
        	 System.out.println("same");
          }
          if(actual_titless.charAt(0)=='G') {
        	 
         	System.out.println("google firstletteruppercase");
           }
          else
           {
        	 System.out.println("not same");
         }
         //driver.quit();
         //driver.close();
         //hello.get("http://bing.com");
		    // hello.get("http://facebook.com");
	        //hello.close();
	        //hello.quit();
	     //hello.navigate().to("http://bing.com");
	     //hello.quit();
	      //hello.close();
	    //ChromeDriver mahi=new ChromeDriver();
	    //mahi.get("http://email.com");
	    //mahi.get("http://instagram.com");
	   // mahi.navigate().to("http://google.com");
	        //C:\Users\ramre\OneDrive\Desktop\myproject12\myfirstprgm\browserdrivefiles\chromedriver.ex*/
   }
}