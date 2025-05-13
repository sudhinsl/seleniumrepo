package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.CreateTypeOfWorkPage;
import com.actitime.pom.EnterTimeTrack;

public class CreateTypeOfWorkTest extends BaseClass{
@Test
public void verifyTheUserCanAddTypeOfWork() throws InterruptedException {
	EnterTimeTrack e=new EnterTimeTrack(driver);
	e.settingButton();
	CreateTypeOfWorkPage page=new CreateTypeOfWorkPage(driver);
	String user="Hari";
	page.setTypeOfWork();
	page.setCreateType();
	page.setAdminName(user);
	Thread.sleep(1000);
	page.setDropdown();
	page.setCategory();
	page.setCrateTypeOfWork();
	Boolean text=page.setDisplay();
	Assert.assertTrue(text);
	
	
}
}
