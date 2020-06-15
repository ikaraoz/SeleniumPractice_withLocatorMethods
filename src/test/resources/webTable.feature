Feature: Verifying information on a web table

  Scenario: the manager gets a list of X
    Given the manager is at "https://www.seleniumeasy.com/test/table-data-download-demo.html"
    When the manager gets the list of "name"
    Then the manager verifies "Jena Gaines" is in the list
    And the manager verifies "Jena Gaines" works at "London"

#
#  Scenario: The manager can get the average salary
#    Given the manager is at "https://www.seleniumeasy.com/test/table-data-download-demo.html"
#    When the manager gets the average salary
#    Then the average salary is above "100000" US Dollars
#
#  Scenario: The manager can verify the offices of the employees
#    Given the manager is at "https://www.seleniumeasy.com/test/table-data-download-demo.html"
#    When the manager gets the offices list
#    Then at least "5" employees are from London