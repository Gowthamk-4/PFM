
Feature: Create Jobs Record in Orange HRM

Background: common steps 
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

 Scenario: Creating Job Record
  
    And Navigate to login page
    |USERNAME|PASSWORD|
    |Admin|admin123|
    And Navigate to Job Page
    |JOBNAME|JOBDES|JOBNOTE|
    |Testerrrs|Auto1|L22|
    |QA1|Manuall|L11|
    |QAE1|Auto1|L21|
    Then Logout from webpage
    And close the browser
    
    
   