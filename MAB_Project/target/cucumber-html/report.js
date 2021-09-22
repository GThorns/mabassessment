$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\MAB_Contact_Us.feature");
formatter.feature({
  "name": "MAB Contact Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Fill all the details in Request a call back section",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open MAB webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactUsSteps.java:25"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verifies they see request a call back",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsSteps.java:29"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Personal Details",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsSteps.java:33"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});