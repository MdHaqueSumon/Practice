package com.TCS.Cucmber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {

	public static void main(String[] args) {
		/*String name = "aaabbb";
		int counta = 0;
		int countb = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a') {
				counta++;
			} else
				countb++;
		}
		System.out.println("a::" + counta);
		System.out.println("b::" + countb);

	}*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\eclipse\\com.TCS.Cucmber\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='popupCloseButton']")).click();
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		driver.getWindowHandle();
		driver.findElement(By.xpath("(//a/@herf[@class='btn btn-default redBtn'])[2]")).click();
		driver.quit();
	}
}
