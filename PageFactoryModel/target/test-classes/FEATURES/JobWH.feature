
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
    |Testerrrs1|Auto11|L221|
    |QA11|Manuall1|L111|
    |QAE11|Auto11|L211|
    Then Logout from webpage
    And close the browser
    
    
   