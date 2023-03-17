package week4.day5Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UBIBank {
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("firstName")).sendKeys("Kabilan");
		WebElement findElement = driver.findElement(By.id("title"));
		Select dropDown=new Select(findElement);
		dropDown.selectByValue("mr");
		driver.findElement(By.id("middleName")).sendKeys("I");
		driver.findElement(By.id("lastName")).sendKeys("Ilaiyaraja");
		WebElement findElement2 = driver.findElement(By.id("sex"));
		Select dropDown1=new Select(findElement2);
		dropDown1.selectByVisibleText("Male");
		WebElement findElement3 = driver.findElement(By.id("employmentStatus"));
		Select dropDown2=new Select(findElement3);
		dropDown2.selectByVisibleText("Full-time");
		driver.findElement(By.id("username")).sendKeys("KabilRaja");
		driver.findElement(By.id("email")).sendKeys("kabilraja1803@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kabilRaja18");
		driver.close();
		
		
		
		
	}

}
