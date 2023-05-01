package com.axytos.step_definitions;

import com.axytos.pages.BasePage;
import com.axytos.utilities.BrowserUtils;
import com.axytos.utilities.ConfigurationReader;
import com.axytos.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class axytosSocialMediaCheckStepDefinitions {

    BasePage basePage = new BasePage();

    @When("user is on the sva Page")
    public void user_is_on_the_sva_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(2);

    }

    @When("user accept Cookies")
    public void user_accept_cookies() {
        basePage.cookiesAkzeptieren.click();
        BrowserUtils.sleep(2);
    }


    @When("user click linkedin Link")
    public void user_click_linkedin_link() {
        basePage.linkedinLink.click();
        BrowserUtils.sleep(2);

    }

    @Then("check user on the linkedin WebSite")
    public void check_user_on_the_facebook_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("linkedin"));
        BrowserUtils.sleep(2);
    }

    @When("user click Xing Link")
    public void user_click_xing_link() {
        basePage.xing.click();
        BrowserUtils.sleep(2);
    }

    @Then("check user on the Xing WebSite")
    public void check_user_on_the_xing_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("xing"));
        BrowserUtils.sleep(2);
    }


}