Feature: User login test
  Perform user login on Practice Test Automation website


  Scenario Outline: Success login
    Given user is on login page
    When user login with <username> and <password>
    Then login is success
    Examples:
      | username  | password      |
      | "student" | "Password123" |
