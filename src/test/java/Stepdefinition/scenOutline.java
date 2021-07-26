package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenOutline {

	@Given("First {string}")
	public void first(String N1) {
		System.out.println("First name is"+N1);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String Status) {
		System.out.println("verifying "+Status);
	}
	@When("second {string} in step")
	public void second_in_step(String int1) {
		
		System.out.println("Second value int"+ Double.parseDouble(int1));
	}






}
