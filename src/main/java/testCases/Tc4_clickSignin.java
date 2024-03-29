package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjModel.Signin;

public class Tc4_clickSignin {
	
	
	Signin s;

	  @Test(priority=1)

	  public void test1() throws InterruptedException 

	  {
        new Tc1_city();
        s=new Signin(Tc1_city.driver);
        s.clickSignIn();
	  }

	  @Test(priority=2)

	  public void test2() throws InterruptedException 
	  {
       s.clickGoogle();
	  }

	  @Test(priority=3,dataProvider="dp")

	  public void test3(String emailVal) throws InterruptedException 
	  {
       s.enterEmail(emailVal);
	  }

	  @Test(priority=4)

	  public void test4() throws InterruptedException 
	  {
       s.clickNext();
	  }


	  @DataProvider

	  public Object[] dp() 
	  {
       return new Object[][] {
       new Object[] { "abc@.com" }
                                    };

		  }

}
