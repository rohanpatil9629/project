package testCases;

    import org.testng.annotations.Test;
    import PageObjModel.SelectCity;
	import org.testng.annotations.BeforeSuite;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	 
	public class Tc1_city 
	{
		static WebDriver driver;
	  @Test
	  public void city_test1() throws InterruptedException
	  {
		  SelectCity city= new SelectCity(driver);
		  city.clickCity();
		  Thread.sleep(3000);
	  }
	  @BeforeSuite
	  public void beforeSuite() throws InterruptedException
	  {
		  driver= new ChromeDriver();
		  driver.get("http://bookmyshow.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  @AfterSuite
	  public void afterSuite() 
	  {
//		  driver.quit();
	  }
	 
	}


