$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FirstFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Automation test for policy expert",
  "description": "",
  "id": "automation-test-for-policy-expert",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2751599444,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User to complete registration form",
  "description": "",
  "id": "automation-test-for-policy-expert;user-to-complete-registration-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Navigate to website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter firstname as \"John\" of new customer",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter lastname as \"smith\" of new customer",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select title as \"Mr\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select occupation as \"Book-Keeper\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter phonenumber \"07656445566\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter email as \"vketipisz@qmetric.co.uk \"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter DOB as day \"10\" month \"June\" and year \"1990\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter matrinal status \"Single\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter another occupation as No",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter address as area \"tw3\" and location \"Royal Mail\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter occupation address yes",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select property as \"House\" and type in \"Detached house\"",
  "keyword": "When "
});
formatter.match({
  "location": "homepagestepdefs.navigateToWebsite()"
});
formatter.result({
  "duration": 1698479461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 22
    }
  ],
  "location": "homepagestepdefs.iEnterFirstnameAsOfNewCustomer(String)"
});
formatter.result({
  "duration": 442563082,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "smith",
      "offset": 21
    }
  ],
  "location": "homepagestepdefs.iEnterLastnameAsOfNewCustomer(String)"
});
formatter.result({
  "duration": 285564209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 19
    }
  ],
  "location": "homepagestepdefs.iSelectTitleAs(String)"
});
formatter.result({
  "duration": 291741225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Book-Keeper",
      "offset": 24
    }
  ],
  "location": "homepagestepdefs.iSelectOccupationAs(String)"
});
formatter.result({
  "duration": 377274626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07656445566",
      "offset": 21
    }
  ],
  "location": "homepagestepdefs.iEnterPhonenumber(String)"
});
formatter.result({
  "duration": 330705903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vketipisz@qmetric.co.uk ",
      "offset": 18
    }
  ],
  "location": "homepagestepdefs.iEnterEmailAs(String)"
});
formatter.result({
  "duration": 427854479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 20
    },
    {
      "val": "June",
      "offset": 31
    },
    {
      "val": "1990",
      "offset": 47
    }
  ],
  "location": "homepagestepdefs.iEnterDOBAsDayMonthAndYear(String,String,String)"
});
formatter.result({
  "duration": 777863372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 25
    }
  ],
  "location": "homepagestepdefs.iEnterMatrinalStatus(String)"
});
formatter.result({
  "duration": 268159670,
  "status": "passed"
});
formatter.match({
  "location": "homepagestepdefs.iEnterAnotherOccupationAsNo()"
});
formatter.result({
  "duration": 222674182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tw3",
      "offset": 25
    },
    {
      "val": "Royal Mail",
      "offset": 44
    }
  ],
  "location": "homepagestepdefs.iEnterAddressAsAreaAndLocation(String,String)"
});
formatter.result({
  "duration": 2407281491,
  "status": "passed"
});
formatter.match({
  "location": "homepagestepdefs.iEnterOccupationAddressYes()"
});
formatter.result({
  "duration": 239447615,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "House",
      "offset": 22
    },
    {
      "val": "Detached house",
      "offset": 42
    }
  ],
  "location": "homepagestepdefs.iSelectPropertyAsAndTypeIn(String,String)"
});
formatter.result({
  "duration": 542209727,
  "status": "passed"
});
formatter.after({
  "duration": 13765,
  "status": "passed"
});
});