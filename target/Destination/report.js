$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8284086300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to register successfully so that user can use all the functionality of my website",
  "description": "",
  "id": "registration-feature;user-should-be-able-to-register-successfully-so-that-user-can-use-all-the-functionality-of-my-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@trail"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Register Button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters all the required details of registration form",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 94487900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Register_Button()"
});
formatter.result({
  "duration": 479245800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_the_required_details_of_registration_form()"
});
formatter.result({
  "duration": 4969504000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "duration": 29276400,
  "status": "passed"
});
formatter.after({
  "duration": 80329400,
  "status": "passed"
});
});