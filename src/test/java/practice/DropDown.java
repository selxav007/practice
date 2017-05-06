package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/"); 
		WebElement Drop =driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Drop.click();
		Select select = new Select(Drop);
		select.selectByValue("az");
		List <WebElement> option =select.getOptions();
		option.size();
		System.out.println(option.size());
		for(int i= 0; i<option.size();i++){
			System.out.println(option.get(i).getText());
		}
/*		System.out.println("**********************************************");
		List <WebElement> option1= driver.findElements(By.tagName("option"));
		option1.size();
		System.out.println(option1.size());
		for(int i= 0; i<option1.size();i++){
			System.out.println(option1.get(i).getText());
			System.out.println(option1.get(i).getAttribute("lang"));
		}
		System.out.println("**********************************************");
		List <WebElement> links= driver.findElements(By.tagName("a"));
		links.size();
		System.out.println(links.size());
		for(int i= 0; i<links.size();i++){
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		System.out.println("******Printing Links from a particular Block***********");
		WebElement Block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]"));
		List <WebElement> links2= Block.findElements(By.tagName("a"));
		links2.size();
		System.out.println(links2.size());
		for(int i= 0; i<links2.size();i++){
			System.out.println(links2.get(i).getText());
			System.out.println(links2.get(i).getAttribute("href"));
		}
		driver.close();
	}
}
