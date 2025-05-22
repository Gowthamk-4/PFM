package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage {
    WebDriver driver;
    
    public void Jobs(WebDriver driver1){
    	
    	this.driver = driver1;
    }
    
    	public void JobRecord(io.cucumber.datatable.DataTable dataTable) {
    		
    			
    	 	List<Map<String, String>> Job=dataTable.asMaps(String.class,String.class);
    		
    		 
    		 
    		 driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")).click();
    		 driver.findElement(By.xpath("(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")).click();
    		 driver.findElement(By.xpath("(//a[@role=\"menuitem\"])[1]")).click();
    		 for(int i=0;i<Job.size();i++) {
    			 String JName=Job.get(i).get("JOBNAME");		
    			 String JDes=Job.get(i).get("JOBDES");
    			 String JNote=Job.get(i).get("JOBNOTE");
    		 driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
    		 driver.findElement(By.xpath("(//input[@data-v-1f99f73c])[2]")).sendKeys(JName);
    		 driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys(JDes);
    		 driver.findElement(By.xpath("//textarea[@placeholder=\"Add note\"]")).sendKeys(JNote);
    		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    		 }
    	}
    			
    	
    }
	
	
