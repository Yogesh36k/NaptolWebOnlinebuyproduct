package naaptol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
  By loginclick=By.id("login-panel-link");
  By inputNumber=By.id("registration-basic-panel-mobile");
  By sumbitclick=By.id("registration-basic-panel-submit");
  By finalsubmit=By.id("registration-otp-panel-submit");
  
  
  public void Loginbutton() {
	  driver.findElement(loginclick).click();
  }
  public void FilPhoneNumber(String phone) {
	  driver.findElement(inputNumber).sendKeys(phone);
	  
  }
  public void SubmitNumber() {
	  driver.findElement(sumbitclick).click();
  }
  public void FinalSubmit() {
	  driver.findElement(finalsubmit).click();
  }
}

// Thread.sleep(5000);
//driver.findElement(By.id("login-panel-link")).click();
//Thread.sleep(3000);
//driver.findElement(By.id("registration-basic-panel-mobile")).sendKeys("8279429366");
//Thread.sleep(3000);
//driver.findElement(By.id("registration-basic-panel-submit")).click();
//Thread.sleep(60000);
//driver.findElement(By.id("registration-otp-panel-submit")).click();





