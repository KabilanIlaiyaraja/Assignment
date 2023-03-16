package week4.day3Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Kabilan");
		 driver.findElement(By.id("lastNameField")).sendKeys("Ilaiyaraja");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kabil");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raja");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality Assurance");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Software Testing");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kabilraja1803@gmail.com");
		 WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select dropDown=new Select(element);
		 dropDown.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Automation Testing");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 
	}

}
