package naaptol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class SearchPage {
	
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By searchproduct=By.id("header_search_text");
	By searchClick=By.xpath("(//div[@class='search'])[2]");
//	sort product by damand
	By sortDamand=By.id("sortByFilter");
	By chooseChaseOn=By.id("iscod");
	By searchcetgeory=By.id("catFilterBox3317");
	By searchBrand=By.id("brandFilterBox38953");
	By Pricerange=By.id("fromPriceRange");
	By topricerange=By.id("fromPriceRange");
	By discountproduct=By.id("discountFilterBox1");
	By useby=By.id("featureFilterBox0f1");
	By type=By.id("featureFilterBox0f2");
	
	public void Search(String keword){
		driver.findElement(searchproduct).sendKeys(keword);
		driver.findElement(searchClick).click();
		
	}
	public void Sort() {
	WebElement sortdropdown=driver.findElement(sortDamand);
	sortdropdown.click();
	Select sort=new Select(sortdropdown);
	sort.selectByIndex(4);
	
	}
	public void ChashOnDelviery() {
		driver.findElement(chooseChaseOn).click();
	}
	public void Catageroy() {
		driver.findElement(searchcetgeory).click();
	}
	public void Brand() {
		driver.findElement(searchBrand).click();
	}
	public void Price(String price1) {
		driver.findElement(Pricerange).sendKeys(price1);
	}
	public void Price2(String price2) {
		driver.findElement(topricerange).sendKeys(price2);
	}
	
	public void Discount() {
		driver.findElement(discountproduct).click();
	}
	public void Use() {
		driver.findElement(useby).click();
		
	}
	public void Typeproduct() {
		driver.findElement(type).click();
	}

}

/*

WebElement sortdropdown= driver.findElement(By.id("sortByFilter"));
sortdropdown.click();
Select sort=new Select(sortdropdown);
sort.selectByIndex(4);
Thread.sleep(6000);


//select price range
driver.findElement(By.id("fromPriceRange")).sendKeys("1099");
Thread.sleep(5000);
driver.findElement(By.id("toPriceRange")).sendKeys("1599");
Thread.sleep(5000);
driver.findElement(By.xpath("(//a[@class='button_1'])[2]")).click();
Thread.sleep(5000);
//use discount
driver.findElement(By.id("discountFilterBox1")).click();
Thread.sleep(5000);
driver.findElement(By.id("featureFilterBox0f1")).click();
Thread.sleep(5000);
driver.findElement(By.id("featureFilterBox0f2")).click();
Thread.sleep(5000);

*/