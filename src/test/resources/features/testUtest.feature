# Autor: Leider Parada
@stories
Feature: test Utest
  A user establishes a series of tasks that allow him to navigate a web page automatically
  @scenario1
  Scenario: Complete the registration process in the page
    Given Leider wants to learn how to use automation tools
      | firstName | lastName | email |  monthOfBirth | dayOfBirth | ageOfBirth | leaguajes | city | postalCode| country| device | model | system | contra | confirmaContra |
      | Leider    | Parada   | leidergiovannyparada@gmail.com | June | 15 | 1998 | Spanish | Bogotá | 110111   | Colombia | Xiaomi | MiOne | Android 3.0 | uTest2021* | uTest2021* |

    When Complete the registration process on the website


    Then Register on the platform
