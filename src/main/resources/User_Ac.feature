Feature: Next Online Login and Register Feature
  As a User
  I want to Login to Next
  So that I can do Online shopping

  @register
  Scenario: Online User register
    Given I am on home page
    When I am registering my new AC
    And I enter details
    Then my AC create sucessfully

  @Login
  Scenario Outline: Login valid Detailss
    Given Iam on home page
    When I provides  Username "<UserName>"
    And I provides  Password "<Password>"
    And Logs in
    Then User should see the  message"<Message>"
    Examples:
      | UserName        | Password   | Message |
      | GGDKSG@GMAIL.CM | London1987 | Kakak   |
