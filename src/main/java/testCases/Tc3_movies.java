package testCases;

    import org.testng.annotations.Test;
    import PageObjModel.MovieTickets;

	 
	public class Tc3_movies {
	  @Test
	  public void f() throws InterruptedException
	  {
		  MovieTickets mt= new MovieTickets( new Tc1_city().driver);
		  Thread.sleep(5000);
		  mt.clickMovies();
		  mt.language();
	  }
	

}
