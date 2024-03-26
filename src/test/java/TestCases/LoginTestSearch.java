package TestCases;


import java.time.Duration;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import jdk.internal.org.jline.utils.Log;



public class LoginTestSearch extends Baseclass{

	@Test
	public void logintest() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(4000);
	     lp.Login();
	     log.info("login is clicked");
	     Thread.sleep(2000);
	     lp.Email(email);
	     log.info("email is entered");
	     Thread.sleep(2000);
	     lp.Password(password);
	     log.info("password is entered");
	     Thread.sleep(2000);
	     lp.Clicklogin();
	     log.info("login is clicked and entered into application ");
	     Thread.sleep(2000);
	     lp.selectproducts();
	     log.info("Seller product  is selected");
	     Thread.sleep(2000);
	     lp.search(search);
	     log.info("search generator is searched");
	     Thread.sleep(2000);
         lp.searchbutton();
         log.info("search button is clicked");
	     Thread.sleep(2000);
	     lp.Whishlist();
	     log.info("whishlist is selected");
	     Thread.sleep(2000);
         lp.slider();
         log.info("slider is clicked");
	     Thread.sleep(3000);
	     lp.category();
	     log.info("category is selected");
	     Thread.sleep(2000);

	     lp.subcategory();
	     log.info("sub category is selected");
	     Thread.sleep(2000);

	     lp.country();
	     log.info("country is selected");
	     Thread.sleep(2000);

	     lp.state();
	     log.info("state is selected");
	     Thread.sleep(2000);

	     lp.city();
	     log.info("city is selected");
	     System.out.println("*******************************************");
	     Thread.sleep(4000);
	     
	     lp.seller();
	     log.info("search seller is selected");
 	     Thread.sleep(2000);
 	    
         lp.Search(search1);
         log.info("search kuldipsyass is searched");
	     Thread.sleep(2000);
	     lp.searchbutton();
	     log.info(" search button is clicked");
	     Thread.sleep(2000);
	    
	     lp.Whishlist1();
	     log.info("whishlist1 is clicked");
	     Thread.sleep(2000);
	   
	     lp.sendmessage();
	     log.info("sendmessage is clicked");
	     Thread.sleep(2000);
	     lp.description();
	     log.info("description is entered");
	     Thread.sleep(2000);
	     lp.send();
	     log.info("send is clicked");
	     System.out.println("*******************************************");
	     Thread.sleep(3000);
	     lp.BuyingRequirements();
	     log.info("Buying Requirements is selected");
	     Thread.sleep(2000);
	     lp.searchbutton();
	     log.info("button is clicked");
	     Thread.sleep(2000);
	     lp.Quote();
	     log.info("quote is clicked");
	     Thread.sleep(2000);
	     lp.Mindate();
	     log.info("mindate is clicked");
	     Thread.sleep(4000);
	     lp.Apply();
	     log.info("apply is clicked");
	     Thread.sleep(4000);
	  

	     lp.category();
	     log.info("category is clicked");
	     Thread.sleep(2000);

	     lp.subcategory();
	     log.info("sub category is clicked");
	     Thread.sleep(2000);
	     lp.slider2();
	     log.info("slider2 is clicked");
	     Thread.sleep(4000);
	     lp.country();
	     log.info("country is selected");
	     Thread.sleep(2000);

	     lp.state();
	     log.info("state is selected");
	     Thread.sleep(2000);

	     lp.city();
	     log.info("city is selected");
	     System.out.println("*******************************************");
	     Thread.sleep(4000);
	     

}
}