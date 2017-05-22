package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[contains(@title,'LOGIN NOW')]")).click();
		String MianWindow = driver.getWindowHandle(); // get the current window handle
		System.out.println("MianWindow is "+MianWindow);
	//	Thread.sleep(3000l);
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		String FirstWindow = driver.getWindowHandle(); // get the current window handle
		System.out.println("FirstWindow is "+FirstWindow);
		driver.findElement(By.xpath("//div[contains(@class,'cl fl ls_login')]")).click();
		Thread.sleep(3000l);
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		driver.findElement(By.xpath("//a[text()='Close this window']")).click();
		Thread.sleep(3000l);
		String SecondWindow = driver.getWindowHandle(); // get the current window handle
		System.out.println("SecondWindow is "+SecondWindow);
		driver.switchTo().window(FirstWindow);
		driver.close();
		driver.switchTo().window(MianWindow); // switch back to the original window
		driver.close();
		System.out.println("***********************************");

	}

}
