package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NationPage {
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")
	WebElement ADMIN;
	
	@FindBy(xpath="(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[1]")
	WebElement NATIONALITIES;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
	WebElement ADD;
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement NATIONNAME;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement SAVE;
	
	
	
	public void Nation(WebDriver driver1) {
	   
		this.driver= driver1;
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void NationRecord(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> National=dataTable.asMaps(String.class,String.class);
		
		 ADMIN.click();
		 NATIONALITIES.click();
		 for(int i=0;i<National.size();i++) {
		 String NName=National.get(i).get("NATIONNAME");
		 ADD.click();
		 NATIONNAME.sendKeys(NName);
		 SAVE.click();
		 }	
		 }
	}
	
