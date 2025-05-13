package com.actitime.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.linkText("TASKS")).click();
	/*driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.className("createNewCustomer")).click();
	boolean createnewcusttext = driver.findElement(By.xpath("//span[text()='Create New Customer']")).isDisplayed();
	if(createnewcusttext==true) {
		System.out.println("create new customer is displayed and pass");
	}
	else {
		System.out.println("create new customer is not displayed and fail");
	}
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("HDFC_002");
	driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Banking Project");
	driver.findElement(By.id("ext-gen23")).click();
	driver.findElement(By.linkText("Our Company")).click();
	driver.findElement(By.id("customerLightBox_commitBtn")).click();
	String text = driver.findElement(By.className("innerHtml")).getText();
	System.out.println(text);
	driver.findElement(By.id("logoutLink")).click();
	driver.quit();*/
	driver.findElement(By.xpath("(//div[@class='editButton available'])[7]")).click();
	driver.findElement(By.xpath("(//div[@class='action'])[1]")).click();
	driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
	driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	String text = driver.findElement(By.xpath("//span[@class='innerHttml']")).getText();
	System.out.println(text);
	
	}


}

