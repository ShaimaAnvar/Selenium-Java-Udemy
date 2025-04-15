import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke browser
		//System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		//firefox launch
		//WebDriver driver = new FirefoxDriver();

	}

}
