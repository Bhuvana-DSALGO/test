Feature: User launches Home page
@homepage
Scenario Outline: User is on Home page and click getstarted link on  home page without sign in
Given The user opens Home Page
When The user clicks on Get Started link on homepage "<option>" without login
Then The user get warning message "You are not logged in"
Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
      
Scenario: User is on Home page and click on Register
Given The user opens Home Page
When The user clicks Sign in
Then The user should be redirected to "Login" page

Scenario: User is on Home page and click on Register
Given The user opens Home Page
When The user clicks Register
Then The user should be redirected to "Registration" page