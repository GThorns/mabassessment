$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\AR_CreateALead.feature");
formatter.feature({
  "name": "AR - Lead Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a lead as an AR",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Platform",
  "keyword": "Given "
});
formatter.match({
  "location": "ARLeadActionsSteps.java:24"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in as an AR",
  "keyword": "When "
});
formatter.match({
  "location": "ARLeadActionsSteps.java:28"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Add New Lead",
  "keyword": "And "
});
formatter.match({
  "location": "ARLeadActionsSteps.java:33"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter New Lead Details",
  "keyword": "And "
});
formatter.match({
  "location": "ARLeadActionsSteps.java:37"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit",
  "keyword": "Then "
});
formatter.match({
  "location": "ARLeadActionsSteps.java:41"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The success toast message appears",
  "keyword": "And "
});
formatter.match({
  "location": "ARLeadActionsSteps.java:45"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //app-page-header/mab-message[1]/div[1]/div[1]/div[1]/div[1]/kal-message-box[1]/div[1] (tried for 90 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat com.tech.selenium.pageobjects.ARLeadActionsPage.successToastMessage(ARLeadActionsPage.java:176)\r\n\tat com.tech.selenium.stepdefinitions.ARLeadActionsSteps.lambda$6(ARLeadActionsSteps.java:46)\r\n\tat ✽.The success toast message appears(src\\test\\resources\\features\\AR_CreateALead.feature:9)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//app-page-header/mab-message[1]/div[1]/div[1]/div[1]/div[1]/kal-message-box[1]/div[1]\"}\n  (Session info: chrome\u003d98.0.4758.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAB1966\u0027, ip: \u0027192.168.1.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.54, chrome: {chromedriverVersion: 98.0.4758.48 (d869ab3eda606..., userDataDir: C:\\Users\\GINA~1.THO\\AppData...}, goog:chromeOptions: {debuggerAddress: localhost:58488}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 00bb0ca09fc291f928771ba110dbb362\n*** Element info: {Using\u003dxpath, value\u003d//app-page-header/mab-message[1]/div[1]/div[1]/div[1]/div[1]/kal-message-box[1]/div[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:641)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:638)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat com.tech.selenium.pageobjects.ARLeadActionsPage.successToastMessage(ARLeadActionsPage.java:176)\r\n\tat com.tech.selenium.stepdefinitions.ARLeadActionsSteps.lambda$6(ARLeadActionsSteps.java:46)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java8.Java8StepDefinition.execute(Java8StepDefinition.java:112)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:44)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:67)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:22)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:72)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:122)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:64)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:131)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});