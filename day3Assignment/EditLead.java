
package week4.day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {
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
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a")).click();
	String title = driver.getTitle();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String title2 = driver.getTitle();
	if (title.equals(title2)) {
		System.out.println("Title Verified ");
		
	} else {
		System.out.println("Title not verified");

	}
		
		driver.close();
	 
	
}
}
