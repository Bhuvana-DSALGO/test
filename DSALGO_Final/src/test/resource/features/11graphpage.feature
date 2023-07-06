Feature: Graph module
@graph
Scenario: User navigated to "Graph" page
Given The user is in the Home page after logged in
When The user selecting "Graph" item from the drop down menu
Then The user should be directed to "Graph" Page

Scenario: The user is able to navigate to Graph page 
Given The user is in the "Graph" page after logged in
When The user clicks "Graph" sub link of Graph Page
Then The user should be directed to "Graph" of Graph Page

Scenario:  The user should be directed to editor page with run button to test python code
Given The user is on the "Graph" sub link of Graph page
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user run the code in tryEditor with valid input for Graph page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Graph page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
Scenario: The user is able to navigate to Graph page 
Given The user is in the "Graph" page after logged in
When The user clicks "Graph Representations" sub link of Graph Page
Then The user should be directed to "Graph Representations" of Graph Page

Scenario:  User navigated to tryEditor page with Run button from Graph page
Given The user is on the "Graph Representations" sub link of Graph page
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

Scenario Outline: The user run the code in tryEditor with valid input for Graph page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Graph page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

Scenario: The user validating "Practice Questions" page
Given The user is in the "Graph" page after logged in
When The user clicks "Graph Representations" sub link of Graph Page
And The user clicks on the "Practice Questions"
Then The user should be directed to "Practice Questions" Page
And The user clicks Sign Out button