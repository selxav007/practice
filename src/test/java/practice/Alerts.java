package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.get("http://rediff.com");
				
				
				driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
				Thread.sleep(2000L);
				driver.findElement(By.xpath("//*[@id='btn_login']")).click();
				Thread.sleep(2000L);
				
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				
			}

		

	}


