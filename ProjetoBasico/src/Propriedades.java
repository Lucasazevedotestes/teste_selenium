package br.lm.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propriedades {

	private static final int FIREFOX = 0;

	private static final int CHROME = 0;

	public static boolean FECHAR_BROWSER = true;
	
	private static WebDriver driver;

	public static int browser;
	
	private DriverFactory() {}
	
		public static WebDriver getDriver() {
			if(driver == null) {
				switch (Propriedades.browser) {
				case FIREFOX: driver = new FirefoxDriver(); break;
				case CHROME: driver = new ChromeDriver(); break;
				}
				
				driver.manage().window().setSize(new Dimension(1200, 765));
				
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
