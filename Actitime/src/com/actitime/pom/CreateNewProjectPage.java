package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProjectPage {
public WebDriver driver;

@FindBy(xpath = "//div[text()='Add New']")
private WebElement clickNewBtn;

@FindBy(xpath = "//div[@class='item createNewProject ellipsis']")
private WebElement clickonnewproject;

@FindBy(id = "projectPopup_projectNameField")
private WebElement addtext;

@FindBy(id = "ext-gen23")
private WebElement clickondropdown;

@FindBy(xpath = "//a[text()='Architects Bureau']")
private WebElement clickontheoptions;

@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
private WebElement adddiscription;

@FindBy(id = "createTasksBlockButton")
private WebElement clickonaddtaskproj;

@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
private WebElement addfirsttask;

@FindBy(xpath = "(//input[@placeholder='Enter task name'])[2]")
private WebElement addsecondtask;

@FindBy(xpath = "(//input[@placeholder='Enter task name'])[3]")
private WebElement addthirdtask;

@FindBy(xpath = "//span[text()='Create Project']")
private WebElement clickoncreateproject;

@FindBy(xpath = "//span[@class='innerHtml']")
private WebElement displaytext;

public CreateNewProjectPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setNewButton() {
	clickNewBtn.click();
}
public void setNewProject() {
	clickonnewproject.click();
}
public void setAddNewName(String text) {
	addtext.sendKeys(text);
}
public void setDropdown() {
	clickondropdown.click();
}
public void setOptions() {
	clickontheoptions.click();
}
public void setAddDiscription(String textof) {
	adddiscription.sendKeys(textof);
}
public void setAddTaskProject() {
	clickonaddtaskproj.click();
}
public void setFirstTask(String taskf) {
	addfirsttask.sendKeys(taskf);
}
public void setSecondTask(String tasks) {
	addsecondtask.sendKeys(tasks);
}
public void setThirdTask(String taskt) {
	addthirdtask.sendKeys(taskt);
}
public void setCreateProject() {
	clickoncreateproject.click();
}

public Boolean setDisplayTextPage() {
	return displaytext.isDisplayed();
}

}
