  Feature: Application Login
    Multiple login automation tests

    Scenario: Admin Page default login

      Given User is on NetBanking landing page
      When  User login into application with <string> and password <string>
      Then Home Page is displayed
      And Cards are displayed
