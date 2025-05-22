
Feature: Create Skills Record in Orange HRM

Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

 Scenario: Creating Skills Record
  
    And Navigate to login page
    |USERNAME|PASSWORD|
    |Admin|admin123|
    And Navigate to Skill Page
    |SKILLNAME|SKILLDES|
    |TesterrrR3|L233|
    |QAQ|L12|
    |QAE2|L24|
    Then Logout from webpage
    And close the browser
    
    
   