
package week4.day5Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		Select dropDown=new Select(findElement);
		dropDown.selectByVisibleText("Myself");
		driver.findElement(By.id("NAME")).sendKeys("Kabilan");
		driver.findElement(By.id("gendermale")).click();
		WebElement birthDay = driver.findElement(By.id("DOBDAY"));
		Select dropDown1=new Select(birthDay);
		dropDown1.selectByValue("18");
		WebElement birthMonth = driver.findElement(By.id("DOBMONTH"));
		Select dropDown2=new Select(birthMonth);
		dropDown2.selectByVisibleText("Mar");
		WebElement birthYear = driver.findElement(By.id("DOBYEAR"));
		Select dropDown3=new Select(birthYear);
		dropDown3.selectByVisibleText("1999");
		WebElement findElement2 = driver.findElement(By.id("RELIGION"));
		Select dropDown4=new Select(findElement2);
		dropDown4.selectByValue("1");
		WebElement findElement3= driver.findElement(By.id("MOTHERTONGUE"));
		Select dropDown5=new Select(findElement3);
		dropDown5.selectByVisibleText("Tamil");
		WebElement findElement4 = driver.findElement(By.id("COUNTRY"));
		Select dropDown6=new Select(findElement4);
		dropDown6.selectByValue("98");
		driver.findElement(By.id("MOBILENO")).sendKeys("8428048828");
		driver.findElement(By.id("EMAIL")).sendKeys("kabilraja1803@gmail.com");
		driver.findElement(By.xpath("(//input[@id='PASSWORD'])[3]")).sendKeys("KabilRaja18");
		driver.findElement(By.xpath("//input[@class='hp-button txtupper hp-regbtn']")).click();
		
		
	}

}
