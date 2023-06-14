import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
@Test
public class DashBoad {

	
	
	
	
	public void f() throws MalformedURLException, InterruptedException {

        System.setProperty("webdriver.winappdriver.driver","C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe");



        

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Program Files (x86)\\NeuroEquilibrium\\Dashboard\\Dashboard.exe");
              
        WindowsDriver driver = new WindowsDriver<>(new URL("http://127.0.0.1:4723/hub"),capabilities);

       

        String mainWindowHandle = driver.getWindowHandle();

        
        Thread.sleep(5000);

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        
        // Get the title of the new form
        String newFormTitle = driver.getTitle();

        System.out.println("newFormTitle - " + newFormTitle);
        Thread.sleep(2000);


       
        WebElement patientID = driver.findElementByAccessibilityId("txt_patient_id");
        patientID.sendKeys("GBTES11113");


        Thread.sleep(200);
        WebElement date = driver.findElementByAccessibilityId("date_appointment");
        date.sendKeys("01-05-2022");

        Thread.sleep(200);
       
       WebElement elementByAutomationId = driver.findElementByAccessibilityId("btn_submit");

        Thread.sleep(200);


        elementByAutomationId.click();


        Thread.sleep(2000);

        WebElement vng = driver.findElementByAccessibilityId("btn_VNG");

        Thread.sleep(200);


        vng.click();

        Thread.sleep(2000);

        
       
       

                
      
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
