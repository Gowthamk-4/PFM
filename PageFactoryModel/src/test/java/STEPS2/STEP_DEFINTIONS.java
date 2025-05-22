package STEPS2;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class STEP_DEFINTIONS {
	
	WebDriver driver;
	private DataTable dataTable;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@When("User opens URL {string}")
	public void user_opens_url(String TESTURL) {
	   driver.get(TESTURL);
	}
	@When("Navigate to login page")
	public void navigate_to_login_page(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> BROWSE=dataTable.asMaps(String.class,String.class);
		String username12=BROWSE.get(0).get("USERNAME1");
		String password12=BROWSE.get(0).get("PASSWORD1");
		
		driver.findElement(By.name("username")).sendKeys(username12);
		driver.findElement(By.name("password")).sendKeys(password12);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("browse to NATIONALITY Page")
	public void browse_to_nationality_page(io.cucumber.datatable.DataTable dataTable) {
		

		List<Map<String, String>> NATIONALITY=dataTable.asMaps(String.class,String.class);
		
		 for(int i=0;i<NATIONALITY.size();i++) {
		 String NName=NATIONALITY.get(i).get("NATIONNAME");		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	    driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
	    driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NName);	
	    driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	}
	 }

	@When("Click on logout button")
	public void click_on_logout_button() {
	    //welcome
		//logout
	}
	@Then("Close Browser")
	public void close_browser() throws InterruptedException {
		
	 Thread.sleep(5000);
	   driver.quit();
	}



}
