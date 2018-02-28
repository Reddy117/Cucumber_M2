package com.cucumber.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.config.OR;

public class BaseClass extends OR{
	
	public WebDriver driver;
	
	public void openBrowser(String browser) throws IOException{
		if(browser.equals("firefox")){
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\com\\selenium\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\cucumber\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\com\\selenium\\drivers\\IEDriverServer.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	public void navigate(String url) throws IOException{
		driver.get(url);
		
	}
	
	public String readProperty(String propertytype) throws IOException{
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cucumber\\config\\config.properties");
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(propertytype);
		
	}
	
	public void sendKeys(String xpath,String value){
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public void selectDropDown(String xpath,String value){
		new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(value);
	}
	
	public void click(String xpath){
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public String gettext(String xpath){
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public void closebrowser(){
		driver.quit();
	}

}
