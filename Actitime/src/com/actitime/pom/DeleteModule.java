package com.actitime.pom;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteModule {
	public static WebDriver driver;
	
@FindBy(xpath = "//div[text()='HDFC_001 ']/../div[4]")
//@FindBy(xpath = "(//div[@class='title']//following::div[@class='editButton available'])[7]")
//@FindBy(xpath = "//div[text()='dsfa ']/../div[4]")
private WebElement clickoncustomersettingbtn;

@FindBy(xpath = "(//div[@class='action'])[1]")
private WebElement clickonactionbtn;

@FindBy(xpath = "(//div[text()='Delete'])[1]")
private WebElement clickondelect;

@FindBy(xpath = "//div[text()='dsfa ']")
private WebElement scroll;


public DeleteModule(WebDriver driver) {
PageFactory.initElements(driver, this);
}

public void getClickoncustomersettingbtn() throws InterruptedException {
	// a=new Actions(driver);
	//a.click(clickoncustomersettingbtn).perform();
	//Thread.sleep(2000);
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(clickoncustomersettingbtn));
	//Actions a=new Actions(driver);
	//a.moveToElement(clickoncustomersettingbtn).perform();
	//Thread.sleep(2000);
	//a.scrollToElement(clickoncustomersettingbtn).perform();
	Thread.sleep(2000);
	clickoncustomersettingbtn.click();
}
public void getClickOnActionBtn() throws InterruptedException {
	Thread.sleep(2000);
	clickonactionbtn.click();
}

public void getClickOnDeleteBtn() throws InterruptedException {
	Thread.sleep(2000);
	clickondelect.click();
}

}
