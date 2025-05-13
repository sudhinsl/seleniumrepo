package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyAllCustomerPage {
private static WebDriver driver;

@FindBy(xpath = "(//div[@class='label'])[5]")
private WebElement clickonall;

@FindBy(xpath = "//div[text()='Completed tasks']")
private WebElement clickoncompletetask;

@FindBy(xpath = "(//td[@class='selection'])[1]")
private WebElement clickoncheckbox;

@FindBy(xpath = "//span[text()='Change Status']")
private WebElement clickonchangestatus;

@FindBy(xpath = "(//div[text()='Completed'])[2]")
private WebElement clickoncomplete;

@FindBy(xpath = "//span[@class='innerHtml']")
private WebElement displaytext;

public ModifyAllCustomerPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setClickOnAllBtn() {
	clickonall.click();
}
public void setClickOnComlete() {
	clickoncompletetask.click();
}
public void setClickOnCheckBoxBtn() {
	clickoncheckbox.click();
}
public void setClickOnChangeStatus() {
	clickonchangestatus.click();
}
public void setClickOnCompleteBtn() {
	clickoncomplete.click();
}
public Boolean SetDisplayText() {
	return displaytext.isDisplayed();
}


}
