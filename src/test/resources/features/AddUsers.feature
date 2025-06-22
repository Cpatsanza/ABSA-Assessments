Feature: As a User on Protractor website I want to add Unique Users

  Background:
    Given User enters Protractor website to launch website
    Then  Website is launched successfully and verified

  @Web-Regression-Test
  Scenario Outline: As a user I want to add Users
    When User clicks add User button
    Then Add User form appears
    Then User Adds unique Users from list provided:"<First Name>","<Last Name>","<User Name>","<Password>","<Customer>","<Role>","<E-mail>","<Cell Phone>"

    Examples:
      | First Name | Last Name | User Name | Password | Customer    | Role     | E-mail            | Cell Phone |
      | FName1     | LName1    | User1     | Pass1    | Company AAA | Admin    | admin@mail.com    | 082555     |
      | FName2     | LName2    | User2     | Pass2    | Company BBB | Customer | customer@mail.com | 083444     |

  @Web-Regression-Test
  Scenario: As a User I want to confirm unique UserName in list of users provided

    Then User loads the UserLists to compare and verifies if they have unique UserName
      | FName1 | LName1 | User1 | Pass1 | Company AAA | Admin    | admin@mail.com    | 082555 |
      | FName2 | LName2 | User2 | Pass2 | Company BBB | Customer | customer@mail.com | 083444 |
















