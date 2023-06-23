import java.io.IOException;

import org.testng.annotations.Test;

import autoitx4java.AutoItX;
@Test
public class Posturogrophy {

	AutoItX auto=new AutoItX();
	
	

	public void postby() throws Exception {
		
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\NeuroEquilibrium\\Dashboard\\Dashboard.exe");
		
		
		auto.winWaitActive("NeuroEquilibrium Dashboard", "");
		auto.winActivate("NeuroEquilibrium Dashboard");
		auto.sleep(3000);
		auto.ControlSetText("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.EDIT.app.0.3ce0bb8_r21_ad1; INSTANCE:1]", "gbank34240");
				

		auto.sleep(1000);
		auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.SysDateTimePick32.app.0.3ce0bb8_r21_ad1; TEXT:; INSTANCE:1]");
				
		auto.send("2021-09-01");
		auto.sleep(2000);
		auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.BUTTON.app.0.3ce0bb8_r21_ad1; TEXT:Login; INSTANCE:1]");
				
		auto.sleep(2000);
		auto.controlClick("NeuroEquilibrium Dashboard", "","[CLASS:WindowsForms10.BUTTON.app.0.3ce0bb8_r21_ad1; TEXT; INSTANCE:6]");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
