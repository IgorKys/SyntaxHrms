package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeeListPageElements extends BaseClass {

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement viewEmployeeListBtn;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmployeeBtn;

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement employeeNameTextBox;

	@FindBy(id = "empsearch_id")
	public WebElement employeeIDTextBox;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(id = "resetBtn")
	public WebElement resetBtn;

	@FindBy(id = "btnAdd")
	public WebElement btnAdd;

	@FindBy(id = "btnDelete")
	public WebElement btnDelete;

	public ViewEmployeeListPageElements() {
		PageFactory.initElements(driver, this);
	}

}
