package org.sept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	static WebDriver driver;

	public static WebDriver launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "P:\\projects\\September\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;

	}

	public static void simpleAlert() {

		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	public static void promptAlert() {
		Alert a = driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();
	}
	public static void actionmove(WebElement e) {
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();

	}
	public static void actionsclick(WebElement e) {
		Actions ak=new Actions(driver);
		ak.contextClick(e);
	}
	
	

}
