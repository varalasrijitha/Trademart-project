package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	public static WebDriver driver;
	  
	   public SignupPage ( WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	       }
	   @FindBy(xpath="//a[text()=' Sign up ']")
	   WebElement Signup;
	   @FindBy(xpath="//*[@id='txt_email']")
	   WebElement Email;
	   @FindBy(xpath="//*[@id='txt_password']")
	   WebElement Password;
	   @FindBy(xpath="//*[@id='txt_cpassword']")
	   WebElement ConfirmPassword;
	   @FindBy(xpath="//*[@id='country']/option[105]")
	   WebElement Country;
	   @FindBy(xpath="//*[@id='state']/option[4]")
	   WebElement state  ;
	   @FindBy(xpath="//*[@id='city']/option[3]")
	   WebElement city  ;
	   @FindBy(xpath="//*[@id='inlineCheckbox3']")
	   WebElement selectboth  ;
	   @FindBy(xpath="//*[@id='firstName']")
	   WebElement  Firstname ;
	   @FindBy(xpath="//*[@id='lastName']")
	   WebElement Lastname  ;
	   @FindBy(xpath="//*[@id='companyName']")
	   WebElement Companyname  ;
	   @FindBy(xpath="//*[@id='countryCode']")
	   WebElement Countrycode  ;
	   @FindBy(xpath="//*[@id='contactNo']")
	   WebElement ContactNo  ;
	   
	/*   @FindBy(xpath="//iframe[@title='reCAPTCHA']")
	   WebElement frame;
	   @FindBy(xpath="//*[@class='recaptcha-checkbox-checkmark']")
	   WebElement recaptcha;*/
	   @FindBy(xpath="//button[@id='submitAddForm']")
	   WebElement signup;
	/*  @FindBy(xpath="//*[@id='frmSignUp']/div/div/div[1]/button")
	   WebElement close;*/
        
	   public void Signup() {
		   Signup.click();
	       }
	   public void Email(String email) {
		   Email.sendKeys(email);
	       }
	   public void Password(String password) {
		   Password.sendKeys(password);
	       }
	   public void confirmpassword(String confirmpassword) {
		   ConfirmPassword.sendKeys(confirmpassword);
	       }
	   public void Country() {
		   Country.click();
	       }
	   public void state() {
		   state.click();
	       }
	   public void city() {
		   city.click();
	       }
	   public void selectboth() {
		   selectboth.click();
	       }
	   public void Firstname(String firstname) {
		   Firstname.sendKeys(firstname);
	       }
	   public void Lastname(String lastname) {
		   Lastname.sendKeys(lastname);
	       }
	   public void companyname(String company) {
		   Companyname.sendKeys(company);
	       }
	   public void countrycode(String countrycode) {
		   Countrycode.sendKeys(countrycode);
	       }
	   public void contactno(String contactno) {
		   ContactNo.sendKeys(contactno);
	       }
	 /*  public void frame() {
		   frame.click();
	       }
	   public void recaptcha() {
		   recaptcha.click();
	       }*/
	   public void signup() {
		   signup.click();
	   }
	 /*  public void close() {
		   close.click();
	   }*/
	  
}
