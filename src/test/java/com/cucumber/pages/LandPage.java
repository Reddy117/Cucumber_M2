package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.config.LandPageOR;

public class LandPage extends LandPageOR{
	
	@FindBy(xpath=LandPageOR.rubyx)
	public WebElement rubyx;

}
