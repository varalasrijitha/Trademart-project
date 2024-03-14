package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	  
	   public LoginPage ( WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	       }
	   @FindBy(xpath="//a[text()=' Log in ']")
	   WebElement login;
	   @FindBy(xpath="//*[@id='frmSignIn']/div[1]/div/div[1]/input")
	   WebElement Email;
	   @FindBy(xpath="//*[@id='password']")
	   WebElement Password;
	   @FindBy(xpath="//button[text()='Login']")
	   WebElement Clicklogin;
	  /* @FindBy(xpath="//ul[@class='dropdown-menu']")
	   WebElement hello;
	   @FindBy(xpath="//a[text()='Log out']")
	   WebElement logout;*/
       public void Login() {
	   login.click();
       }
	   public void Email(String email) {
		   Email.sendKeys(email);
       }
	   public void Password(String password) {
		   Password.sendKeys(password);
	   }
	   public void Clicklogin() throws InterruptedException {
		  Clicklogin.click();
		  Thread.sleep(2000);
	   }
	/*   public void Hello() {
			  hello.click();
			  driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li[5]")).click();
		  }
	   public void Logout() {
			  logout.click();
		  }*/
		  
}
