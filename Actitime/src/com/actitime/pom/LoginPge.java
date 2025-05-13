package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPge {

@FindBy(id="username")
private WebElement unBtx;

@FindBy(name="pwd")
private WebElement pwBtx;

@FindBy(xpath="//div[text()='Login ']")
private WebElement lgBtn;

public LoginPge(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void setLogin(String un,String pw) {
unBtx.sendKeys(un);
pwBtx.sendKeys(pw);
lgBtn.click();
}
}
