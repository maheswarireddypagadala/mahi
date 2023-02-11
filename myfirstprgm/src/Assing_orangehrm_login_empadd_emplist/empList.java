package Assing_orangehrm_login_empadd_emplist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class empList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationalurladdress="http://127.0.0.1/orangehrm-4.2.0.1/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
	      driver=new ChromeDriver(); 
	      driver.get(applicationalurladdress);
	      
	      
	    //login with validation data testdata
		     By usernamelocator=By.id("txtUsername");
			  WebElement username=driver.findElement(usernamelocator);
			  username.sendKeys("maheswari");
				
			  By passwordlocator=By.id("txtPassword");
			  WebElement password=driver.findElement(passwordlocator);
			  password.sendKeys("Mahesh@1998");
			  
			  //id="btnLogin"
			  By loginlocator=By.id("btnLogin");
			  WebElement login=driver.findElement(loginlocator);
			  login.click();
			  
		System.out.println(" logined pass");	
		
		//<b>Admin</b>menu_admin_viewAdminModule
		
		By pimlocator=By.id("menu_pim_viewPimModule");
		WebElement pimclick=driver.findElement(pimlocator);
		Actions action=new Actions(driver);
		
		action.moveToElement(pimclick).build().perform();
		
		
		WebElement addemployee=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		addemployee.click();
		
		
		//GETTING EMPLOYE LIST 
		WebElement addemployeelist=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div"));
		List<WebElement>tablerows=addemployeelist.findElements(By.tagName("tr"));
		
		int tablerows_length=tablerows.size();
		System.out.println("tablerows_length  :"+tablerows_length);
		
		String addemployeelisttext=addemployeelist.getText();
		System.out.println("addemployeelisttext   :"+addemployeelisttext);
		
		for(int indexrow=0;indexrow<=tablerows_length;indexrow++)
		{
			List<WebElement>tablerowofcolum=tablerows.get(indexrow).findElements(By.tagName("td"));
			
			int tablerowofcolumn_length=tablerowofcolum.size();	
			System.out.println("tablerowofcolumn_length   : "+tablerowofcolumn_length);
			
			for(int cellindex=0;cellindex<=tablerowofcolumn_length;cellindex++)
			{
				String addemployeelisttextcell=tablerowofcolum.get(cellindex).getText();
				System.out.println("addemployeelisttextcell   :"+addemployeelisttextcell);
				
			}
		}
				
	}
	

}
