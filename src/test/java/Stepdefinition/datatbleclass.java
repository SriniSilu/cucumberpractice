package Stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;


public class datatbleclass {
	@Given("list of values")
	public void list_of_values() {
	  System.out.println("List of value from Given");
	}

	@When("values are")
	public void values_are(DataTable dataTable) {
	  List<List<String>> userlst = dataTable.asLists(String.class);
	  for(List<String> e: userlst) {
		  System.out.println(e);
	  }
			  
	  
	}
	

	@When("values are with columns")
	public void values_are_with_columns(DataTable dataTbl) {
		List<Map<String,String>>userMaps=dataTbl.asMaps(String.class,String.class);
		System.out.println(userMaps);
	}
}
