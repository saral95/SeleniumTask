package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	
	public Pojo() {
		
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(id="pass")
		private WebElement pass;
		
		@FindBy(id="u_0_b")
		private WebElement loginbtn;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		
		
	}


