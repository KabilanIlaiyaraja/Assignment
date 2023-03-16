package week4.day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a")).click();
			WebElement element = driver.findElement(By.xpath("(//span[@class='tabletext'])[4]"));
			String text2 = element.getText();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			WebElement verify = driver.findElement(By.xpath("(//span[@class='tabletext'])[4]"));
			String text = verify.getText();
			if (text2.equals(text)) {
				System.out.println("Duplicate Lead");
				
			} else {
				System.out.println("Not Duplicate Lead");

			}
			driver.close();
			
	}

}
