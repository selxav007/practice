package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com"); 
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		Thread.sleep(2000L);
		driver.navigate().back();
		Thread.sleep(2000L);
		driver.navigate().forward();
		Thread.sleep(5000L);
		
	}

}
