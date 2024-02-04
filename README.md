# Tendable Tech Challenge
## Introduction :
This is the test challenge assigned for the web application of Tendable. In which I have to test web application for given requirements.
## prerequisite :
The prerequisite required to the test is Java having version minium 1.8 or Java 8, IDE eg. Eclipse or Intellij, The framework used is TestNG and Builde managment Maven. Also the knowledge of POM design pattern which used for design purpose.
## Execution :
Run the test by right click on the TestNG XML file and select Run As => TestNG Suite. Once the testng. xml file has run, we can see the results in the console.
## Result & Report : 
After successful execution of suite refresh the project.
<br> Method-1: emailable-report.html
<br> test-output --> emailable-report.html
<br> Click on option “emailable-report.html”
<br> Click on option web browser
<br> Method-2: index.html
<br> test-output --> index.html
<br> Right click on the index.html from the project directory.
<br> Select option open with web browser option.
## Strategy : 
1. For accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable?
<br> In this case the above mention menus are varified using the isDisplayed();
2. Verify that the "Request a Demo" button is present and active on each of the aforementioned top-level menu pages.
<br> In this case the "Request a Demo" button is asserted using isDisplayed(); & isEnabled(); to check presence and active on each of the menu pages.
3. Navigate to the "Contact Us" section, choose "Marketing", and complete the form excluding the "Message" field. On submission, an error should arise.
<br> In this case first navigate to form as using click(); via Contact Us --> Marketing.
<br> Fill the form excluding the message section, for input here used sendKeys(); and Select class for dropdown list.
<br> Excluding message section click on submit button error message is displayed and this message is asserted using isDisplayed();
