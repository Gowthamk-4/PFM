package SKILLWH;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES.HomePage;
import PAGES.LoginPage;
import PAGES.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SKWHDefinition {
	WebDriver driver;
	
	LoginPage LP;
	SkillsPage SP;
	HomePage HP;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
		
		LP = new LoginPage();
		LP.Login(driver);
		LP.URL(URL);

	}

	@When("Navigate to login page")
	public void navigate_to_login_page(io.cucumber.datatable.DataTable dataTable) {
		
		LP.Login(driver);
		LP.LoginDetails(dataTable);

	}

	@When("Navigate to Skill Page")
	public void navigate_to_skill_page(io.cucumber.datatable.DataTable dataTable) {
		
		SP = new SkillsPage();
		SP.Skills(driver);
		SP.SkillRecord(dataTable);
		

	}

	@Then("Logout from webpage")
	public void logout_from_webpage() {
		HP = new HomePage();
		HP.Home(driver);
		HP.logout_from_webpage();

	}

	@Then("close the browser")
	public void close_the_browser() {
		HP.Home(driver);
		HP.close_the_browser();

	}

}
