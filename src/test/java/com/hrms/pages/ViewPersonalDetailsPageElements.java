package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewPersonalDetailsPageElements extends BaseClass {

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement profileEmployeeInfo;

	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement personalEmpFirstName;

	@FindBy(id = "personal_txtEmpLastName")
	public WebElement personalEmpLastName;

	public ViewPersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);

	}
}
