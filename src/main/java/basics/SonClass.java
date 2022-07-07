package basics;

import org.testng.annotations.Test;

public class SonClass extends ParentClass{

	@Test
	public void startOrangeHRM(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("navigated to orangehrm live app");
		driver.manage().window().maximize();
		System.out.println("maximized the orangehrm live app");
		
	}
}
