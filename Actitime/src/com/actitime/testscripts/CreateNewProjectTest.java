package com.actitime.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.CreateNewProjectPage;
import com.actitime.pom.EnterTimeTrack;

public class CreateNewProjectTest extends BaseClass{

	@Test
	public void verifyTheUserCanAddNewProject() {
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTaskTab();
		CreateNewProjectPage page=new CreateNewProjectPage(driver);
		String name="Virat";
		String dis="ESCN";
		String task="Running";
		String task1="Jumping";
		String task2="PushUp";
		page.setNewButton();
		page.setNewProject();
		page.setAddNewName(name);
		page.setDropdown();
		page.setOptions();
		page.setAddDiscription(dis);
		page.setAddTaskProject();
		page.setFirstTask(task);
		page.setSecondTask(task1);
		page.setThirdTask(task2);
		page.setCreateProject();
		Boolean text=page.setDisplayTextPage();
		Assert.assertTrue(text);
		
		
	}

}
