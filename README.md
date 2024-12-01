<!DOCTYPE html>
<html>
<head>
    <title>Cross-Browser Testing Using TestNG Suite</title>
</head>
<body>
    <h1>Cross-Browser Testing Using TestNG Suite</h1>
    <p>This repository demonstrates how to perform <strong>cross-browser testing</strong> for any website using the TestNG framework. TestNG simplifies the process of defining and executing test suites, enabling flexible and efficient test case management.</p>
    
    <hr>
    
    <h2>Table of Contents</h2>
    <ol>
        <li><a href="#overview">Overview</a></li>
        <li><a href="#objective">Objective</a></li>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#how-testng-suite-works">How TestNG Suite Works</a></li>
        <li><a href="#getting-started">Getting Started</a></li>
        <li><a href="#license">License</a></li>
    </ol>
    
    <hr>
    
    <h2 id="overview">Overview</h2>
    <p>A <strong>TestNG test suite</strong> is a collection of test cases organized to validate the behavior of a software program. While test suites cannot be defined directly in source code, they are represented by an XML file (<code>testng.xml</code>) that outlines the tests to be executed.</p>
    <p><strong>Key features of a TestNG suite:</strong></p>
    <ul>
        <li>Suites can include multiple <code>&lt;test&gt;</code> sections.</li>
        <li>The root tag <code>&lt;suite&gt;</code> defines the overall structure and configuration.</li>
        <li>Enables configuration for executing tests across multiple browsers.</li>
    </ul>
    
    <hr>
    
    <h2 id="objective">Objective</h2>
    <p>The primary goal of this project is to set up and execute <strong>cross-browser testing</strong> for a website using <strong>Chrome</strong>, <strong>Firefox</strong>, and <strong>Edge</strong>, ensuring consistency in functionality across different web environments.</p>
    
    <hr>
    
    <h2 id="prerequisites">Prerequisites</h2>
    <p>Ensure the following are installed and configured on your system:</p>
    <ul>
        <li><strong>Java Development Kit (JDK)</strong></li>
        <li><strong>Integrated Development Environment (IDE)</strong> (e.g., Eclipse or IntelliJ IDEA)</li>
        <li><strong>Apache Maven</strong> (for managing dependencies)</li>
        <li><strong>Browsers:</strong>
            <ul>
                <li>Google Chrome</li>
                <li>Mozilla Firefox</li>
                <li>Microsoft Edge</li>
            </ul>
        </li>
    </ul>
    
    <hr>
    
    <h2 id="how-testng-suite-works">How TestNG Suite Works</h2>
    <h3>1. Test Suite Structure</h3>
    <p>A TestNG suite is represented by an XML file, <code>testng.xml</code>, which defines:</p>
    <ul>
        <li>The test cases to execute.</li>
        <li>Configuration for running tests across different browsers.</li>
        <li>Organization of <code>&lt;test&gt;</code> sections to modularize test execution.</li>
    </ul>
    
    <h3>2. Example Suite Definition</h3>
    <pre>
&lt;suite name="CrossBrowserSuite"&gt;
    &lt;test name="ChromeTest"&gt;
        &lt;!-- Chrome-specific test configuration --&gt;
    &lt;/test&gt;
    &lt;test name="FirefoxTest"&gt;
        &lt;!-- Firefox-specific test configuration --&gt;
    &lt;/test&gt;
    &lt;test name="EdgeTest"&gt;
        &lt;!-- Edge-specific test configuration --&gt;
    &lt;/test&gt;
&lt;/suite&gt;
    </pre>
    
    <h3>3. Execution</h3>
    <p>The TestNG suite allows flexible and concurrent execution across browsers, ensuring comprehensive test coverage.</p>
    
    <hr>
    
    <h2 id="getting-started">Getting Started</h2>
    <h3>Steps to Set Up the Project:</h3>
    <ol>
        <li>Clone the repository:
            <pre>git clone &lt;repository-url&gt;</pre>
        </li>
        <li>Import the project into your IDE.</li>
        <li>Ensure Maven dependencies are installed:
            <pre>mvn install</pre>
        </li>
        <li>Configure your <code>testng.xml</code> file to specify the browsers and tests to execute.</li>
        <li>Run the tests:
            <pre>mvn test</pre>
        </li>
    </ol>
    
    <h3>Example Test Cases</h3>
    <ul>
        <li>Verify page loading in Chrome, Firefox, and Edge.</li>
        <li>Test the website's responsiveness and compatibility.</li>
    </ul>
    
    <hr>
    
    <h2 id="license">License</h2>
    <p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>
    
    <hr>
    <p>Feel free to contribute or raise issues to improve the project further!</p>
</body>
</html>
