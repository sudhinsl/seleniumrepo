package com.actitime.testscripts;

import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.pom.ThemeChangeModule;

public class ThemeTestScript extends BaseClass {
@Test
public void VerifyTheColorIsChangingOrNot() throws InterruptedException {
ThemeChangeModule theme=new ThemeChangeModule(driver);
Thread.sleep(2000);
theme.clickSetting();
theme.forColorchange();
theme.changethecolor();
theme.saveChanges();
}
}
