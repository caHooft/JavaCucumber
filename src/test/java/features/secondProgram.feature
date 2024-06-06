  Feature: Application Login
    Multiple login automation tests

    Background:
      When  Launch the browser from config variables
      And Hit the home page url of banking site

    @RegressionTest @NetBanking
    Scenario: User Page default login

      Given User is on NetBanking landing page
      When  User login into application with "user" and password "userPass"
      Then Home Page is displayed
      And Cards are displayed

    @SmokeTest @RegressionTest @Mortgage
    Scenario Outline: Mortgage User Page default login

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