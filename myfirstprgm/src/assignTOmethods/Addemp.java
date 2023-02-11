package assignTOmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Addemp extends Orangehrmlaunch{

	public void addemplogin() {
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
	}
	
   public void  addempname() {
	   
   
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
	System.out.println(" addedemp is successfulled");	
   }
	
	
	
	
public static void main(String[] args) {
	Addemp loginadd=new Addemp();
	loginadd.hrmapplicationlaunch();
	loginadd.addemplogin();
	loginadd.addempname();
}
}


