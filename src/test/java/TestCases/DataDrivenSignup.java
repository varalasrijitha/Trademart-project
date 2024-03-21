package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.SignupPage;
import Utilities.XLUtils;

public class DataDrivenSignup extends Baseclass1 {
	@Test(dataProvider="Excelsheet2")

	 public void logintest1(String email,String password,String confirmpassword,String firstname,String lastname,String company,String countrycode,String contactno ) throws  IOException, InterruptedException{
		 
	     SignupPage sp=new SignupPage(driver);
	     Thread.sleep(2000);
		 sp.Signup();
		 System.out.println("Signup page is clicked");
		 Thread.sleep(2000);
		 sp.Email(email);
		 System.out.println("email is entered");
		 Thread.sleep(2000);
		 sp.Password(password);
		 System.out.println("password is entered");
		 Thread.sleep(2000);
		 sp.confirmpassword(confirmpassword);
		 System.out.println("confirm password is entered");
		 Thread.sleep(2000);
		 sp.Country();
		 System.out.println("country code selected");
		 Thread.sleep(2000);
		 sp.state();
		 System.out.println("state is selected");
		 Thread.sleep(2000);
		 sp.city();
		 System.out.println("city is selected");
		 Thread.sleep(2000);
		 sp.selectboth();
		 System.out.println("select both option selected");
		 Thread.sleep(2000);
		 sp.Firstname(firstname);
		 System.out.println("firstname is entered");
		 Thread.sleep(2000);
		 sp.Lastname(lastname);
		 System.out.println("lastname is entered");
		 Thread.sleep(2000);
		 sp.companyname(company);
		 System.out.println("company name is entered");
		 Thread.sleep(2000);
		 sp.countrycode(countrycode);
		 System.out.println("country code is entered");
		 Thread.sleep(2000);
		 sp.contactno(contactno);
		 System.out.println("contact no is entered");
		 Thread.sleep(50000);
		 System.out.println("repatcha is entered");
		 sp.signup();
		 System.out.println("signup is clicked");
		// driver.navigate().refresh();
		/* sp.close();
		 System.out.println("close is clicked");*/
		// driver.navigate().refresh();
	   /*  captureScreen(driver,"logintest1");
	       System.out.println("Screenshot is taken");
	       driver.navigate().refresh();*/
	    String EXP_title="Welcome to Trademart";
	    String Act_title=driver.getTitle();
	
	   if(Act_title.equals(EXP_title)) {
		Assert.assertTrue(true);
		System.out.println("test case is success");
		
		Thread.sleep(3000);
	    }
	   else {
      
		captureScreen(driver,"logintest1");
	    System.out.println("Screenshot is taken");
	    driver.navigate().refresh();
     	Assert.assertTrue(false);
	}
	
	}
	@DataProvider(name="Excelsheet2")
	  String [][] getData() throws IOException{
		
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\Excelsheet2.xlsx";
		int rownum=XLUtils.getRowcount(path, "Sheet1");
		int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];
		 
		for(int i=1;i<=rownum;i++) {//it is represent the rows
			
			for(int j=0;j<colcount;j++) {//it is represent the columns
				logindata[i-1][j]=XLUtils.getCelldata(path, "Sheet1", i, j);///1 0
			}
		}
		return logindata;     

	 }	
	
}


