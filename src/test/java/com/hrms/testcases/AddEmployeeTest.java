package com.hrms.testcases;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	// @Test(groups = "regression", dataProvider = "newEplooyees")
	public void addEmployee(String firstName, String lastName, String userName, String userPassword) {

		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);

		jsClick(dash.pimLinkBtn);
		jsClick(viewEmployeeList.addEmployeeBtn);

		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
		click(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, userName);
		sendText(addEmp.userPassword, userPassword);
		sendText(addEmp.confirmPassword, userPassword);
		click(addEmp.saveButton);

		Assert.assertEquals(viewPersonalDetails.profileEmployeeInfo.getText(), firstName + " " + lastName);
	}

	@Test(groups = "regression")
	public void addMultipleEmployees() {
		sendText(login.userNametextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);

		jsClick(dash.pimLinkBtn);

		List<Map<String, String>> employeeList = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH, "Sheet1");
		SoftAssert soft = new SoftAssert();
		for (Map<String, String> map : employeeList) {
			jsClick(viewEmployeeList.addEmployeeBtn);
			
			waitForVisibility(addEmp.firstName);
			String firstName = map.get("FirstName");
			String middleName = map.get("MiddleName");
			String lastName = map.get("LastName");

			sendText(addEmp.firstName, firstName);
			sendText(addEmp.middleName, middleName);
			sendText(addEmp.lastName, lastName);
			click(addEmp.saveButton);
			soft.assertEquals(viewPersonalDetails.profileEmployeeInfo.getText(),
					firstName + " " + middleName + " " + lastName);

		}
		soft.assertAll();
	}

	@DataProvider
	public static String[][] newEplooyees() {

		String[][] data = {

				{ "Stephenmony", "Kendmitchell", "Stpendmill", "!L*=9nb36=WNys" },
				{ "Willpatel", "Kendmirez", "Willmirez", "S!*kNa264x4%h8b$" },
				{ "Hunda", "Neonren", "Osboday", "Ry6w-F*#@rKNv+HAr" },
				{ "Gonzavine", "Lomoondancer", "Gozsfncer", "C+3k2fvY=HU5&9-b" },
				{ "Drizzmorgan", "Magicrres", "Diires", "PwQZRj?Ld&N^8bB%" } };

		return data;

	}

}
