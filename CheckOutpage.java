package naaptol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class CheckOutpage {
	
	WebDriver driver;
	public CheckOutpage(WebDriver driver){
		this.driver=driver;
	}
	
	By firstname=By.id("firstName");
	By lastname=By.id("lastName");
	By phoneNumber=By.id("mobile");
	By address=By.id("address");
	By landmark=By.id("landmark");
	By pincode=By.id("pincode");
	By state=By.id("state");
	By city=By.id("city");
	By ordercomplet=By.xpath("//button[contains(text(),'COMPLETE ORDER')]");
	
	
	public void userName(String Firstname,String Lastname) {
		driver.findElement(firstname).sendKeys(Firstname);
		driver.findElement(lastname).sendKeys(Lastname);
	}
	public void MobileNumber(String number) {
		driver.findElement(phoneNumber).sendKeys(number);
	}
	public void Address(String pata) {
		driver.findElement(address).sendKeys(pata);
	}
	public void LandMark(String landmarkname) {
		driver.findElement(landmark).sendKeys(landmarkname);
	}
	public void PinCode(String pin) {
		driver.findElement(pincode).sendKeys(pin);
	}
	public void SelectState() {
		WebElement statedrop=driver.findElement(state);
		statedrop.click();
		Select select=new Select(statedrop);
		select.selectByVisibleText("UTTAR PRADESH");
		
	}
	public void City() {
		WebElement citydrop=driver.findElement(city);
		citydrop.click();
		Select select=new Select(citydrop);
		select.selectByIndex(0);
			
		
	}
	public void CompleteOrder() {
		driver.findElement(ordercomplet).click();
	}
	
	public void DriverSwitchMainwindow()
	{
		String MainWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(MainWindowHandle);
	}
	

}
/*

//               
//                driver.findElement(By.id("firstName")).sendKeys("Karan");
//                Thread.sleep(2000);
//                driver.findElement(By.id("lastName")).sendKeys("Kumar");
//                Thread.sleep(2000);
//                driver.findElement(By.id("mobile")).sendKeys("9876543210");
//                Thread.sleep(2000);
//                driver.findElement(By.id("address")).sendKeys("Nagla Bhtta Kishorpur");
//                Thread.sleep(2000);
//                driver.findElement(By.id("landmark")).sendKeys("Etah");
//                Thread.sleep(2000);
//                driver.findElement(By.id("pincode")).sendKeys("207123");
//                Thread.sleep(2000);
//              WebElement state=  driver.findElement(By.id("state"));
//              state.click();
//                Thread.sleep(5000);
//              Select select=new Select(state);
//              select.selectByVisibleText("UTTAR PRADESH");
//                Thread.sleep(2000);
//                WebElement city=driver.findElement(By.id("city"));
//                city.click();
//                Thread.sleep(2000);
//                Select cityselect=new Select(city);
//                cityselect.selectByIndex(0);
//                Thread.sleep(2000);
//                driver.findElement(By.linkText("COMPLETE ORDER")).click();
//     
 */
