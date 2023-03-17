package week4.day5Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("firstname")).sendKeys("Kabilan");
		driver.findElement(By.name("lastname")).sendKeys("Ilaiyaraja");
		driver.findElement(By.name("reg_email__")).sendKeys("8428048828");
		driver.findElement(By.id("password_step_input")).sendKeys("Kabilraja18");
		WebElement birthDay = driver.findElement(By.id("day"));
		Select dropDown=new Select(birthDay);
		dropDown.selectByValue("18");
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		Select dropDown2=new Select(birthMonth);
		dropDown2.selectByIndex(2);
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		Select dropDown3=new Select(birthYear);
		dropDown3.selectByVisibleText("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
	}

}
