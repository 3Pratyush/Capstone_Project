# Capstone Project - Selenium Automation Framework

## Overview

This project is a Selenium Automation Testing Framework developed using Java, TestNG, Maven, and Jenkins. The framework automates various web application functionalities and demonstrates advanced Selenium concepts including window handling, alerts, shadow DOM, file upload, pagination, actions, and reporting.

---

## Tech Stack

* Java 25
* Selenium WebDriver 4.x
* TestNG
* Maven
* Jenkins
* Extent Reports
* Apache POI (Excel Support)
* Git & GitHub

---

## Project Structure

```text
Capstone_Project
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       └── resources
│
├── screenshots
├── reports
├── test-output
├── target
│
├── pom.xml
├── testng.xml
├── Jenkinsfile
├── README.md
└── .gitignore
```

---

## Features Implemented

### Selenium Concepts Covered

* Browser Launch and Navigation
* Web Element Interaction
* Explicit Waits
* Window Handling
* Multiple Tabs Handling
* Alert Handling
* Frame Handling
* Actions Class
* JavaScript Executor
* Shadow DOM Handling
* File Upload
* File Download Verification
* Dynamic Web Tables
* Pagination Handling
* Dropdown Selection
* Checkbox and Radio Button Validation

---

## Reporting

The framework generates:

* TestNG Reports
* Maven Surefire Reports
* Screenshots for Execution
* Extent Reports

Generated folders:

```text
reports/
screenshots/
test-output/
target/surefire-reports/
```

---

## Prerequisites

Install the following before execution:

* Java JDK 25
* Maven 3.9+
* Google Chrome Browser
* Git
* Jenkins

Verify installation:

```bash
java -version
mvn -version
git --version
```

---

## Project Setup

### Clone Repository

```bash
git clone https://github.com/3Pratyush/Capstone_Project.git
```

### Navigate to Project

```bash
cd Capstone_Project
```

### Install Dependencies

```bash
mvn clean install
```

---

## Running Tests

### Execute All Tests

```bash
mvn test
```

### Execute Using TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## Jenkins Integration

The project supports Jenkins CI/CD integration.

### Jenkins Pipeline Stages

1. Checkout Source Code
2. Clean Project
3. Build Project
4. Execute TestNG Tests
5. Generate Reports
6. Archive Artifacts

### Jenkinsfile

Pipeline is configured using:

```text
Jenkinsfile
```

---

## Test Execution Summary

Example Execution Result:

```text
Tests Run : 15
Failures  : 0
Errors    : 0
Skipped   : 0
```

---

## GitHub Repository

Repository URL:

https://github.com/3Pratyush/Capstone_Project

---

## Author

Pratyush Sahoo

QA Automation Engineer

---

## Future Enhancements

* Selenium Grid Integration
* Docker Integration
* Cross Browser Execution
* Parallel Execution
* Allure Reporting
* API Automation Integration
* Database Validation

---

## License

This project is created for learning, demonstration, and automation framework development purposes.
