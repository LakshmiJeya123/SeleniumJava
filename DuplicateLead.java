package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login");

driver.findElement(By.id("login")).sendKeys("demosalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SBI Bank");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeyalakshmi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Varatharajan");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nivetha");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cash");
driver.findElement(By.id("createLeadForm_description")).sendKeys("For Savings");
driver.findElement(By.name("primaryEmail")).sendKeys("nivelakshmi@gmail.com");
driver.findElement(By.className("smallSubmit")).click();
System.out.println(driver.getTitle());
driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("YES Bank");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
driver.findElement(By.className("smallSubmit")).click();
System.out.println(driver.getTitle());


	}

}
