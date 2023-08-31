## Tech:
* Cucumber
* Serenity BDD
* Java
* JUnit 5
* Maven + Intellij Idea

## Info
Serenity library: wanted to try something new apart from manually setting up Cucumber and webdrivers.
Serenity has default integration of both Selenium WebDriver and RestAssured for front and API testing in one go, and generates detailed reports out of the box.

### Manual cases details
The assignment description contains possible ambiguity: "the CRUD operations on Trello board" can mean both create/update *a board* or *a bunch of elements within* a board. I used the former approach with manipulating the boards themselves, and not cards/lists/etc.

The focus of testcases is in somewhat wrong place: it would be better to write detailed steps for, i.e. updating a board, and not opening it in every way possible, but still the elements are similar from page to page (and therefore separate interactions are covered), and E2E outlines are provided.

Test cases cover board CRUD operations in a single workspace for the only user (no integrations between members or workspaces).

Trello automations and power-ups are not covered in the scope of assessment for the sake of time, even though a lot of them can definitely be considered as CRUD operations.

Testcases are combined by feature type, positive and negative together, and use several tags to form suits, i.e. `@UI`, `@API`, `@automated`.

Some testcases only contain scenario name without detailed steps, as a lot of cases and validations are pretty similar. The details are typically provided for unique/most interesting interactions.

Same works for negative testcases: since negative checks are the same for similar elements, only several such checks are covered, i.e. disabled buttons, input validations and required fields, incorrect payload (attachments, pasting files into text inputs, encodings, ASCII symbols and emojis, oversized text strings), SQL and JS injections, etc.

Steps for not automated testcases also are not explicitly implemented, since Serenity provides handled exceptions for such steps, and correctly shows them within the reports.

Ideally, every API endpoint should be covered with at least a positive acceptance test. For the scenarios I have selected only the most important ones (as a guessed opinion, there should be usage stats and monitoring data to consciously select most used and vulnerable endpoints).

Negative API tests are not covered with scenarios, since there is no adequate documentation for any response codes except for 200 OK. Most negative API cases suppose sending parameters with incorrect types, missing required parameters, missing auth, using non-existent endpoints, adding incorrect and oversized payload.

Cross browser tests are partially covered by automated scenarios with possibility to select a WebDriver, requirements to explicitly check suit i.e. in Safari are not stated in testcases. Adaptive/mobile view/real mobile devices tests are not explicitly covered as well.

Omitting articles in step declarations for a more concise appearance.

## Project structure:

`src/test/resources/features` holds all the feature files in the project, representing all the test cases created, both automated and not.

`src/test/java/tinwel/API` and `src/test/java/tinwel/UI` hold the automation itself: from page objects to final step definitions.

`src/test/java/.../CucumberTestSuite.java` is a runner class, necessary to run all the cases in one go.

# Automated cases details
Atlassian login shows up sometimes instead of trello login, causing test failures. Haven't fixed this behaviour within the assessment scope, since Atlassian elements are not directly accessible (blank page in reports). The easiest way to check the failed test is to run it manually, or rerun mvn verify.

API automation unites POST, GET and DELETE methods ( = three atomic cases) in one scenario to keep the data clean. Better approach is to divide scenarios and use:
* @AfterAll method to clean the data for generative endpoints' classes,
* Scenario Context to store data between scenarios,

but I decided to keep the structure simple for the assessment.


## Run automated tests:
### Manually:
Run the `CucumberTestSuite` test runner class.
### Maven:
Run `mvn clean verify` from either IDE or command line.

Default driver is Firefox. To override it, add a param to the mvn command:
```
$ mvn clean verify -Ddriver=chrome
```

Current dependencies support Chrome version up to 114.

It is also possible to additionally filter tests using `-Dcucumber.filter.tags="@<tag_name>"` mvn parameter.

Tests run in headless mode by default, which can be configured in the `src/test/resources/serenity.conf`.

The test results will be recorded in the `target/site/serenity` directory.

## Reports
Full Serenity report with html representation is triggered by either running the whole suite with `mvn verify`, or executing `mvn serenity:aggregate` from the command line or IDE after manually running one or more tests. The resulting report can be found in `/target/site/serenity/index.html` file.

