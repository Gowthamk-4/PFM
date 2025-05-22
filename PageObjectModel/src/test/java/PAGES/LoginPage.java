package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public void Login(WebDriver driver1) {

		this.driver = driver1;
		//PageFactory.initElements(driver, this);

	}

	public void URL(String URL) {
		driver.get(URL);
	}

	public void LoginDetails(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> BROWSE = dataTable.asMaps(String.class, String.class);
		String username = BROWSE.get(0).get("USERNAME");
		String password = BROWSE.get(0).get("PASSWORD");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
