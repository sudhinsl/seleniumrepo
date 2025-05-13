package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.DeleteModule;
import com.actitime.pom.EnterTimeTrack;

public class DeleteCustomer extends BaseClass{
	@Test
	public void deleteCustomertask() throws InterruptedException {
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTaskTab();
		DeleteModule d=new DeleteModule(driver);
		Thread.sleep(2000);
		d.getClickoncustomersettingbtn();
		//d.getClickOnActionBtn();
		//d.getClickOnDeleteBtn();
		
		
	}
}
