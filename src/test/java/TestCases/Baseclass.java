package TestCases;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import Utilities.ReadConfig;


public class Baseclass {
	 public static WebDriver driver;
	 public static Logger log;
	ReadConfig rc=new ReadConfig();
		
		public String url=rc.getApplication();
		//public String email=rc.getEmail();
		//public String password=rc.getPassword();
		
	@BeforeClass
    public void openapplication() {
	driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get(url);
       
       driver.manage().window().maximize();
       log=Logger.getLogger(this.getClass());
       PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Log4j.properties");
   }
@AfterClass
 public void CloseApplication() {
     driver.close();
 }
public void captureScreen(WebDriver driver,String name) throws IOException 
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File target=new File("./Screenshots/"+name+".png");
	FileHandler.copy(src, target);
	log.info("screenshot is taken");
	//Log.info("screenshot is taken for orangehrm");
}

}
