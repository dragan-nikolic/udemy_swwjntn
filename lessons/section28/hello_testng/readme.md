# Overview
Simple TesstNG example

## Prerequisites

* install Maven
* install VS Code Java support (including Maven support)

## Maven commands

### How to create Maven project using VSCode

Open Command Pallete then run:

`Maven: Generate from Maven Archetype`

### How to build JAR file

`mvn clean package`

### How to run tests

`mvn test`

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
