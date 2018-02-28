package com.cucumber.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.pages.Addbasket;
import com.cucumber.pages.BasketPage;
import com.cucumber.pages.LandPage;
import com.cucumber.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Ruby extends BaseClass{
	
	LandPage lp;
	Addbasket ab;
	BasketPage pb;
	
	
	@Given("^go to website on browser$")
	public void go_to_website_on_browser() throws Throwable {
		openBrowser("firefox");
		navigate(readProperty("url"));
		
	}

	@Given("^click on ruby image$")
	public void click_on_ruby_image() throws Throwable {
		lp=PageFactory.initElements(driver, LandPage.class);
		lp.rubyx.click();
		//click(rubyx);
	}

	@Given("^Click on add to basket$")
	public void click_on_add_to_basket() throws Throwable {
		ab=PageFactory.initElements(driver, Addbasket.class);
		ab.addtobasketx.click();
		//click(addtobasketx);
	}

	@When("^I click on view basket$")
	public void i_click_on_view_basket() throws Throwable {
		ab=PageFactory.initElements(driver, Addbasket.class);
		ab.viewbasketx.click();
		//click(viewbasketx);
	}

	@Then("^ruby should be added basket$")
	public void ruby_should_be_added_basket() throws Throwable {
		pb=PageFactory.initElements(driver, BasketPage.class);
		String actval=pb.productx.getText();
		//String actval=gettext(productx);
		Assert.assertEquals("Selenium Ruby", actval);
	}

}
