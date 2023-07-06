Feature: Portal Page
@portal
Scenario: Launching portal page and getting started
Given user opens portal page
When user clicks Get Started button
Then user should go to home page
And page title should be "NumpyNinja"