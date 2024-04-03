package testCases;
	
	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;
    import PageObjModel.HomePage;

	 
	public class Tc2_clicksports{
		//WebDriver driver;
		
	  @Test
	  public void sport_test1() throws InterruptedException, IOException
	  {
		
		new Tc1_city();
		HomePage hm = new HomePage(Tc1_city.driver);
		  hm.clickSports();
		  
	    hm.sportsName();;
	  }
	}
	 

