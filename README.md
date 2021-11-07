## About this template

This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.

## Installing this template

    gauge --install java_maven_selenium

## Building on top of this template
Libraries
This app takes use of the following libraries:

## Scenario
* User gets the title of the page
* Page title should be "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi"
* User click on search box
* User send to "bilgisayar" to the search box
* User click on search button
* User click on second page
* User gets the url of the page
* Page link should be "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2"
* Product random click
* Closed policy alert
* Add to basket
* page price and basket price should be equals
* Click to basket
* Increase basket count
* Should be basket count two
* Delete items in basket
* Should be basket is empty

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




### Defining Specifications

* Add more specifications on top of sample specification.

Read more about [Specifications](http://getgauge.io/documentation/user/current/specifications/README.html)

### Writing the implementations

This is where the java implementation of the steps would be implemented. Since this is a Selenium based project, the java implementation would invoke Selenium APIs as required.

_We recommend considering modelling your tests using the [Page Object](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) pattern, and the [Webdriver support](https://github.com/SeleniumHQ/selenium/wiki/PageFactory) for creating them._

- Note that every Gauge step implementation is annotated with a `Step` attribute that takes the Step text pattern as a parameter.
Read more about [Step implementations in Java](http://getgauge.io/documentation/user/current/test_code/java/java.html)

### Execution

* You can execute the specification as:

```
mvn test
```
