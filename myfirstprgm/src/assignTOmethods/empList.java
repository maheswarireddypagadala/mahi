package assignTOmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class empList extends Orangehrmlaunch {
	
	
	
	public void orangehrmlogin() {
		
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
	
	public void pimList() {
		
		
		//PIM emp list getting
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
			//System.out.println("tablerowofcolumn_length :"+tablerowofcolumn_length);
			
			for(int cellindex=0;cellindex<=tablerowofcolumn_length;cellindex++)
			{
				String addemployeelisttextcell=tablerowofcolum.get(cellindex).getText();
				System.out.println("addemployeelisttextcell   :"+addemployeelisttextcell);
				
			}
		}
				
	}
	
public static void main(String[] args) {
		empList login=new empList();
		login.hrmapplicationlaunch();
		login.orangehrmlogin();
		login.pimList();
	}
}
