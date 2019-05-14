package com.io.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ConferenceReg {
	
	static WebDriver driver;
	public ConferenceReg(WebDriver driver) {
		this.driver=driver;
	}
	// defining the required fields as given 
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	// defining the methods for each and every fields 
	public void giveFirstName() {
		System.out.println(driver.getTitle());
		driver.findElement(firstName).sendKeys("kavitha");
	}
	
	public void giveLastName() {
		driver.findElement(lastName).sendKeys("sanganamouni");
	}
	
	public void giveEmail() {
		driver.findElement(email).sendKeys("kavitha@mail.com");
	}
	
	public void giveContact() {
		driver.findElement(contactNo).sendKeys("9087654321");
	}
	
	public void giveNoOfPeople() {
		//driver.findElement(noOfPeople).sendKeys("");
		Select drpCountry = new Select(driver.findElement(noOfPeople));
		drpCountry.selectByVisibleText("1");
	}
	
	public void giveBuildingName() {
		driver.findElement(buildingName).sendKeys("Heera Apts");
	}
	
	public void giveAreaName() {
		driver.findElement(areaName).sendKeys("Gudimalkapur");
	}
	
	public void giveCity() {
		Select drpCountry = new Select(driver.findElement(city));
		drpCountry.selectByVisibleText("Pune");
	}
	
	public void giveState() {
		Select drpCountry = new Select(driver.findElement(state));
		drpCountry.selectByVisibleText("Maharashtra");
	}
	
	public void giveCconferenceAccess() {
		WebElement radio1 = driver.findElement(conferenceAccess);
		radio1.click();
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(1000);//specifying the sleep time for each and every methods 
		driver.switchTo().alert().accept();
	}
}
