
Feature: Create Nationality Record in Orange HRM

Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

 Scenario: Creating Nationality Record
  
    And Navigate to login page
    |USERNAME|PASSWORD|
    |Admin|admin123|
    And Navigate to Nationality Page
    |NATIONNAME|
    |INDIANSSS|
    |INDIANS11|
    |INDIANS21|
    Then Logout from webpage
    And close the browser
    
    
   