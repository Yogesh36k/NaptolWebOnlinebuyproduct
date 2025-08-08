package naaptol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import org.openqa.selenium.By;
public class BuyPage {
	WebDriver driver;
	public BuyPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By moveArrorw= By.xpath("//div[@class='cate_head']");
	By Homekittechen=By.linkText("Home & Kitchen");
	By HomeImproment=By.linkText("Home Improvement");
	By selectBrand=By.linkText("Yoviq");
	By selectProduct=By.linkText("Home Cleaning");
	By selectPayment=By.id("iscod");
	By applyfilter=By.id("priceFilterBox1");
	By applyDiscount=By.id("discountFilterBox2");
	By OpenNewWindow=By.id("productItem1");
//	here driver switch new window ceate function
	By buyProduct=By.linkText("Click here to Buy");
	
   
   public void Arrowmove() {
	  WebElement arrow= driver.findElement(moveArrorw);
	  Actions action=new Actions(driver);
      action.moveToElement(arrow).perform();
   }
   public void HomeKittechen() {
	   driver.findElement(Homekittechen).click();
   }
   public void Homeimproment() {
	   driver.findElement(HomeImproment).click();
   }
    public void Brand() {
    	driver.findElement(selectBrand).click();
    }
    public void Product() {
    	driver.findElement(selectProduct).click();
    }
    public void PaymentMethod() {
    	driver.findElement(selectPayment).click();
    }
    public void PriceFilter() {
    	driver.findElement(applyfilter).click();
    }
    public void DiscountPrecent() {
    	driver.findElement(applyDiscount).click();
    	
    }
    public void Opennewwindow() {
    	driver.findElement(OpenNewWindow).click();
    }
    public void SwitchDriverNewWindow() {
    	String MainWindowHandle = driver.getWindowHandle();
       
        Set<String>childwindow=driver.getWindowHandles();
//        here i buy the product
        for(String handel:childwindow) {
            if (!handel.equals(MainWindowHandle)) {
                driver.switchTo().window(handel);

            }
        }
    }
    public void BuyProduct() {
    	driver.findElement(buyProduct).click();
    }

}
