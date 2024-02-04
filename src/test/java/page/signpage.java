package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.baseclass;

public class signpage extends baseclass {

	public void user_enter_username_and_password(String string, String string2) {

	WebElement username =	driver.findElement(By.xpath("//input[@id='user-name']"));
	
	username.sendKeys(string);
	WebElement password =   driver.findElement(By.cssSelector("input#password"));
	
	password.sendKeys(string2);
	}

	public void user_click_on_login_button() {
		
	WebElement loginbtn =driver.findElement(By.xpath("//input[@id='login-button']"));
	explicitwait(10,"clickable",loginbtn);
    clickOnelement(loginbtn);
	
	}

	public void validate_login_success() {
		
	WebElement text = driver.findElement(By.xpath("//span[@class='title']"));
	
    validatetext(text,"Products");
	}

}
