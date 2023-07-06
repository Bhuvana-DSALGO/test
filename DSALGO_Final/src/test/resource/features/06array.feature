Feature: Array Module
@array
Scenario: user is on the array page
Given The user is in the Home page after logged in
And user clicks on the dropdown in array module
 
Scenario Outline: User clicks on submodule
Given  user clicks on array in python submodule and user clicks on tryhere button
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and user get the output in the console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline:  User clicks on submodule2
Given user clicks on array using list submodule and user clicks on tryhere button
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and capture the output in console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline:  User clicks on submodule3
Given user clicks on Basic operations in list and user clicks on tryhere button
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and capture the output in console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline:  User clicks on submodule4
Given user clicks on Application of array and user clicks on tryhere button
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and capture the output in console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline: user clicks on Practice Question
Given user clicks on Practice Question
When user clicks on search the array and clear the try editor
Then user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
And user clicks on submit button and capture the output in console 
Examples:
|SheetName| |rowNumber|
|pythonCode| |2|

Scenario Outline:  User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline: user clicks on Practice Question1
Given user clicks on max consecutive ones and clear the try editor
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and capture the output in console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline: user clicks on Practice Question2
Given user clicks on Find numbers with even number of digits and clear the try editor
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and capture the output in console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|

Scenario Outline: user clicks on Practice Question3
Given user clicks on the squares of sorted array and clear the try editor
When user sends valid python code in try editor from excel sheet "<SheetName>" and <rowNumber>
Then user clicks on run button and capture the output in console
Examples:
|SheetName| |rowNumber|
|pythonCode| |0|

Scenario Outline: User sends invalid syntax
Given user sends invalid syntax in try editor from excel sheet "<SheetName>" and <rowNumber> 
When user clicks on run button 
Then user gets the alert message and navigates back
Examples:
|SheetName| |rowNumber|
|pythonCode| |1|
