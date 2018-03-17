# TestNGSoftAssertSeleniumWebdrievr

SoftAssert in TestNG is nothing but brother of Assert , the SoftAssert not only asserts a given conditions, but also gives a chance to user to continue the execution after Assertion failure.

It is not mandatory to continue the execution of test case after the assertion failue, but sometimes you might be checking a minor value. So just because minor verification failed you may not want to stop the execution of the testcase.

Anyways once the soft assertion is failed the TestNG throws AssertionError, instead of throwing error immediately TestNG throws the error just before completing the testcase.
