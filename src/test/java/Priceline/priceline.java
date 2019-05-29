package Priceline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priceline {
	public static void main(String[] args) {
		
	

	WebDriver web;
	
	WebDriverManager.chromedriver().setup();
	web=new ChromeDriver();
	web.manage().window().maximize();
	web.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx\n");
	WebElement wl=web.findElement(By.id("aspnetForm"));
}
}