package TestCases;

import java.io.IOException;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import PageObject.LoginPage;
import Utilities.XLUtils;

public class DataDrivenTest extends Baseclass {
	@Test(dataProvider="Excelsheet")

	 public void logintest(String email,String password) throws  IOException, InterruptedException{
	//	String path=System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\Excelsheet.xlsx";
		 LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(4000);
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
		/*for(int i=1;i<=2;i++) 
		{
			String email1=XLUtils.getCelldata(path, "Sheet1", i, 0);
			if(email1.equals(email))
			{
				XLUtils.setCellData(path, "Sheet1", i, 2, "Pass");
				XLUtils.FillGreenColor(path, "Sheet1", i, 2);
			}
		}*/
	}
	else {
      
		captureScreen(driver,"logintest");
		System.out.println("Screenshot is taken");
		Thread.sleep(3000);
			/*	for(int i=1;i<=2;i++) 
		{
			String email1=XLUtils.getCelldata(path, "Sheet1", i, 0);
			if(email1.equals(email))
			{
				XLUtils.setCellData(path, "Sheet1", i, 2, "Fail");
				XLUtils.FillRedColor(path, "Sheet1", i, 2);
			}
		}*/
		driver.navigate().refresh();
		Assert.assertTrue(false);
	
	}
	}

	
	 @DataProvider(name="Excelsheet")
	  String [][] getData() throws IOException{
		
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\Excelsheet.xlsx";
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
