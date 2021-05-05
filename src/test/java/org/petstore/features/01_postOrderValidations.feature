Feature: Validate petstore POST orders APIs

  @PostOrder
  Scenario Outline:Verify the order being placed using "postOrderApi"
    Given place order payload with <id>, <petId>, <quantity>
    When user calls "postOrderApi" with "post" http request
    Then The API call is success with status code 200
    And verify "status" property in response is "placed"
    And verify "complete" property in response is "true"

    Examples:
      | id    | petId | quantity  |
      | 1     | 2     | 2         |
      | 2     | 2     | 1         |


