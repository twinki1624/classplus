## Description
This is an assignment where the  website { Attachment: [Link](http://computer-database.herokuapp.com/computers) } is invoked to perform the basics test cases. It has an excel file where all the valid manual tet cases have been explained. 

## Steps
1. Clone the repo in your local.
2. Open eclipse
3. Import "Final" roject fro the folder
4. Then once the project is successfully imported, click on testng.xml
5. Right click on the file.
6. Click on "Run As" > "TestNG Suite"
7. Test runs and shows the logs in console.

## Selenium
Here, I have covered 4 cases involving the CRUD basically. Starting with searching a computer name. I have used a file where user inputs are given and in order to change any input value we just need to change the content in data.properties rather than going to each variable and changing the values. I have used a searchword variable which help in implementing the search functionality. Then I have written a test for creating the computer. If the successmessage is present then the test is told to have successfully created other wise not. Following this, an edit test case is written where an exisiting computer properties are changed and saved. Finally, the last test cases is about deleting a computer. Since deleting deletes the element and hence the web-element, a try / catch exception handling is done to avoid any case failure. 

## Excel Sheet
In the excel sheet all the fucntionalities have been explained. Main outlines: search feature, arranging, creating a computer, deleting, canceling the form proces, navigating from one page index to another and opening the computer name to edit properties. Happy flows and errenous situations have been explained too in the sheet.

## Framework 
I have used TestNG framework due to its versitality in prioritizing test cases. I have set priorities for each test case in a single file and explained the browser which test to execute before the other. Also, in order to save memory and space, an aditonnal @AfterTest method is described for closing the browsers executing test.

## Conclusion 
This executes and shows the complete flow in just 4 test cases. We need to make sure the files are being read properly and the result is achieved as expected.
