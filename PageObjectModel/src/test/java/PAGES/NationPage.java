package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NationPage {
	WebDriver driver;
	
	public void Nation(WebDriver driver1) {
	   
		this.driver= driver1;
	
	}
	
	
	public void NationRecord(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> National=dataTable.asMaps(String.class,String.class);
		
		 driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")).click();
		 driver.findElement(By.xpath("(//a[@class=\"oxd-topbar-body-nav-tab-item\"])[1]")).click();
		 for(int i=0;i<National.size();i++) {
		 String NName=National.get(i).get("NATIONNAME");
		 driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		 driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys(NName);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 }	
		 }
	}
	
