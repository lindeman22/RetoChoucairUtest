#Author: Jose Lindeman

Feature: User registration for Utest

  @scenario1
  Scenario: Sucessful User Register

    Given that Jose is on uTest home page
    When he registers his personal data in Utest
      | firstName | lastName | email                  | month    | day | year | languages |
      | Jose      | Prueba   | liata30@uenglandrn.com | November | 2   | 1990 | Spanish   |
    And he adds the address
      | city     | postal | country  |
      | Medellin | 498498 | Colombia |
    And he chooses his computer and mobile devices
      | computer | version | language | movileDevice | model      | operatingSystem |
      | Linux    | Ubuntu  | Spanish  | Xiaomi       | Mi A2 Lite | Android 10      |
    And he creates his password
      | password        |
      | R6A#xYZd9*5bK-Y |
    Then user receives confirmation message
      | message                                                                 |
      | Welcome to the world's largest community of freelance software testers! |


