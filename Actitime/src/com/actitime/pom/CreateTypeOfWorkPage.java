package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateTypeOfWorkPage {
public static WebDriver driver;

@FindBy(xpath = "//a[text()='Types of Work']")
private WebElement clicktypeofwork;

@FindBy(xpath = "//div[@id='ext-comp-1002']")
private WebElement clickcreatetypework;

@FindBy(xpath = "//input[@name='name']")
private WebElement typethetext;

@FindBy(xpath = "//select[@name='active']")
private WebElement clickondropdown;

@FindBy(xpath = "//label[text()='Billable']")
private WebElement clickoncategory;

@FindBy(xpath = "//input[@value='   Create Type of Work   ']")
private WebElement createtypeofwork;

@FindBy(xpath = "//span[contains(text(),'successfully created')]")
private WebElement displaytext;
 
public CreateTypeOfWorkPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void setTypeOfWork(){
clicktypeofwork.click();
	
}
public void setCreateType(){
	clickcreatetypework.click();
	
}
public void setAdminName(String name){
	typethetext.sendKeys(name);
	
}
public void setDropdown() throws InterruptedException{
	Select s=new Select(clickondropdown);
	Thread.sleep(1000);
	s.selectByIndex(0);
		
}
public void setCategory(){
 clickoncategory.click();
	
}
public void setCrateTypeOfWork(){
createtypeofwork.click();
	
}
public boolean setDisplay() {
	return displaytext.isDisplayed();
}

}




