package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	   @FindBy(xpath="//select[@class='search_drop']/option[1]")
	   WebElement selectproduct;
	   @FindBy(xpath="//input[@id='q']")
	   WebElement search;
	   @FindBy(xpath="//button[@class='btn btn-default btn_red']")
	   WebElement searchbutton;
	   @FindBy(xpath="//div[@class='ui-slider-range ui-widget-header ui-corner-all']")
	   WebElement slider;
	   @FindBy(xpath="//select[@id='category']/option[2]")
	   WebElement category;
	   @FindBy(xpath="//select[@name='subcategory']/option[2]")
	   WebElement subcategory;
	   @FindBy(xpath="//select[@name='countryid']/option[104]")
	   WebElement country;
	   @FindBy(xpath="//select[@name='stateid']/option[4]")
	   WebElement state;
	   @FindBy(xpath="//select[@name='cityid']/option[3]")
	   WebElement city;
	   @FindBy(xpath="//*[@id=\"ajresp\"]/div[1]/div/div[2]/div/div[2]/a/span")
	   WebElement whishlist;
	   @FindBy(xpath="//select[@class='search_drop']/option[2]")
	   WebElement selectseller;
	   @FindBy(xpath="//input[@id='q']")
	   WebElement search1;
	   @FindBy(xpath="//*[@id=\"ajresp\"]/div[1]/div/div[2]/div/div[2]/a/span")
	   WebElement whishlist1;
	   @FindBy(xpath="//p[@class='margintop15']/a[2]")
	   WebElement sendmessage;
	   @FindBy(xpath="//textarea[@id='description']")
	   WebElement Description;
	   @FindBy(xpath="//button[text()='Send']")
	   WebElement send;
	   @FindBy(xpath="//select[@class='search_drop']/option[3]")
	   WebElement selectBuyingRequirements;
	   @FindBy(xpath="//select[@id='bsort']/option[3]")
	   WebElement quote;
	   @FindBy(xpath="//input[@id='mindate']")
	   WebElement mindate;
	   @FindBy(xpath="//*[@id='qtydisp']/div")
	   WebElement slider2;

	   
	   @FindBy(xpath="//button[text()='Apply']")
	   WebElement Apply;
	   
	   
	 
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
	   public void selectproducts() {
		   selectproduct.click();
	       }
		   public void search(String searched) {
			   search.sendKeys(searched);
	       }
		   public void searchbutton() {
			   searchbutton.click();
		   }  
		   public void slider() {
			  // slider.click();
			//   WebElement right=driver.findElement(By.xpath("//*[@id='price']/span[1]"));
			   WebElement left=driver.findElement(By.xpath("//*[@id='price']/span[2]"));
		    //   System.out.println(right.getLocation());

		       System.out.println(left.getLocation());
		       Actions ac=new Actions(driver);
		       
		    //   ac.dragAndDropBy(right,70,0).build().perform(); 
		       ac.dragAndDropBy(left,-50,0).build().perform(); 

			 slider.click();
		   }  
		   public void category() {
			   category.click();
		   }
		   public void subcategory() {
			   subcategory.click();
		   }
		  public void country() {
			  country.click();
		  }
		  public void state() {
			  state.click();
		  }
		  public void city() {
			  city.click();
		  }
		  public void Whishlist() {
			  whishlist.click();
		  }
		  
		  public void seller() {
			  selectseller.click();
		  }
		  public void Search(String searched1) {
			  search.clear();
			  search1.sendKeys(searched1);
	    
	   }
		  
		  public void Whishlist1() {
			  whishlist1.click();
		  }
		  public void sendmessage() {
			  sendmessage.click();
		  }
		  public void description() {
			  Description.sendKeys("Trademart application is used to commnunicate buyers and sellers in aunique way ");
		  }
		  public void send() {
			  send.click();
		  }
		  
		  
		  public void BuyingRequirements() {
			  search1.clear();
			  selectBuyingRequirements.click();
		  }
		  public void Quote() {
			  quote.click();
		  }
		  public void Mindate() {
			  mindate.click();
			  WebElement ele=driver.findElement(By.xpath("//input[@name='daterangepicker_start']"));
			  ele.clear();
			  ele.sendKeys("03/08/2024");
			  WebElement ele1=driver.findElement(By.xpath("//input[@name='daterangepicker_end']"));
			  ele1.clear();
			  ele1.sendKeys("04/09/2024");

		  }
		  
		  public void Apply() {
			  Apply.click();
		  }
		  public void slider2() {
			  // slider.click();
			//   WebElement right1=driver.findElement(By.xpath("//*[@id='price']/span[1]"));
			   WebElement left1=driver.findElement(By.xpath("//*[@id='qtydisp']/span[2]"));
		    //   System.out.println(right1.getLocation());

		       System.out.println(left1.getLocation());
		       Actions ac=new Actions(driver);
		       
		    //   ac.dragAndDropBy(right1,70,0).build().perform(); 
		       ac.dragAndDropBy(left1,-60,0).build().perform(); 
		       slider2.click();
		  
}
}

