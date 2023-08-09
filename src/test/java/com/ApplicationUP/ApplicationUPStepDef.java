package com.ApplicationUP;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApplicationUPStepDef {
	Response response;
	@Given("hit the URI")
	public void hit_the_uri() {
		response =RestAssured.get("https://demoqa.com/BookStore/V1/Books");
		System.out.println("got the response");
		
	}
	@Then("Validate the response of application")
	public void validate_the_response_of_application() {
		response.then().log().all();
	int actualstatuscode=	response.getStatusCode();
	int expectedstatuscode=200;
	Assert.assertEquals(expectedstatuscode,actualstatuscode);
	}

}
