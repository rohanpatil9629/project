package PageObjModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	    WebDriver driver;
	     
	    @FindBy(xpath="//*[@id=\"super-container\"]/div[2]/div[1]/header/div[2]/div/div/div/div[1]/div/a[5]")
	    WebElement sports;
	    
	    @FindBy(xpath="//*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div")
	    WebElement weekend;
	    
	   public HomePage( WebDriver driver)
	     {
	    	 this.driver=driver;
	    	PageFactory.initElements(driver, this);
	 
	     }
	    
	    public void clickSports()  
	    {
	    	sports.click();
	    }
	    
//	    public void clickweekend() throws InterruptedException
//	    {
//	    	Thread.sleep(5000);
//	    	for(int i=0;i<3;i++) {
//	    		try {
//	    			weekend.click();
//	    		}
//	    		catch(Exception e) {
//	    			System.out.println("stale exception");
//	    		}
//	    	}
//	    }
	    
	}
	 
	


