  Feature: Application Login
    Multiple login automation tests

    Background:
    //put pre-requisite steps here

    @RegressionTest
    Scenario: Admin Page default login

      Given User is on NetBanking landing page
      When  User login into application with "admin" and password "adminPass"
      Then Home Page is displayed
      And Cards are displayed

    @RegressionTest
    Scenario: User Page default login

      Given User is on NetBanking landing page
      When  User login into application with "user" and password "userPass"
      Then Home Page is displayed
      And Cards are displayed

  @SmokeTest @RegressionTest
    Scenario Outline: User Page default login

      Given User is on NetBanking landing page
      When  User login into application with "<Username>" and password "<UserPassword>" parameterized
      Then Home Page is displayed
      And Cards are displayed
      Examples:
        | Username    | UserPassword  |
        | debituser   | Hell123       |
        | credituser  | Hell321       |
        | lameuser    | Hell312       |
        | crackuser   | Hell213       |

@SmokeTest @RegressionTest
    Scenario: User Page default sign up

      Given User is on practice landing page
      When  User signup for website
      | Henk  |
      | Jan   |
      | contact@email.com|
      |54343646463       |
      Then Home Page is displayed
      And Cards are displayed



