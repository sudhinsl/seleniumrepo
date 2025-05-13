package com.actitime.pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThemeChangeModule{
	public  static WebDriver driver;
	

	
@FindBy(xpath ="//div[@class='popup_menu_icon warning_icon']")
private WebElement clickonsettingbtn;

@FindBy(xpath ="//a[@href='/administration/customization.do']" )
private WebElement clicklogoandcolorbtn;

@FindBy(xpath = "(//div[@class='backgroundColor'])[2]")
private WebElement clickthenewcolor;

@FindBy(xpath = "//input[@class='saveButton']")
private WebElement clickthesavebutton;
public ThemeChangeModule(WebDriver driver) {
	 PageFactory.initElements(driver, this);
		}

public void clickSetting() throws InterruptedException {
	//JavascriptExecutor j= (JavascriptExecutor)driver;
	//j.executeScript("arguments[0].click();", clickonsettingbtn);
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(clicklogoandcolorbtn));
	Thread.sleep(2000);
	clickonsettingbtn.click();
}
public void forColorchange() {
	clicklogoandcolorbtn.click();
}
public void changethecolor() {
	clickthenewcolor.click();
}

public void saveChanges() {
	clickthesavebutton.click();
}
}
