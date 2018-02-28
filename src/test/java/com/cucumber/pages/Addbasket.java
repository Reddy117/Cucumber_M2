package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.config.AddbasketpageOR;



public class Addbasket extends AddbasketpageOR{
	
	@FindBy(xpath=AddbasketpageOR.addtobasketx)
	public WebElement addtobasketx;
	
	@FindBy(xpath=AddbasketpageOR.viewbasketx)
	public WebElement viewbasketx;

}
