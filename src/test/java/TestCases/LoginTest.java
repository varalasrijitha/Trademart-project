package TestCases;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import PageObject.LoginPage;

public class LoginTest extends Baseclass {
	
	
	@Test(dataProvider="dp")

	 public void logintest(String email,String password) throws  IOException, InterruptedException{
		
		 LoginPage lp=new LoginPage(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 lp.Login();
		 System.out.println("login is clicked");
		 Thread.sleep(2000);
		 lp.Email(email);
		 System.out.println("email is entered");
		 Thread.sleep(2000);
		 lp.Password(password);
		 System.out.println("password is entered");
		 Thread.sleep(2000);
		 lp.Clicklogin();
		 System.out.println("login is  entered");
		 
		
       /*  lp.Hello();
         System.out.println("hello is  entered");
        lp.Logout();
        System.out.println("logout is  clicked");*/
        
	 String EXP_title="User Dashboard Trademart";
 	 String Act_title=driver.getTitle();
 	
 	if(Act_title.equals(EXP_title)) {
 		System.out.println("test case is success");
 	}
 	else {
       
		captureScreen(driver,"logintest");
		System.out.println("Screenshot is taken");
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Assert.assertTrue(false);
	}
 	
	}
 	
	 @DataProvider(name="dp")
	   String [][] logindata() {
	           
	           String data[][]={
	           
	         
	            {"zxc12345@gmail.com","zxc@123"},
	            {"buyer.ncrypted@gmail.com","123456"},
	        
	   };
	           return data;       

}
	
}


