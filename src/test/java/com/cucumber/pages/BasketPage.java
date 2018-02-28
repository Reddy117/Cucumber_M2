package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.config.BaksetPageOR;

public class BasketPage extends BaksetPageOR{
	
	@FindBy(xpath=BaksetPageOR.productx)
	public WebElement productx;
	
	@FindBy(xpath=BaksetPageOR.removex)
	public WebElement removex;
	
	@FindBy(xpath=BaksetPageOR.basketpageqtyx)
	public WebElement basketpageqtyx;
	
	@FindBy(xpath=BaksetPageOR.totalx)
	public WebElement totalx;
	
	@FindBy(xpath=BaksetPageOR.pricex)
	public WebElement pricex;
	
	@FindBy(xpath=BaksetPageOR.updatebaskx)
	public WebElement updatebaskx;
	
	

}
