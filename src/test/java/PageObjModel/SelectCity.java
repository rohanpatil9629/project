package PageObjModel;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCity {
	
	    WebDriver driver;
	 
		@FindBy(xpath="//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")
		WebElement searchCity;
		
		@FindBy(xpath="//*[@id=\"modal-root\"]/div/div/div/div[1]/div[2]/div/ul/li")
		List<WebElement> drp;
	 
		
		public SelectCity(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		public void clickCity() throws InterruptedException
		{
	       searchCity.sendKeys("pune");
	       //searchCity.click();
	       Thread.sleep(5000);
	       
	       for(int i=0;i<drp.size();i++)
	       {
	     	  if(drp.get(i).getText().equalsIgnoreCase("pune"))  
	     	  {
	     		  drp.get(i).click();
	     	  }
	     		  
	       }
		}
	}
	 
	 
//			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			for(int i=0;i<10;i++)
//			{
//				try
//				{
//					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.bwc__sc-1iyhybo-9:nth-child(1)"))).click();
//					System.out.println("hello");
//					break;
//				}
//				catch(Exception e)
//				{
//					System.out.println("stale");
//				}
//			}
//			Thread.sleep(2000);
//		}
	      
		
	  
	  
	  
	 
	 
	


