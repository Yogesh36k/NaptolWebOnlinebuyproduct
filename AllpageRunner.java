package naaptol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
public class AllpageRunner {
	
	WebDriver driver;
	Homepage homepage;
	Loginpage loginpage;
	SearchPage searchpage;
	BuyPage buypage;
	CheckOutpage checkpage;
	
	
	@BeforeClass
	void setup() {
		 driver=new ChromeDriver();
	        driver.get("https://www.naaptol.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=1)
	void Home()throws InterruptedException {
		homepage=new Homepage(driver);
		Thread.sleep(3000);
		homepage.Selectlanguage();
		
	}
	@Test(priority=2)
	void Login()throws InterruptedException {
		loginpage=new Loginpage(driver);
		Thread.sleep(3000);
		loginpage.Loginbutton();
		Thread.sleep(3000);
		loginpage.FilPhoneNumber("8279429366");
		Thread.sleep(3000);
		loginpage.SubmitNumber();
		Thread.sleep(60000);
		loginpage.FinalSubmit();
	}
	@Test(priority=3)
	void SearchProduct()throws InterruptedException{
		Thread.sleep(2000);
		searchpage=new SearchPage(driver);
		Thread.sleep(2000);
		searchpage.Search("sandals");
		Thread.sleep(2000);
		searchpage.Sort();
		Thread.sleep(3000);
		searchpage.ChashOnDelviery();
		Thread.sleep(3000);
		searchpage.Catageroy();
		Thread.sleep(3000);
		searchpage.Brand();
		Thread.sleep(3000);
		searchpage.Price("1099");
		Thread.sleep(3000);
		searchpage.Price2("1599");
		Thread.sleep(3000);
		searchpage.Discount();
		Thread.sleep(3000);
		searchpage.Use();
		Thread.sleep(3000);
		searchpage.Typeproduct();
		Thread.sleep(3000);
	}
	@Test(priority=4)
	void Buypage()throws InterruptedException {
		buypage=new BuyPage(driver);
		Thread.sleep(3000);
		buypage.Arrowmove();
		Thread.sleep(3000);
		buypage.HomeKittechen();
		Thread.sleep(3000);
		buypage.Homeimproment();
		Thread.sleep(3000);
		buypage.Brand();
		Thread.sleep(3000);
		buypage.Product();
		buypage.PaymentMethod();
		Thread.sleep(3000);
		buypage.PriceFilter();
		Thread.sleep(3000);
		buypage.DiscountPrecent();
		Thread.sleep(3000);
		buypage.Opennewwindow();
		Thread.sleep(3000);
		buypage.SwitchDriverNewWindow();
		Thread.sleep(3000);
		buypage.BuyProduct();
		Thread.sleep(3000);
		
		
	}
	@Test(priority=5)
	void CheckOutPage() throws InterruptedException{
		Thread.sleep(3000);
		checkpage=new CheckOutpage(driver);
		Thread.sleep(3000);
		checkpage.userName("Karan", "Rajput");
		Thread.sleep(3000);
		checkpage.MobileNumber("8234679856");
		Thread.sleep(3000);
		checkpage.Address("Kasganj Eath");
		Thread.sleep(3000);
		checkpage.LandMark("Aligrah");
		Thread.sleep(3000);
		checkpage.PinCode("207123");
		Thread.sleep(3000);
		checkpage.SelectState();
		Thread.sleep(3000);
		checkpage.City();
		Thread.sleep(3000);
		checkpage.CompleteOrder();
		Thread.sleep(5000);
		checkpage.DriverSwitchMainwindow();
		Thread.sleep(3000);
		
	}
	@AfterClass
	void teardown()throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
