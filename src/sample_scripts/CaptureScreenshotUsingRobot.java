package sample_scripts;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotUsingRobot {
	
	
	/*//public static String CaptureScreenShotWithTestStepNameUsingRobotClass(String testStepsName)
	{
		try{
			
			// Creating Robot class object
			Robot robotClassObject = new Robot();
			
			// Get screen size
			Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			
			// Capturing screenshot by providing size
            BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
            
            // Defining destination file path
            
            
            // To copy temp image in to permanent file
            ImageIO.write(tmp, "png",new File("D:\\Sample\\abc.png")); 
            
            
		}catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			return "";
		}
		return testStepsName;
	}*/
	

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	
		driver.get("http://makeseleniumeasy.com/");
		Robot robotClassObject = new Robot();
		
		// Get screen size
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		  BufferedImage tmp = robotClassObject.createScreenCapture(screenSize);
		  ImageIO.write(tmp, "png",new File("D:\\Sample\\abc.png"));
		

	}

}
