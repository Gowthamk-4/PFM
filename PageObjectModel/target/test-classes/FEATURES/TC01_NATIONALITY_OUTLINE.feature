Feature: Create NATIONALITY Record Automation in orange HRM

Background: Common Steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario Outline: TC01  NATIONALITY Record
		And Navigate to login page
		|USERNAME1|PASSWORD1|
		|Admin|admin123|
    Then browse to NATIONALITY Page
    |NATIONNAME|
    |APPLE|
    |APPLE1|
    |APPLE2|   
    When Click on logout button
    Then Close Browser
    




