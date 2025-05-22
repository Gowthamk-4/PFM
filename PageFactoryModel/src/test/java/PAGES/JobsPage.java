package PAGES;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage {
    WebDriver driver;
    
    @FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[1]")
    WebElement ADMIN;
    
    @FindBy(xpath="(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")
    WebElement JOB;
    
    @FindBy(xpath="(//a[@role=\"menuitem\"])[1]")
    WebElement JOBTITLE;
    
    @FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    WebElement ADD;
    
    @FindBy(xpath="(//input[@data-v-1f99f73c])[2]")
    WebElement JOBNAME;
    
    @FindBy(xpath="//textarea[@placeholder=\"Type description here\"]")
    WebElement JOBDES;
    
    @FindBy(xpath="//textarea[@placeholder=\"Add note\"]")
    WebElement JOBNOTE;
    
    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement SAVE;
    
    public void Jobs(WebDriver driver1){
    	
    	this.driver = driver1;
    	PageFactory.initElements(driver, this);
    	
    	
    }
    
    	public void JobRecord(io.cucumber.datatable.DataTable dataTable) {
    		
    			
    	 	List<Map<String, String>> Job=dataTable.asMaps(String.class,String.class);
    		
    		 
    		 
    	 	ADMIN.click();
    	 	JOB.click();
    	 	JOBTITLE.click();
    		 for(int i=0;i<Job.size();i++) {
    			 String JName=Job.get(i).get("JOBNAME");		
    			 String JDes=Job.get(i).get("JOBDES");
    			 String JNote=Job.get(i).get("JOBNOTE");
    			 ADD.click();
    			 JOBNAME.sendKeys(JName);
    			 JOBDES.sendKeys(JDes);
    			 JOBNOTE.sendKeys(JNote);
    			 SAVE.click();
    		 }
    	}
    			
    	
    }
	
	
