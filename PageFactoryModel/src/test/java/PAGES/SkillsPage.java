package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage {
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")
	WebElement ADMIN;
	
	@FindBy(xpath="(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[4]")
	WebElement QUALIFICATION;
	
	@FindBy(xpath="(//a[@class=\"oxd-topbar-body-nav-tab-link\"])[1]")
	WebElement SKILLS;
	
	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	WebElement ADD;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement SKNAME;
	
	@FindBy(xpath="//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")
	WebElement SKDES;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement SAVE;
	

	public void Skills(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public void SkillRecord(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> Skill = dataTable.asMaps(String.class, String.class);

		ADMIN.click();
		QUALIFICATION.click();
		SKILLS.click();

		for (int i = 0; i < Skill.size(); i++) {
			String SName = Skill.get(i).get("SKILLNAME");
			String SDes = Skill.get(i).get("SKILLDES");
			ADD.click();
			SKNAME.sendKeys(SName);
			SKDES.sendKeys(SDes);
			SAVE.click();

		}
	}
 
}
