package testCases;
	
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;
    import PageObjModel.HomePage;

	 
	public class Tc2_clicksports{
		//WebDriver driver;
		
	  @Test
	  public void f() throws InterruptedException
	  {
		
		HomePage hm = new HomePage(new Tc1_city().driver);
		  hm.clickSports();
		  
//		  hm.clickweekend();
	  }
	}
	 

