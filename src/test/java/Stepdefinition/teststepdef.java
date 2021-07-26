package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class teststepdef {

@Given("test with data {int}")
public void test_with_data(Integer value) {
System.out.println(value);
}

@When("test case is with two variable")
public void test_case_is_with_two_variable() {
	System.out.println("two variable");
}
@Then("test it")
public void test_it() {
	System.out.println("Testing it");
}

@Then("add it")
public void add_it() {
	System.out.println("Adding it");
}

@Then("return sum")
public void return_sum() {
	System.out.println("Return");
}

}
