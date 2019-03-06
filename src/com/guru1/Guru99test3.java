package com.guru1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99test3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Sotware\\16122018\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://live.guru99.com/");
		
		driver.manage().window().maximize();
		
		String main=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
		
		driver.findElement(By.xpath("//div[@class='category-products']/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@class='category-products']/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button/span/span")).click();
		
		
		
		Set<String> s= driver.getWindowHandles();
	
		Iterator<String> itr =s.iterator();
		
		
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			
			String title =driver.getTitle();
			
			System.out.println(title);
			
			if(title.equalsIgnoreCase("Products Comparison List - Magento Commerce"))
			{
				driver.manage().window().maximize();
				
				boolean flag=true;
				
				System.out.println(flag);
			}
			
			
			
		}
		
		driver.switchTo().window(main);
	}

}
