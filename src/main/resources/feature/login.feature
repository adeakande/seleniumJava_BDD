#Author your name and email

Feature: Login Page


    Scenario: user to be able to login as a standard user
       Given user opens URL
       When user enters username
       And user enters password
       Then clicks on the login button
       And user is navigated to homepage
    
  
    Scenario: user to login with a locked account
       Given the user opens URL
       When the user enters username
       And the user enters password
       Then user clicks on the login button
       And user to get error message 