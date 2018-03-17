# TestNG SoftAssert Selenium Webdrievr

<a href='http://chercher.tech/java/testng-assertions-selenium-webdriver' title='softassert in selenium webdriver'><b>SoftAssert in TestNG </b></a>is nothing but brother of Assert , the SoftAssert not only asserts a given conditions, but also gives a chance to user to continue the execution after Assertion failure.

It is not mandatory to continue the execution of test case after the assertion failue, but sometimes you might be checking a minor value. So just because minor verification failed you may not want to stop the execution of the testcase.

Anyways once the soft assertion is failed the TestNG throws AssertionError, instead of throwing error immediately TestNG throws the error just before completing the testcase.

Example : Consider you have a testcase which verifies the 100 CSS properties. Do you want to stop the Execution just becase first CSS property is not matching ?, NO.

What we would like is atleaset we want to execute the testcase for all th check points/ verification so that we will get to know how may properties are matching and how many are not matching.

All the assertion present in the SoftAssert class in TestNG are non-static methods.
