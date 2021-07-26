package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage {


@Given("Search field on Amazonpage")
public void search_field_on_amazonpage() {
   System.out.println("Search field is available");
}

@When("Product name {string} and price {int}")
public void product_name_and_price(String prdname, Integer price) {
 System.out.println("Product " + prdname + " with price " + price );
}

@Then("Product name {string} is displayed")
public void product_name_is_displayed(String prdname) {
  System.out.println("successfully found " + prdname);
}

}
