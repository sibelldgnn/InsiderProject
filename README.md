## About this template

This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.

## Installing this template

    gauge --install java_maven_selenium

## Building on top of this template
Libraries
This app takes use of the following libraries:

## Scenario

Automation Start
* User gets the title of the page
* Page title should be "Insider | Platform for individualized, cross-channel customer experiences"
* User click on More
* User click on Careers
* User gets the text Location
* User gets the text Teams
* Checks are insider blocks
* Click accept
* Click find your dream job
* Click filter location
* Select filter location
* Click filter department
* Select filter department
* Check job list
* Click job item
* Check to Jobs Details
* Click apply for this job
* Check lever application


## Libraries

Selenium (•_•) Selenium is an umbrella project encapsulating a variety of tools and libraries enabling web browser automation.
![image](https://user-images.githubusercontent.com/39453835/138594068-b8aee26c-518b-4181-901b-38c695475482.png)

Junit (•_•) JUnit is a unit testing framework for the Java programming language. JUnit has been important in the development of test-driven development
![Junit](https://github.com/sibelldgnn/TestiniumWebAutomationProject/blob/master/1_7sxGGmnUVforqlxb_sM4dg.gif)

Assertion : All the assertions are in the Assert class.This class provides a set of assertion methods, useful for writing tests. Only failed assertions are recorded. Some of the important methods of Assert class are as follows;
* void assertEquals(boolean expected, boolean actual)

Checks that two primitives/objects are equal.

* void assertTrue(boolean condition)

Checks that a condition is true.
	
* void assertFalse(boolean condition)

Checks that a condition is false.

	
* void assertNotNull(Object object)

Checks that an object isn't null.


* void assertNull(Object object)

Checks that an object is null.

	
* void assertSame(object1, object2)

The assertSame() method tests if two object references point to the same object.
	
* void assertNotSame(object1, object2)

The assertNotSame() method tests if two object references do not point to the same object.

	
* void assertArrayEquals(expectedArray, resultArray);

The assertArrayEquals() method will test whether two arrays are equal to each other.




### Execution

* You can execute the specification as:

```
mvn test
```
