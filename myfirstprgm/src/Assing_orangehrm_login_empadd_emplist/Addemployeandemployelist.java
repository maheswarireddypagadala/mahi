package Assing_orangehrm_login_empadd_emplist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Addemployeandemployelist {

	public static void main(String[] args) throws InterruptedException {
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
		
		
			  //id="menu_pim_viewPimModule"
			By pimlocator=By.id("menu_pim_viewPimModule");
			WebElement pimclick=driver.findElement(pimlocator);
			Actions action=new Actions(driver);
			
			action.moveToElement(pimclick).build().perform();
     
			//id="menu_pim_addEmployee"
			By addemployeelocator=By.id("menu_pim_addEmployee");
			WebElement addemployeeElement=driver.findElement(addemployeelocator);
			addemployeeElement.sendKeys("Add Employee");
			addemployeeElement.click();
			
		 //navigate firstname id=firstName id=middleName id=lastName
			By firstnamelocator=By.id("firstName");
			WebElement firstname=driver.findElement(firstnamelocator);
			firstname.sendKeys("venkateshwar");
			
			
			By middlenamelocator=By.id("middleName");
			WebElement middlename=driver.findElement(middlenamelocator);
			middlename.sendKeys("swamy");
			
			
			By lastnamelocator=By.id("lastName");
			WebElement lastname=driver.findElement(lastnamelocator);
			lastname.sendKeys("villa");
			lastname.click();
			
			By savelocator=By.id("btnSave");
			WebElement save=driver.findElement(savelocator);
			save.click();
		
	System.out.println(" successfully entered fullname");
	
			//validating the firstname
			Thread.sleep(1000);
			
			/*String expected_firstname="personal_txtEmpFirstName";
			System.out.println("expected_firstname : "+expected_firstname);
			String actual_firstnameaddress=driver.getCurrentUrl();
			System.out.println("actual_firstnameaddress : "+actual_firstnameaddress);
			
			//validating middle name
			
			String expected_middlename="personal_txtEmpMiddleName";
			System.out.println("expected_middlename: "+expected_middlename);
			String actual_middlename=driver.getCurrentUrl();
			System.out.println("actual_middlename  "+actual_middlename);
			
			//validating the lastname 
			String expected_lastname="personal_txtEmpLastName";
			System.out.println("expected_lastname: "+expected_lastname);
			String actual_lastname=driver.getCurrentUrl();
			System.out.println("actual_lastname  "+actual_lastname);*/
			
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
