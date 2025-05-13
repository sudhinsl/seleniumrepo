package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
@FindBy(id="logoutLink")
private WebElement logOut;

@FindBy(xpath="//div[text()='TASKS']")
private WebElement taskTab;

@FindBy(xpath = "//div[text()='USERS']")
private WebElement usericon;

@FindBy(xpath = "//div[@class='popup_menu_icon warning_icon']")
private WebElement clickonsettingbth;


public EnterTimeTrack(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void setLogOut() {
logOut.click();
}
public void setTaskTab() {
taskTab.click();
}
public void clickOnUser() {
usericon.click();
}
public void settingButton() {
clickonsettingbth.click();
}


}


