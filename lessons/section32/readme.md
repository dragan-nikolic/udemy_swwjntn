# Overview
TestNG Data Provider example

## Prerequisites

* install Maven
* install VS Code Java support (including Maven support)

## Maven commands

### How to create Maven project using VSCode

Open Command Pallete then run:

`Maven: Generate from Maven Archetype`

use archetype-quickstart-jdk8

### How to build JAR file

`mvn clean package`

### How to run tests

#### Run all tests
`mvn test`

#### Run single tests
`mvn test -Dtest=<classname>#<testname>`

## Add Dependencies

### TestNG dependency

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.14.3</version>
            <scope>test</scope>
        </dependency>


## Links

* https://code.visualstudio.com/docs/languages/java
* http://www.vogella.com/tutorials/ApacheMaven/article.html
