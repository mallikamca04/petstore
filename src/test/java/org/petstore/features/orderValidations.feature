Feature: Validate petstore orders APIs

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
      | 2     | 3     | 1          |

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
    |4      |


  @DeleteOrder
  Scenario Outline: Verify delete order functionality is working using "deleteOrderApi"
    Given delete order payload with <OrderID>
    When user calls "deleteOrderApi" with "delete" http request
    Then The API call is success with status code 200
    And verify "code" property in response is "200"
    And verify "type" property in response is "unknown"

    Examples:
      |OrderID|
      |2      |
      |4      |


