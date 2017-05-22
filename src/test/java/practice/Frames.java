package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*WebElement IFrame = driver.findElement(By.xpath("//iframe[@title='Login']"));
		driver.switchTo().frame(IFrame);*/
		driver.get("http://www.firstcry.com/"); 
		int count =driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		driver.switchTo().frame("iframe_Login");
		String MianWindow = driver.getWindowHandle(); // get the current window handle
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("dilip@gg.com");;
		driver.switchTo().window(MianWindow);
		driver.findElement(By.xpath("//*[@id='amt']/div[2]/div[1]/div[1]/div[3]/div")).click();
		driver.close();
		

	}

}
