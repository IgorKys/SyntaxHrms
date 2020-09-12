package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardsPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.ViewEmployeeListPageElements;
import com.hrms.pages.ViewPersonalDetailsPageElements;
import com.hrms.utils.ConfigsReader;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static DashboardsPageElements dash;
	public static AddEmployeePageElements addEmp;
	public static ViewEmployeeListPageElements viewEmployeeList;
	public static ViewPersonalDetailsPageElements viewPersonalDetails;
	public static ConfigsReader cofigsReader;

	public static void initializePageObjects() {

		login = new LoginPageElements();
		dash = new DashboardsPageElements();
		addEmp = new AddEmployeePageElements();
		viewEmployeeList = new ViewEmployeeListPageElements();
		viewPersonalDetails = new ViewPersonalDetailsPageElements();
		cofigsReader = new ConfigsReader();
	}

}
