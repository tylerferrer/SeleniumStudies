
@home
Feature: 'amazon.com' home page

  Scenario: Open the 'amazon.com' home page
    Given that i open the 'amazon.com' main page
    When i see the text 'Hello, sign in'
    Then i click in the search bar