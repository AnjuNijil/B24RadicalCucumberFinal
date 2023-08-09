package com.GetValidateValuesWithParamSD;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.cucumber.core.cli.Main;

public class GetValidation {
	Response response;
	@Given("Hit the URI")
	public void hit_the_uri() {
		response = RestAssured.get("https://demoqa.com/BookStore/V1/Books");
		System.out.println("got the response");
		
	}
	@Then("Validate title {string} and Pages {string} of application")
	public void validate_title_and_pages_of_application(String title, String int1) {
		String dataString=response.getBody().asString();
		System.out.println("All data===="+dataString);
String actualTitleString=response.getBody().jsonPath().get("books[0].title");
Assert.assertTrue(actualTitleString.equals(title));
int pagesInt=response.getBody().jsonPath().getInt("books[0].pages");
String pagesString="+pagesInt+";
Assert.assertEquals(pagesString, int1);
	}


}
