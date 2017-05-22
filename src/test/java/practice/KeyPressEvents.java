package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class KeyPressEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://gmail.com");
			
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/ul[1]/li[3]/p[2]/a")).click();
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//*[@id='en_us']/body/div[1]/div[3]/h2")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//*[@id='en_us']/body/div[1]/div[3]/h2")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(3000L);
			driver.findElement(By.xpath("//*[@id='en_us']/body/div[1]/div[3]/h2")).sendKeys(Keys.BACK_SPACE);
			

	}

}
