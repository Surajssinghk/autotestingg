package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.signpage;

public class loginpagesteps {
	
	signpage login = new signpage();

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String user, String pass) {
		
		login.user_enter_username_and_password(user, pass);
	    
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		
		login.user_click_on_login_button();
	  
	}

	@Then("validate login success")
	public void validate_login_success() {
	    	}

	
	}

