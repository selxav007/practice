package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com"); 
/*		String Login = "//input[@id=\"Email\"]";
		String Next = "//*[@id=\"next\"]"; 
		Thread.sleep(2000);
		String Pwd = "//input[@id=\"Passwd\"]";
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String SignIn ="//*[@id=\"signIn\"]";
		driver.findElement(By.xpath(Login)).sendKeys("seleniumtester1977");;
		driver.findElement(By.xpath(Next)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Pwd)).sendKeys("Windows@101");
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"PersistentCookie\"]"));
		List<WebElement>Chk = driver.findElements(By.xpath("//*[@id=\"PersistentCookie\"]"));
		System.out.println(Chk.get(0).getAttribute("checked")); 
		Thread.sleep(2000);
		Chk.get(0).click();
		System.out.println(Chk.get(0).getAttribute("checked")); 
		Thread.sleep(3000);
		driver.findElement(By.xpath(Pwd)).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath(Pwd)).sendKeys(Keys.PAGE_UP);
		Thread.sleep(3000);
		dd.click();
		driver.close();*/
		
		String a = "12 + 2";
		String b = a.substring(0,2);
		String c = a.substring(5,6);
		int d = Integer.parseInt(b);//convert string into int
		int e = Integer.parseInt(c);
		int sum = d+  e ;
		String f = String.valueOf(sum);
		System.out.println(f);
		
		
	}
		

}
