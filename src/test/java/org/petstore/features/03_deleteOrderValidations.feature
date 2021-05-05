Feature: Validate petstore DELETE orders APIs
  @DeleteOrder
  Scenario Outline: Verify delete order functionality is working using "deleteOrderApi"
    Given delete order payload with <OrderID>
    When user calls "deleteOrderApi" with "delete" http request
    Then The API call is success with status code 200
    And verify "code" property in response is "200"
    And verify "type" property in response is "unknown"

    Examples:
      |OrderID|
      |1      |

  @DeleteOrder
  Scenario Outline: Verify delete order functionality is working using "deleteOrderApi"
    Given delete order payload with <OrderID>
    When user calls "deleteOrderApi" with "delete" http request
    Then The API call is success with status code 404

    Examples:
      |OrderID|
      |4      |

