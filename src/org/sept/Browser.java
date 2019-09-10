package org.sept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "P:\\projects\\September\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.xpath("//input[@name='email']"));
		e.sendKeys("praveen");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("tesaviour");
		
		
	}

}
