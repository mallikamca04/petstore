package org.petstore.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.petstore.resources.APIResources;
import org.petstore.resources.TestDataBuild;
import org.petstore.resources.Utils;


import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertEquals;

public class StepDefinition extends Utils {
    RequestSpecification res;
    Response response;
    ResponseSpecification resspec;
    TestDataBuild data = new TestDataBuild();
    @Given("place order payload with {int}, {int}, {int}")
    public void place_order_payload_with(Integer id, Integer petId, Integer quantity) throws IOException {
        res = given().spec(requestSpecification())
                .body(data.postOrderPayLoad(id,petId,quantity));
    }
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String method) {
        APIResources resourceAPI = APIResources.valueOf(resource);
        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        if(method.equalsIgnoreCase("post"))
            response =res.when().post(resourceAPI.getResource());

        else if(method.equalsIgnoreCase("get"))
            response =res.when().get(resourceAPI.getResource());

        else if(method.equalsIgnoreCase("delete"))
            response =res.when().delete(resourceAPI.getResource());
    }
    @Then("The API call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {
        Integer code =response.getStatusCode();
        assertEquals(int1,code);
    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyValue, String expectedValue) {
        assertEquals(getJsonPath(response,keyValue),expectedValue);
    }
    @Then("verify {string} property in response is {string}")
    public void verify_property_in_response_is(String keyValue, String expectedValue) {
        assertEquals(getJsonPath(response,keyValue),expectedValue);
    }

    @Given("get order payload with {int}")
    public void get_order_payload_with(Integer id) throws IOException {
        res = given().pathParam("orderId", id).spec(requestSpecification());
    }
    @Given("delete order payload with {int}")
    public void delete_order_payload_with(Integer id) throws IOException {
        res = given().pathParam("orderId", id).spec(requestSpecification());
    }

}
