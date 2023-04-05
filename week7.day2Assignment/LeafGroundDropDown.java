package week7.day2Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDropDown {
	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications", "--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(drag, 250, 15).perform();
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));	
		WebElement target = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		String sourcecolor = target.getCssValue("background-color");
		System.out.println(sourcecolor);
		action.dragAndDrop(source, target).perform();
		String targetcolor = target.getCssValue("background-color");
		System.out.println(targetcolor);
		if (sourcecolor.equals(targetcolor)) {
			System.out.println("Colour not changed");
		} else {
			System.out.println("Colour changed");

		}
		
	}

}
