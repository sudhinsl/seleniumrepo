package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskTab {
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(className = "createNewCustomer")
private WebElement addNewCustomer;
@FindBy(id = "customerLightBox_titlePlaceholder")
private WebElement createNumCustomerText;
@FindBy(id = "customerLightBox_nameField")
private WebElement customerNameTbx;
@FindBy(id = "customerLightBox_descriptionField")
private WebElement customerdescTBx;
@FindBy(id = "ext-gen23")
private WebElement companyDropdown;
@FindBy(linkText = "Our Company")
private WebElement ourCompanyOptions;
@FindBy(id = "customerLightBox_commitBtn")
private WebElement createCustBtn;
@FindBy(className = "innerHtml")
private WebElement displayText;

public taskTab(WebDriver driver) {
PageFactory.initElements(driver, this);


}

public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getAddNewCustomer() {
	return addNewCustomer;
}

public WebElement getCreateNumCustomerText() {
	return createNumCustomerText;
}

public WebElement getCustomerNameTbx() {
	return customerNameTbx;
}

public WebElement getCustomerdescTBx() {
	return customerdescTBx;
}

public WebElement getCompanyDropdown() {
	return companyDropdown;
}

public WebElement getOurCompanyOptions() {
	return ourCompanyOptions;
}

public WebElement getCreateCustBtn() {
	return createCustBtn;
}

public WebElement getDisplayText() {
	return displayText;
}
}
