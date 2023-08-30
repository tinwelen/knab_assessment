проверить импорты
проверить TestSuite с комментами
scenarios names, actor name

## Tech:
* Cucumber
* Serenity BDD
* Java
* JUnit
* Maven + Intellij Idea

## Info
Serenity library: wanted to try something new apart from manually setting up Cucumber and webdrivers.
Serenity has default integration of both Selenium WebDriver and RestAssured for front and API testing in one go, and generates detailed reports out of the box.

### Manual cases details
Trello automations and power-ups are not covered in the scope of assessment for the sake of time, even though a lot of them can definitely be considered card/list CRUD.

Omitting articles in step declarations for a more concise appearance.

## Project structure:

`src/test/resources/features` holds all the feature files in the project, representing all the test cases created, both automated and not. Serenity also allows to write not automated cases in the very same form of Gherkin scenarios, providing handled exceptions for not implemented steps, and correctly showing them within the report.

`src/test/java/tinwel/API` and `src/test/java/tinwel/UI` hold the automation itself: from page objects to final step definitions.

`src/test/java/.../CucumberTestSuite.java` is a runner class, necessary to run all the cases in one go.

# Automated cases details
API automation unites POST, GET and DELETE methods ( = three atomic cases) in one scenario to keep the data clean. Better approach is to divide scenarios and use:
* @AfterAll method to clean the data for generative endpoints' classes,
* Scenario Context to store data between scenarios,

but I decided to keep the structure simple for the assessment.


## Run:
### Manually:
Run the `CucumberTestSuite` test runner class.
### Maven:
Run `mvn clean verify` from either IDE or command line.

Default driver is Firefox. To override it, add a param to the mvn command:
```
$ mvn clean verify -Ddriver=chrome
```
// -Dcucumber.filter.tags="@authentication and/or @smoke"

Current dependencies support Chrome version up to 114.

Tests run in headless mode by default, which can be configured in the `src/test/resources/serenity.conf`.

The test results will be recorded in the `target/site/serenity` directory.

## Reports
Full Serenity report with html representation is triggered by either running the whole suite with `mvn verify`, or executing `mvn serenity:aggregate` from the command line or IDE after manually running one or more tests.

