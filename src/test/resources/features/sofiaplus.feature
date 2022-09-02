Feature: Login
  i as services user i need to automate login for access the services

  Scenario: Login Successful
    Given He user is on the page
    When the user enter the credentials
      | numberdocument | password       |
      | YourNumber     | YourPasswordPlease |
    And The User use the menu options with a rol
      | numberdocument | password |
      | aaaaa          | aaaaaaa. |
    And He go back the index page
    Then User logs out
      | numberdocument | password |
      | aaaaa          | aaaaaaa. |