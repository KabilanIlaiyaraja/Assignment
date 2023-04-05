package week7.day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications", "--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();
		WebElement men = driver.findElement(By.linkText("Men's Top Wear"));
		action.moveToElement(men).perform();
		WebElement tShirt = driver.findElement(By.linkText("Men's T-Shirts"));
		action.click(tShirt).perform();
		WebElement minPrice = driver.findElement(By.xpath("//div[contains(@class,'_3FdLqY')]"));
		action.dragAndDropBy(minPrice, 130, -1).perform();
	
	}
}
