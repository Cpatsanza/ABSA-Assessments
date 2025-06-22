![ABSA](https://cfo.co.za/wp-content/uploads/2019/05/absa-logoo.png)
# **ABSA Assignment - 22/06/2025**

This project is the results of an assessment requirement and 

 -implements a POM webUI framework using Selenium and Cucumber, with Java

 -implements an API Rest-Assured framework also with Cucumber, with Java

## Test Data

- Pojo data was used for API framework together with property files to store API Auth 2.0 authentication data
  
  #### *Pojo-screenshot*
  
  -(src/test/resources/Evidents for ABSA Assessment/PojoSetUP.jpg)
  
  #### *properties with Auth 2.0*
  
  -(src/test/resources/Evidents for ABSA Assessment/Auth2.0 in PropertiesFile.jpg)
  
- Cucumber Data Table was used to store user lists for the UI web framework as seen on the Scenario outline

## Reporting

-Cucumber reports were configured and generated and stored in Target Folder

-Test evidence is on this link and here are screenshots of some reports

#### *Cucumber Report Screenshots*

(src/test/resources/Evidents for ABSA Assessment/cucumber-reports-API-regression-Test-A.jpg,src/test/resources/Evidents for ABSA Assessment/cucumber-reports-API-regression-Test-B.jpg)

#### *Actual examples of the Cucumber Reports from Test Runs*

(src/test/resources/Evidents for ABSA Assessment/cucumber-reports-API-regression-Tests.html,src/test/resources/Evidents for ABSA Assessment/cucumber-reports-Web-regression-Tests.html)

## Additional Challenges

-Implement parallel test execution-this was Implemented (see configuration using Mavin SureFire Plugin) and screenshots of test results with and without Parallel testing

 without parallel(src/test/resources/Evidents for ABSA Assessment/Without Parallel Test.jpg)

 with parallel(src/test/resources/Evidents for ABSA Assessment/With Parallel Test.jpg)

 #### parallel testing configuration
 
 (src/test/resources/Evidents for ABSA Assessment/POM-Add-Parallel-Testing-Configuration.jpg)

 #### cross-browser with Firefox and Chrome

 - Add cross-browser testing capability-This was implemented in the BasePage and see screenshot below

 (src/test/resources/Evidents for ABSA Assessment/Add-Cross-Browser-Testing-Capability.jpg)

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

mvn test run example(src/test/resources/Evidents for ABSA Assessment/mvn-clean-test-Results-API-Regression-Test.txt)


## Source Control

The project has been pushed to Master branch on [Github link provided](https://github.com/Cpatsanza/ABSA-Assessments.git)






