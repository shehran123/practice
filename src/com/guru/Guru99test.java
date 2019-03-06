package com.guru;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Guru99test {

	public static void main(String[] args) {
		
		SoftAssert sa = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver","D:\\Sotware\\16122018\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://live.guru99.com/");
		
		driver.manage().window().maximize();
		
		String title= driver.findElement(By.xpath("//div[@class='page-title']/h2")).getText();
		
		System.out.println(title);
		
		String exp = "THIS IS DEMO SITE FOR   ";
		
		sa.assertEquals(title, exp);
		
		driver.findElement(By.xpath("//a[@href='http://live.guru99.com/index.php/mobile.html'][.='Mobile']")).click();
		
		String act= driver.findElement(By.xpath("//div[@class='page-title category-title']/h1")).getText();
		
		System.out.println(act);
		
		String exp1="Mobile" ;
		
		WebElement drop = driver.findElement(By.xpath("//select[@title='Sort By']"));
		
		Select sel = new Select(drop);
		
		sel.selectByValue("http://live.guru99.com/index.php/mobile.html?dir=asc&order=name");
		
		List<WebElement> li = driver.findElements(By.xpath("//h2[@class='product-name']"));
		
		for(WebElement w:li)
		{
			System.out.println(w.getText());
			
			//System.out.println(w.getAttribute("value"));
		}
		
		sa.assertAll();
	}

}
