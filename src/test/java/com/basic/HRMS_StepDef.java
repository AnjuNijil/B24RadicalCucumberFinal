package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_StepDef {

	@Given("Login with admin user")
	public void login_with_admin_user() {
	    System.out.println("step: Login with admin user");
	}

	@When("Go to PIM TAB")
	public void go_to_pim_tab() {
	    System.out.println("step: go to PIN TAb");
	}

	@Then("validate user getting searched")
	public void validate_user_getting_searched() {
	    System.out.println("step validate user getting searched");
	}

	@Given("validate user  not getting searched")
	public void validate_user_not_getting_searched() {
	 System.out.println("step: valiadte user not getting sarched");
	}
}
