# BDDFramework 

A project in order to practice designing automated test frameworks. UI automation of the Amazon Website using the Cucumber BDD Selenium Framework (A behavior-driven development tool that can be used with selenium).

What all tools are used in this project?
- Cucumber
- TestNG
- Maven
- Page Object Model design pattern
- Cucumber Reporting (custom)
  

  **Packages Hierarchy** - 

*Main package:*

 - Base --> BaseClass is used for driver initialization and other commonly used methods

 - Pages --> Page classes - Contains locators and getter/setters for each webpage

 - Runner --> Helps to run the test classes

 - Steps --> Actual Code mapping for each feature

 - Utils --> DriverManager = contains driver initialization and other commonly used functions


*Resource package:* 

 - Feature - Contains feature files with respect to each test plan (or scenario preparation)

 - Driver - Contains gecko driver, edge driver and chromedriver for cross browser testing

 - EnvironmentVariables - Stores data that are subject to change dynamically
   

ProjectReports --> Contains all basic cucumber reports mapping in different formats such as JSON, XML and HTML

POM.xml - is most important part of project which contains all the dependencies required by the project. 
