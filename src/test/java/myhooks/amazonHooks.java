package myhooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class amazonHooks {

	@Before
	public void setup() {
		System.out.println("launch amazon");
	}
	
	@After
	public void teardown() {
		System.out.println("close browser");
	}
	
}
