package org.neuro.p;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import autoitx4java.AutoItX;

public class Login {

	
	
	
	// WebDriver driver;
		AutoItX auto = new AutoItX();

		@Test
		public void f() {
		}

		@BeforeSuite
		public void beforeSuite() throws IOException {

			auto.sleep(2000);
	//
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\NeuroEquilibrium\\Dashboard\\Dashboard.exe");
			// auto.run("C:\\Users\\NEUROEQUILIBRIUM\\Downloads\\file_write.exe");

			auto.winWaitActive("NeuroEquilibrium Dashboard", "");
			auto.winActivate("NeuroEquilibrium Dashboard");
			auto.sleep(3000);
			auto.ControlSetText("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.EDIT.app.0.3ce0bb8_r21_ad1; INSTANCE:1]", "gbank34240");
					

			auto.sleep(1000);
			auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.SysDateTimePick32.app.0.3ce0bb8_r21_ad1; TEXT:; INSTANCE:1]");
					
			auto.send("2021-09-01");
			auto.sleep(2000);
			auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.BUTTON.app.0.3ce0bb8_r21_ad1; TEXT:Login; INSTANCE:1]");
					

//			auto.sleep(5000);
			// this is xpath minimize windows
			//auto.controlClick("NeuroEquilibrium Dashboard", "", "[CLASS:WindowsForms10.Window.8.app.0.3ce0bb8_r18_ad1; INSTANCE:5]");
			auto.sleep(1000);
			auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.BUTTON.app.0.3ce0bb8_r21_ad1; INSTANCE:4]");
					
			auto.sleep(2000);
			auto.winWaitActive("NeuroEquilibrium Dashboard", "");
			auto.winActivate("NeuroEquilibrium Dashboard");
		     auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.Window.8.app.0.3ce0bb8_r21_ad1; INSTANCE:5]");
//					
			auto.sleep(1000);
			auto.winWaitActive("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "");
			auto.winActivate("NeuroEquilibrium Diagnostic Systems Pvt Ltd.");
			auto.sleep(2000);

			auto.mouseClick("left", 70, 132);

			auto.winWaitActive("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "");
			auto.winActivate("NeuroEquilibrium Diagnostic Systems Pvt Ltd.");
//			auto.sleep(2000);

			// WindowsForms10.BUTTON.app.0.1a8c1fa_r18_ad1
		   //auto.controlClick("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "","[CLASS:WindowsForms10.SysTreeView32.app.0.1a8c1fa_r21_ad1; INSTANCE:1]");
			// 

			
	       auto.controlClick("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "", "[CLASS:Button;TEXT:OK; INSTANCE:1]");

			auto.sleep(3000);
			auto.controlClick("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "","[CLASS:WindowsForms10.BUTTON.app.0.1a8c1fa_r21_ad1; INSTANCE:2]");
					
			auto.sleep(3000);
			auto.controlClick("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "","[CLASS:WindowsForms10.BUTTON.app.0.1a8c1fa_r18_ad1; INSTANCE:3]");
					
			//
//			auto.sleep(3000);
//			auto.winWaitActive("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "");
//			auto.winActivate("NeuroEquilibrium Diagnostic Systems Pvt Ltd.");
//			auto.sleep(2000);
//			auto.controlClick("NeuroEquilibrium Diagnostic Systems Pvt Ltd.", "","[CLASS:WindowsForms10.Window.8.app.0.1a8c1fa_r18_ad1; INSTANCE:35]");

					
		}

		@AfterSuite
		public void afterSuite() {
			//auto.winClose("");

		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
