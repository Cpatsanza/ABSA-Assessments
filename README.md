![ABSA](https://cfo.co.za/wp-content/uploads/2019/05/absa-logoo.png)
# **ABSA Assignment - 22/06/2025**

This project is the results of an assessment requirement and 

 -implements a POM webUI framework using Selenium and Cucumber, with Java

 -implements an API Rest-Assured framework also with Cucumber, with Java

## Test Data

  -Pojo data was used for API framework together with property files to store API Auth 2.0 authentication data
  
  #### *Pojo-screenshot*
  
  -[Pojo-screenshot](https://github.com/Cpatsanza/ABSA-Assessments/tree/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/PojoSetUP.jpg)
  
  #### *properties with Auth 2.0*
  
  -[properties with Auth 2.0](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/Auth2.0%20in%20PropertiesFile.jpg)
  
  -Cucumber Data Table was used to store user lists for the UI web framework as seen on the Scenario outline

## Reporting

  -Cucumber reports were configured and generated and stored in Target Folder

  -Test evidence is on this link and here are screenshots of some reports

#### *Cucumber Report Screenshots*

  -[Part A](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/cucumber-reports-API-regression-Test-A.jpg)

  -[Part B](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/cucumber-reports-API-regression-Test-B.jpg)

#### *Actual examples of the Cucumber Reports from Test Runs*

  -[API-Regression-Report](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/cucumber-reports-API-regression-Tests.html)

  -[Web-Regression-Report](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/cucumber-reports-Web-regression-Tests.html)

## Additional Challenges

  -Implement parallel test execution-this was Implemented (see configuration using Mavin SureFire Plugin) and screenshots of test results with and without Parallel testing
 
  -[without parallel](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/Without%20Parallel%20Test.jpg)
  
  -[with parallel](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/With%20Parallel%20Test.jpg)

 #### parallel testing configuration
 
  -[parallel testing configuration](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/POM-Add-Parallel-Testing-Configuration.jpg)

 #### cross-browser with Firefox and Chrome

  -Add cross-browser testing capability-This was implemented in the BasePage and see screenshot below

  -[Cross-browser config](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/Add-Cross-Browser-Testing-Capability.jpg)

## Set Up Instructions and Project structure

  -Install Java add to environment variables

  -Install Maven add to environment variable

-Create a Java Maven Project in IDE

  -Add dependencies to POM file and download - CHECK POM FILE

  -Create PageObjects for WebUI with Locators and their methods

  -Create feature files for Scenarios to test and create step definitions, create a TestRunner file to execute tests and create Cucumber Reports -Tags include @API-Regression-Test/@Web-Regression-Test

  -Create StepDefinitions for API tests and use property file to store Auth 2.0 data

  -Create Pojo objects to store API test Data

  -Test execution can be done from Feature file, Runner file with Tags or simply using "mvn clean test" from terminal - see example run

  -[mvn test run example]([src/test/resources/Evidents for ABSA Assessment/mvn-clean-test-Results-API-Regression-Test.txt](https://github.com/Cpatsanza/ABSA-Assessments/blob/master/src/test/resources/Evidents%20for%20ABSA%20Assessment/mvn-clean-test-Results-API-Regression-Test.txt))


## Source Control

The project has been pushed to Master branch on [Github link provided](https://github.com/Cpatsanza/ABSA-Assessments.git)

Visit my ![linkedIn](https://th.bing.com/th/id/OIP.ozDiSGJlUqI6815cRlJiNAHaHa?w=186&h=186&c=7&r=0&o=7&dpr=1.5&pid=1.7&rm=3)
[ReachOut](www.linkedin.com/in/charlespatsanza)





