package br.lm.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	private DriverFactory() {}
	
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/driverok/geckodriver.exe");
		
		if (driver == null) {
			
			switch (Propriedades.browser) {	
			case FIREFOX: driver = new FirefoxDriver(); break;
			case CHROME: driver = new ChromeDriver(); break;
			
		
			}
			
		driver.manage().window().setSize(new Dimension(1200, 1200));
	
			}
		
			return driver;
			
	}
		
		public static void killDriver () {
		if(driver !=null) {
		driver.quit();
		driver = null;
		
		}
	}
}