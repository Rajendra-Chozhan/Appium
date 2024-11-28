Feature: Validation of the Home Screen of Tata Neu Application

@ElectronicPageTest @SmokeTest
Scenario: validating the UI elements of HomePage in Tata Neu Application
    Given user successfully launches app
    Then user verifies UI elements on Home Page
    Then user clicks on Electronics section
    Then user verifies UI on Electronics screen
    
    
 @WestSidePageTest @SmokeTest
Scenario: validating the UI elements of WestSide Page in Tata Neu Application
    Given user successfully launches app
    Then user verifies UI elements on Home Page
    Then user clicks on fashion section
    Then user clicks on WestSide section
    Then user verifies UI of WestSide Page
    
