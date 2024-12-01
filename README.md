


https://github.com/user-attachments/assets/deba55d5-501c-4cec-bd1a-a983349722b9

# Cross-Browser Testing Using TestNG Suite

This repository demonstrates how to perform **cross-browser testing** for any website using the TestNG framework. TestNG simplifies the process of defining and executing test suites, enabling flexible and efficient test case management.

---

## Table of Contents

1. [Overview](#overview)
2. [Objective](#objective)
3. [Prerequisites](#prerequisites)
4. [How TestNG Suite Works](#how-testng-suite-works)
5. [Getting Started](#getting-started)
6. [License](#license)

---

## Overview

A **TestNG test suite** is a collection of test cases organized to validate the behavior of a software program. While test suites cannot be defined directly in source code, they are represented by an XML file (`testng.xml`) that outlines the tests to be executed.

**Key features of a TestNG suite:**

- Suites can include multiple `<test>` sections.
- The root tag `<suite>` defines the overall structure and configuration.
- Enables configuration for executing tests across multiple browsers.

---

## Objective

The primary goal of this project is to set up and execute **cross-browser testing** for a website using **Chrome**, **Firefox**, and **Edge**, ensuring consistency in functionality across different web environments.

---

## Prerequisites

Ensure the following are installed and configured on your system:

- **Java Development Kit (JDK)** 
- **Integrated Development Environment (IDE)** (e.g., Eclipse or IntelliJ IDEA)
- **Apache Maven** (for managing dependencies)
- **Browsers:**
  - Google Chrome
  - Mozilla Firefox
  - Microsoft Edge

---

## How TestNG Suite Works

### 1. Test Suite Structure

A TestNG suite is represented by an XML file, `testng.xml`, which defines:

- The test cases to execute.
- Configuration for running tests across different browsers.
- Organization of `<test>` sections to modularize test execution.

### 2. Example Suite Definition

```xml
<suite name="CrossBrowserSuite">
    <test name="ChromeTest">
        <!-- Chrome-specific test configuration -->
    </test>
    <test name="FirefoxTest">
        <!-- Firefox-specific test configuration -->
    </test>
    <test name="EdgeTest">
        <!-- Edge-specific test configuration -->
    </test>
</suite>
