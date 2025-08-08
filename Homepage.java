package naaptol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	By selectLanguage=By.id("localization_dropdown");
	
	public void Selectlanguage() {
		WebElement landropdown=driver.findElement(selectLanguage);
		landropdown.click();
       
        Select select=new Select(landropdown);
        select.selectByIndex(0);
	}

}
