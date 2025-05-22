package STEPS1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition {

	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String URL) {
	    driver.get(URL);
	}
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String UNAME, String PWORD) {
		driver.findElement(By.name("username")).sendKeys(UNAME);
		driver.findElement(By.name("password")).sendKeys(PWORD);
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@Then("browse to NATIONALITY Page")
	public void browse_to_nationality_page() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
        driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
        driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	}
	
	@When("Add NATIONALITY Records with NNAME as {string}")
	public void add_nationality_records_with_nname_as(String NAME) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NAME);
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	}
	
	@When("Click on logout button")
	public void click_on_logout_button() {
	    //WELCOME
		//LOGOUT
	}
	
	@Then("Close Browser")
	public void close_browser() {
	    //driver.quit();
	}

	
}
