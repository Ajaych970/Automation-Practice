package cucumber.Api.PUT;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Put {

    @Given("Hit the {string} 2")
    public void hitTheUrl2(String url){
        System.out.println("url hit");
    }

    @Then("Insert the {string}")
    public void insertTheJsonData(String JsonData){
        System.out.println("Data found");
    }
}
