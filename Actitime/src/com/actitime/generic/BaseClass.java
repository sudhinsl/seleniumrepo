package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LoginPge;

public class BaseClass {
public static WebDriver driver;
@BeforeTest
public void openbrowser() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
//@AfterTest
public void closeBrowser() {
driver.quit();
}
@BeforeMethod
public void login() throws IOException {
FileLib f=new FileLib();
String url = f.getproperty("url");
String un = f.getproperty("username");
String pw = f.getproperty("password");
driver.get(url);
LoginPge l=new LoginPge(driver);
l.setLogin(un, pw);

}
//@AfterMethod
public void logOut() {
EnterTimeTrack e=new EnterTimeTrack(driver);
e.setLogOut();
}

}


