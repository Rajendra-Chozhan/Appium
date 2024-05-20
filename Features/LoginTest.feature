Feature: Validation of the LoginScreen of Tata Neu Application

  @SmokeTest @LoginTest
Scenario Outline: validating the login screen of Tata Neu Application
    Given user successfully launches app
    When user click the Account button in bottom of the App
    Then user clicks on Signin button text displayed the screen
    And user enter number in Mobile Number "<phonenumber>" in Field
    Then user clicks on Number in screen
    Then user clicks on GET OTP in screen
   
    Examples:
    |phonenumber|
    |8838392831 |
    
    
@HomePageTest @SmokeTest
Scenario: validating the UI elements of HomePage in Tata Neu Application
    Given user successfully launches app
    Then user verifies UI elements on Home Page
  
   
   
    
    @LogoutTest @SmokeTest
Scenario Outline: validating the login and logout functionality of Tata Neu Application
    Given user successfully launches app
    When user click the Account button in bottom of the App
    Then user clicks on Signin button text displayed the screen
    And user enter number in Mobile Number "<phonenumber>" in Field
    Then user clicks on Number in screen
    Then user clicks on GET OTP in screen
    Then user verifies UI elements on Home Page
    Then user click profile icon on top of the screen
    Then user logs out of the application
   
    Examples:
    |phonenumber|
    |8838392831 |   
    
     @ProfilePageTest @SmokeTest
Scenario Outline: validating the login and logout functionality of Tata Neu Application
    Given user successfully launches app
    When user click the Account button in bottom of the App
    Then user clicks on Signin button text displayed the screen
    And user enter number in Mobile Number "<phonenumber>" in Field
    Then user clicks on Number in screen
    Then user clicks on GET OTP in screen
    Then user click profile icon on top of the screen
    Then user verifies UI elements on Profile Page
    Then user logs out of the application
   
    Examples:
    |phonenumber|
    |8838392831 |
    
