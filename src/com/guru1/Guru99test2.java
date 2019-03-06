package com.guru1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Sotware\\16122018\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://live.guru99.com/");
		 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
		
	
		
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		//WebElement edit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='first last odd'] /td[1]/ul/li/a")));
		
		//edit.click();
		
		WebElement edit=driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/input"));
		
		edit.click();
		edit.clear();
		edit.sendKeys("1000");
	
		
		//driver.findElement(By.xpath("//input[@name='qty']")).sendKeys("1000");
	
		driver.findElement(By.xpath("//tr[@class='first last odd']/td[4]/button/span")).click();
	
		String text=driver.findElement(By.xpath("//span[contains(text(),'Some of the products cannot be ordered in requested quantity.')]")).getText();
		
		System.out.println(text);
		
		String text1=driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
		
		System.out.println(text1);
		
		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();
		
		String text3=driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]")).getText();
		
		System.out.println(text3);
	
	}

}
