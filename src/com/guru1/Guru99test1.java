package com.guru1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Guru99test1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\Sotware\\16122018\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://live.guru99.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		
		String value=driver.findElement(By.xpath("//span[contains(text(),'$100.00')]")).getText();
	
		driver.findElement(By.xpath("//a[contains(text(),'Sony Xperia')]")).click();
		
		String exp=driver.findElement(By.xpath("//span[contains(text(),'$100.00')]")).getText();
		
		if(value.equalsIgnoreCase(exp))
		{
			System.out.println("Result verify");
		}
		
		Assert.assertEquals(value,exp);
		
	}

}
