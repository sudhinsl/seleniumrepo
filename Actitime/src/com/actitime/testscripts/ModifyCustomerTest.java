package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.ModifyAllCustomerPage;

public class ModifyCustomerTest extends BaseClass{
	
@Test
public void verifyTheUserCanModify() {
EnterTimeTrack e=new EnterTimeTrack(driver);
e.setTaskTab();
ModifyAllCustomerPage page=new ModifyAllCustomerPage(driver);
page.setClickOnAllBtn();
page.setClickOnComlete();
page.setClickOnCheckBoxBtn();
page.setClickOnChangeStatus();
page.setClickOnCompleteBtn();
Boolean text = page.SetDisplayText();
Assert.assertTrue(text);
}
}
