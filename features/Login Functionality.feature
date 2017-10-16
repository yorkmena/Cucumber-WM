Feature: Worker Login Functionality for WorkMarket Webportal

  Scenario Outline: The  Worker should be able to login into the Workmarket site if the username and the password are correct.
    Given Open Browser and start application
    When I enter valid "<username>" and valid "<password>"
    Then User should be able to login

    #@smoke
    Examples: 
      | username            | password     |
      | qa+e@workmarket.com | w0rkmarket12 |
    #@Regression
   # Examples: 
    #  | Email       | pass        |
     # | BadUsername | BadPassword |
