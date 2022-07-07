package basics;

import org.testng.annotations.Test;

public class DaughterClass extends ParentClass{

	@Test
	public void startMercuryNewDemo(){
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println("navigated to MercuryNewTourDemo app");
		driver.manage().window().maximize();
		System.out.println("maximized the MercuryNewTourDemo live app");
	}
}
