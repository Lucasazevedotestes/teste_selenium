package br.lm.core;

import static br.lm.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class BaseTest {
	
	
	
	
	@Rule
	public TestName testName = new TestName();
	
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile
		(arquivo, new File ("target/screenshot/" + 
		File.separator + testName.getMethodName() + ".jpg"));
	

		
	}
}	
	
