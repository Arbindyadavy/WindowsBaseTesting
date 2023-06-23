import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import autoitx4java.AutoItX;



public class NewTest2 {
	
	AutoItX auto = new AutoItX();
  @Test
  public void f() {
  }
  @BeforeSuite
  public void beforeSuite() throws IOException {
	  
	  auto.sleep(2000);

	  

	  Runtime.getRuntime().exec("C:\\Program Files (x86)\\NeuroEquilibrium\\Dashboard\\Dashboard.exe");
	//  auto.run("C:\\Program Files (x86)\\NeuroEquilibrium\\Dashboard\\Dashboard.exe");
	    auto.sleep(3000);
		auto.ControlSetText("NeuroEquilibrium Dashboard", "", "[CLASS:WindowsForms10.EDIT.app.0.3ce0bb8_r18_ad1; INSTANCE:1]", "gbank34240");
		
		auto.sleep(1000);
		auto.controlClick("NeuroEquilibrium Dashboard", "", "[CLASS:WindowsForms10.SysDateTimePick32.app.0.3ce0bb8_r18_ad1; TEXT:; INSTANCE:1]");
	    auto.send("2021-09-01");
		auto.sleep(2000);
		auto.controlClick("NeuroEquilibrium Dashboard", "", "[CLASS:WindowsForms10.BUTTON.app.0.3ce0bb8_r18_ad1; TEXT:Login; INSTANCE:1]");
		
		auto.sleep(5000);
		auto.controlClick("NeuroEquilibrium Dashboard", "", "[CLASS:WindowsForms10.BUTTON.app.0.3ce0bb8_r18_ad1; TEXT:; INSTANCE:4]");
		
		auto.sleep(5000);

//		auto.controlClick("Confirmation", "", "[CLASS:HwndWrapper[SVV.exe;;aee9798f-f93f-4d3f-81cf-e9410c20a6a8];TEXT:OK; INSTANCE:1]");
//		auto.sleep(5000);
		auto.controlClick("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "", "[CLASS:WindowsForms10.Window.8.app.0.1a8c1fa_r18_ad1]; TEXT:CALIBRATION;INSTANCE:1");
		auto.sleep(5000);


  
  
  }

  @AfterSuite
  public void afterSuite() {
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }

}
