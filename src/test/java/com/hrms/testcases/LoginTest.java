package com.hrms.testcases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class LoginTest extends CommonMethods {

	@Test(groups = "smoke")
	public void validLogin() {

		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);

		Assert.assertTrue(dash.welcomeMessage.isDisplayed());

	}

	@Test(groups = "regression", dataProvider = "invalidCredentials")
	public void multipleInvalidLogin(String username, String password, String errorMessage) {

		sendText(login.userNametextBox, username);
		sendText(login.passwordTextBox, password);
		click(login.btnLogin);
		Assert.assertEquals(login.spanMessage.getText(), errorMessage);
	}

	@DataProvider
	public String[][] invalidCredentials() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String[][] data = { { "", ConfigsReader.getPropValue("password"), "Username cannot be empty" },
				{ ConfigsReader.getPropValue("username"), "", "Password cannot be empty" },
				{ ConfigsReader.getPropValue("username"), "123", "Invalid credentials" } };

//				{ "", "Hum@nhrm123", "Username cannot be empty" },
//				{ "Admin", "", "Password cannot be empty" }, 
//				{ "Admin", "Hum@nhrm12", "Invalid credentials" }, 
//				};
		return data;
	}

}
