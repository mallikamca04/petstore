Feature: Validate petstore GET orders APIs

   @GetOrder
  Scenario Outline: Verify the orders using "getOrderApi"
    Given get order payload with <OrderID>
    When user calls "getOrderApi" with "get" http request
    Then The API call is success with status code 200
    And "status" in response body is "placed"
    And verify "complete" property in response is "true"

  Examples:
    |OrderID|
    |1      |

  @GetOrder
  Scenario Outline: Verify the orders using "getOrderApi"
    Given get order payload with <OrderID>
    When user calls "getOrderApi" with "get" http request
    Then The API call is success with status code 404

    Examples:
      |OrderID|
      |4      |