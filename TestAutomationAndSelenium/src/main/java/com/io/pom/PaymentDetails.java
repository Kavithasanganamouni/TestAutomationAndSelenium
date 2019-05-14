package com.io.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {
	WebDriver driver;

	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}
	//specifying the required fields as given
	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	// defining the methods for each and every field
	public void giveCardHolderName() {
		driver.findElement(cardHolderName).sendKeys("kavitha");
	}
	
	public void giveDebitCardName() {
		driver.findElement(debitCardNo).sendKeys("123445KB");
	}
	
	public void giveCvvNumber() {
		driver.findElement(cvvNumber).sendKeys("644");
	}
	
	public void giveCardExpiryMonth() {
		driver.findElement(cardExpiryMonth).sendKeys("october");
	}
	
	public void giveCardExpiryYear() {
		driver.findElement(cardExpiryYear).sendKeys("2022");
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
}
