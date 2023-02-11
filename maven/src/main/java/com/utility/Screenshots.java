package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

   
	public static void takescreenshot(WebDriver driver,String imageName) throws IOException 

	{
		File binghomepagescreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(binghomepagescreenshot,new File("C:\\Users\\ramre\\OneDrive\\Desktop\\myproject12\\maven\\screenshots"+imageName+".png"));
}
}