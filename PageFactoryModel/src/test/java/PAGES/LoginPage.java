package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement USERNAME;
	
	@FindBy(name="password")
	WebElement PASSWORD;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LGNBTN;

	public void Login(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public void URL(String URL) {
		driver.get(URL);
	}

	public void LoginDetails(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> BROWSE = dataTable.asMaps(String.class, String.class);
		String username = BROWSE.get(0).get("USERNAME");
		String password = BROWSE.get(0).get("PASSWORD");

		USERNAME.sendKeys(username);
		PASSWORD.sendKeys(password);
		LGNBTN.click();

	}

}
