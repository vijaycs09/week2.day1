package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager
				WebDriverManager.chromedriver().setup();
			//Launch the browser
				ChromeDriver driver = new ChromeDriver();
			//Navigate to URL
				driver.get("http://leaftaps.com/opentaps/control/main");
			//Maximize the browser
				driver.manage().window().maximize();
			//Input values into the user name and password field and then click Submit
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Freshkites");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("raja");
				driver.findElement(By.name("departmentName")).sendKeys("Development");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("This is for testing");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
				
				WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select select = new Select(state);
				select.selectByVisibleText("New York");
				
				driver.findElement(By.name("submitButton")).click();
				 String title = driver.getTitle();
				 System.out.println(title);

	}

}
