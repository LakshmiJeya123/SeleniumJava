package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("login")).sendKeys("demosalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("contactsMain")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.name("firstName")).sendKeys("Jeyalakshmi");
driver.findElement(By.id("lastNameField")).sendKeys("Varatharajan");
driver.findElement(By.className("smallSubmit")).click();
System.out.println(driver.getTitle());
	}

}
