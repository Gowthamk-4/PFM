package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	WebDriver driver;

	public void Skills(WebDriver driver1) {

		this.driver = driver1;
		//PageFactory.initElements(driver, this);

	}

	public void SkillRecord(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> Skill = dataTable.asMaps(String.class, String.class);

		driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")).click();
		driver.findElement(By.xpath("(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[4]")).click();
		driver.findElement(By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-link\"])[1]")).click();

		for (int i = 0; i < Skill.size(); i++) {
			String SName = Skill.get(i).get("SKILLNAME");
			String SDes = Skill.get(i).get("SKILLDES");
			driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SName);
			driver.findElement(By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")).sendKeys(SDes);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		}
	}
 
}
