package cucumber.stepdefinition;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Get {

    Response response;
    ResponseBody body;

    String responseData = null;

    @When("Hit the {string} 2")
    public void hitTheUrl(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        RequestSpecification httpRequest = RestAssured.given();
        System.out.println("Url has been Hit : " + baseUrl);

    }

    @Then("Get the data {string}")
    public void getTheData(String url) {
        response = RestAssured.get(url);
        int statusCode = response.getStatusCode();
        body = response.getBody();
//        System.out.println("type of : ");
//        responseData = body.toString();
        responseData = body.asString();


        System.out.println("data fetched " + statusCode);
        System.out.println("Json Body : " + body.jsonPath());
        System.out.println("data fetched " + body.asString());
    }

    @And("Match all the data of the Api response {string}")
    public void matchAllTheDataOfTheApiResponse(String responseJsonData) throws IOException {


//        System.out.println("Data 1 : "+responseJsonData);
//        System.out.println("Data 2 : "+responseData);
//        boolean equals = responseJsonData.equals(responseData);
        String s = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dell\\IdeaProjects\\Automation\\src\\test\\java\\cucumber\\Api\\JSONData\\GetData.json")));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonData1 = objectMapper.readTree(s);
        JsonNode jsonData2 = objectMapper.readTree(responseData);


        boolean equals = jsonData1.equals(jsonData2);
//
        System.out.println("Data Matched : " + equals);
    }


}


