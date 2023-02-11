package frameDragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggingANDdropping {


	public static void main(String[] args) {
		WebDriver driver;
		String applicationurl="https://jqueryui.com/draggable/";
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\myfirstprgm\\browserdrivefiles\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get(applicationurl);
		
		//identify the frame of the webpage
		//<iframe src="/resources/demos/draggable/default.html" class="demo-frame"></iframe>
       By jqueryframeloacator=By.className("demo-frame");
       WebElement jqueryframe=driver.findElement(jqueryframeloacator);

//switiching into page frame of the webpage_because the element under test are inside  the frame
       driver.switchTo().frame(jqueryframe);
       
       //drag me to my target property 
       //<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
   //<p>Drag me around</p>
       By dragmetotargetlocar=By.id("draggable" );
       WebElement dragmetomytarget=driver.findElement(dragmetotargetlocar);
       
       String  dragmetotargettext=dragmetomytarget.getText();
       System.out.println("dragmetotargettext :"+ dragmetotargettext);

       //drop here elementproperty
       //id="droppable";
       
       By dropherelocator=By.id("droppable");
       WebElement drohere=driver.findElement(dropherelocator);
       
       Actions action =new Actions(driver);
       action.dragAndDrop(dragmetomytarget,drohere).build().perform();
       
       //getting out of frame -frame  the focus in with in frames switching back to actual webpage
          driver.switchTo().defaultContent();
         
 //Automationg resizable element
 //<div id="resizable" class="ui-widget-content ui-resizable">
      	//<h3 class="ui-widget-header">Resizable</h3>
      	//<div class="ui-resizable-handle ui-resizable-e" style="z-index: 90;"></div><div 
      	//class="ui-resizable-handle ui-resizable-s" style="z-index: 90;"></div><div 
      	//class="ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se" 
      	//style="z-index: 90;"></div></div>
          
          By resizablelocator=By.linkText("Resizable");
          WebElement resizable=driver.findElement(resizablelocator);
          resizable.click();
          System.out.println(resizable.getText());    
      
     /* By resizablelocator=By.className("ui-resizable-handle ui-resizable-e");
      WebElement resizable=driver.findElement(dragmetotargetlocar);
      resizable.click();
      System.out.println(resizable.getText()); */
     // driver.close();
	}

}
