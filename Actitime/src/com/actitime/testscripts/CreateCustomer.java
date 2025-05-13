package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.taskTab;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass{

@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
EnterTimeTrack e=new EnterTimeTrack(driver);
e.setTaskTab();
FileLib f=new FileLib();
String name = f.getExcel("CreateCustomer", 1, 2);
String desc=f.getExcel("CreateCustomer", 1, 3);
taskTab t=new taskTab(driver);
t.getAddNewBtn().click();
t.getAddNewCustomer().click();
String actualtext = t.getCreateNumCustomerText().getText();
String exptext = "Create New Customer";
Assert.assertEquals(actualtext, exptext);
t.getCustomerNameTbx().sendKeys("HDFC_001");
t.getCustomerdescTBx().sendKeys("Banking Project");
t.getCompanyDropdown().click();
t.getOurCompanyOptions().click();
t.getCreateCustBtn().click();
String actualDisptext = t.getDisplayText().getText();
String ExpDispText="Customer '"+name+"' has been created";
Assert.assertEquals(actualDisptext, ExpDispText);



	


}
}
