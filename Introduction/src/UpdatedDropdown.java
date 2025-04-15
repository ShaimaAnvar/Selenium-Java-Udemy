import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//handling checkbox-check if  acheckbox is seelcted
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//count number of check boxes present in a page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
		
		//check if an element is enabled or disabled
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		
		
		
		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(3000);
		//String value= driver.findElement(By.id("spanAudlt")).getText();
		//int count = Integer.parseInt(value);
//		for(int i=1;i<4; i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
		//driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
		
}
