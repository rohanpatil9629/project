package testCases;

    import java.io.IOException;

import org.testng.annotations.Test;
    import PageObjModel.MovieTickets;

	 
	public class Tc3_movies {
		 MovieTickets mt;
	  @Test(priority=1)
	  public void movies_test1() throws InterruptedException
	  {
		  new Tc1_city();
		  mt= new MovieTickets( new Tc1_city().driver);
		  Thread.sleep(5000);
		  mt.clickMovies();
		
	  }
	  @Test(priority=2)
	  public void movies_test2() throws InterruptedException, IOException
	  {
		  
		  mt.language();
		  mt.movie_language();
	  }
	 
	

}
