Feature: Tree module
@tree
Scenario Outline: The user is able to signin with registered credential
Given The user is in the Sign in page
When The user enters a valid "<username>" and "<password>"
Then click login button to verify and pagetitle is "NumpyNinja"
	Examples: 
      | username   | password  |
      | Sudha2907@gmail.com | Sara@2015 |
      
Scenario: User navigated to "Tree" page
Given The user is in the Home page after logged in
When The user selecting "Tree" item from the drop down menu
Then The user should be directed to "Tree" Page

Scenario: The user is able to navigate to Overview of Trees page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Overview of Trees" link of Tree page
Then The user should be directed to "Overview of Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Overview of Trees" page of Tree module after logged in
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

Scenario: The user is able to navigate to Terminologies Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Terminologies" link of Tree page
Then The user should be directed to "Terminologies" Page

Scenario: The user is able to navigate to Terminologies page having an tryEditor
Given The user is on the "Terminologies" page of Tree module after logged in
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
					
Scenario: The user is able to navigate to Types of Trees Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Types of Trees" link of Tree page
Then The user should be directed to "Types of Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "types of trees" page of Tree module after logged in
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
		
Scenario: The user is able to navigate to Tree Traversals Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Tree Traversals" link of Tree page
Then The user should be directed to "Tree Traversals" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "tree traversals" page of Tree module after logged in
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

Scenario:The user is able to navigate to "Traversals illustration" Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Traversals-Illustration" link of Tree page
Then The user should be directed to "Traversals-Illustration" Page

Scenario: The user is able to navigate to a Page having an tryEditor
Given The user is on the "traversals illustration" page of Tree module after logged in
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

Scenario: The user is able to navigate to "Binary trees" Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Binary Trees" link of Tree page
Then The user should be directed to "Binary Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "binary trees" page of Tree module after logged in
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

Scenario: The user is able to navigate to "Types of Binary trees" Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Types of Binary Trees" link of Tree page
Then The user should be directed to "Types of Binary Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "types of binary trees" page of Tree module after logged in
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
 
Scenario: The user is able to navigate to Implementation in Python Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Implementation in Python" link of Tree page
Then The user should be directed to "Implementation in Python" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Implementation in Python" page of Tree module after logged in
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

Scenario: The user is able to navigate to binary tree traversals Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Binary Tree Traversals" link of Tree page
Then The user should be directed to "Binary Tree Traversals" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Binary Tree Traversals" page of Tree module after logged in
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
	
Scenario: The user is able to navigate to Implementation of Binary Trees Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Implementation of Binary Trees" link of Tree page
Then The user should be directed to "Implementation of Binary Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Implementation of Binary Trees" page of Tree module after logged in
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

Scenario: The user is able to navigate to Applications of Binary Trees Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Applications of Binary trees" link of Tree page
Then The user should be directed to "Applications of Binary trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Applications of Binary Trees" page of Tree module after logged in
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

Scenario: The user is able to navigate to "Binary Search Trees" Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Binary Search Trees" link of Tree page
Then The user should be directed to "Binary Search Trees" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Binary Search Trees" page of Tree module after logged in
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

Scenario: The user is able to navigate to "Implementation of BST" Page
Given The user is in the "Tree" page after logged in
When The user clicks on the "Implementation Of BST" link of Tree page
Then The user should be directed to "Implementation Of BST" Page

Scenario: The user is able to navigate to a page having an tryEditor
Given The user is on the "Implementation Of BST" page of Tree module after logged in
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
 
 Scenario: The user validating Practice Questions page
 Given The user is in the "Tree" page after logged in
 When The user clicks on the "Overview of Trees" link of Tree page
 And The user clicks on the "Practice Questions" link of Tree page
 Then The user should be directed to "Practice Questions" of tree Page
 