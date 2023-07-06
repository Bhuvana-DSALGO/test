Feature: Stack Module
@stack
Scenario Outline: The user is able to signin with registered credential
Given The user is in the Sign in page
When The user enters a valid "<username>" and "<password>"
Then click login button to verify and pagetitle is "NumpyNinja"
	Examples: 
      | username   | password  |
      | Sudha2907@gmail.com | Sara@2015 |
      
Scenario: User navigated to "Stack" page
Given The user is in the Home page after logged in
When The user selecting "Stack" item from the drop down menu
Then The user should be directed to "Stack" Page
 
Scenario: The user is able to navigate to "operations in Stack page"
Given The user is in the "Stack" page after logged in
When  The user clicks on the "Operations in Stack" link of Stack page
Then The user should be directed to "Operations in Stack" Page 
 
Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Operations in Stack" page of Stack module after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test 
 
Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
Scenario: The user is able to navigate to "Implementation" Page
Given The user is in the "Stack" page after logged in
When The user clicks on the "Implementation" link of Stack page
Then The user should be directed to "Implementation" Page

Scenario: The user is able to navigate to Implementation page having an tryeditor
Given The user is on the "Implementation" page of Stack module after logged in
When The user clicks Try Here button 
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
Scenario: The user is able to navigate to "Applications" Page
Given The user is in the "Stack" page after logged in
When The user clicks on the "Applications" link of Stack page
Then The user should be directed to "Applications" Page

Scenario: The user is able to navigate to Applications page having an tryeditor
Given The user is on the "Applications" page of Stack module after logged in
When The user clicks Try Here button 
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
Scenario: The user is able to navigate to "Practice Questions" in stack Page
Given The user is in the "Stack" page after logged in
When  The user clicks on the "Operations in Stack" link of Stack page
When The user clicks on the "Practice Questions" link of Stack page
Then The user should be directed to "Practice Questions" Page