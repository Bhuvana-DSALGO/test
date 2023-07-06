Feature: Queue Module
@queue
Scenario Outline: The user is able to signin with registered credential
Given The user is in the Sign in page
When The user enters a valid "<username>" and "<password>"
Then click login button to verify and pagetitle is "NumpyNinja"
	Examples: 
      | username   | password  |
      | Sudha2907@gmail.com | Sara@2015 |
      
Scenario: User navigated to "Queue" page
Given The user is in the Home page after logged in
When The user selecting "Queue" item from the drop down menu
Then The user should be directed to "Queue" Page
 
Scenario: The user is able to navigate to Implementation of Queue in Python link page
Given The user is in the "Queue" page after logged in
When The user clicks on "Implementation of Queue in Python" link of Queue page
Then The user should be directed to "Implementation of Queue in Python" Page
 
Scenario: The user should be directed to editor page with run button to test python code
Given The user is on the "Implementation of Queue in Python" page in queue after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test 
 
Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
Given The user is in the "Queue" page after logged in
When The user clicks on "Implementation using collections.deque" link of Queue page
Then The user should be directed to "Implementation using collections.deque" Page
 
Scenario: The user should be directed to editor page with run button to test python code
Given The user is on the "Implementation using collections.deque" page in queue after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test
  
Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

Scenario: The user is able to navigate to queue page and click on Implementation using arrays link
Given The user is in the "Queue" page after logged in
When The user clicks on "Implementation using array" link of Queue page
Then The user should be directed to "Implementation using array" Page
 
Scenario: The user should be directed to editor page with run button to test python code
Given The user is on the "Implementation using array" page in queue after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test 

Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

Scenario: The user is able to navigate to queue page and click on Implementation using arrays link
Given The user is in the "Queue" page after logged in
When The user clicks on "Queue Operations" link of Queue page
Then The user should be directed to "Queue Operations" Page
 
Scenario: The user should be directed to editor page with run button to test python code
Given The user is on the "Queue Operations" page in queue after logged in
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test 
 
Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
Scenario Outline: The user getting error message with invalid python code for Introduction page
Given The user is in a try here page having tryEditor with a Run button to test
When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
And user click on Run button
Then The user should be presented with the Run output with alert
	Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
Given The user is in the "Queue" page after logged in
When The user clicks on "Implementation of Queue in Python" link of Queue page
When The user clicks on the "Practice Questions"
Then The user should be directed to "Practice Questions" Page