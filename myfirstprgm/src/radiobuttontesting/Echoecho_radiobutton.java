package radiobuttontesting;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Echoecho_radiobutton 
{
	WebDriver driver;
	String applicationalurl="https://echoecho.com/htmlforms10.htm";
	public void applicationlaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationalurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void  radiobuttontest() throws InterruptedException
	{
		// <input type="radio" name="group1" value="water">
		// <input type="radio" name="group1" value="beer">
		// <input type="radio" name="group1" value="wine" "checked">zzz
		//performing the click operation on the radio  buttonz
	By	grouplocator=By.tagName("group1");
	List<WebElement>group1=driver.findElements(grouplocator);
	int group1radiobuttonscount=group1.size();	
	for (int indexclick=0;indexclick<group1radiobuttonscount;indexclick++)
	{
		System.out.println(group1radiobuttonscount);
		group1.get(indexclick).getClass();
		     for(int indexclickedstatus=0;indexclickedstatus<group1radiobuttonscount;indexclickedstatus++)
		     {	 	
               System.out.println(group1radiobuttonscount);
		      group1.get(indexclickedstatus).click();
		    
              System.out.println(group1.get(indexclickedstatus).getAttribute("Value")+" "+ group1.get(indexclickedstatus).getAttribute("checked"));
		    	
		    }
		  System.out.println( );
		}
	    
	}
	 public void applicationclose() 
	   {
		driver.close();   
		   
	   }
	   

	public static void main(String[] args) throws InterruptedException 
	{
		Echoecho_radiobutton radiobutton=new Echoecho_radiobutton();
		 radiobutton.applicationlaunch();
		radiobutton.radiobuttontest();
		 //radiobutton.applicationclose();
		 
	}
	 
}
