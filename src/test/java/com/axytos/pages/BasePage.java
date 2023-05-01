package com.axytos.pages;

import com.axytos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='_brlbs-btn _brlbs-btn-accept-all _brlbs-cursor']")
    public WebElement cookiesAkzeptieren;


    @FindBy(xpath = "//a[@class='vcex-social-links__item wpex-social-btn wpex-social-btn-black wpex-hover-opacity-80 wpex-semi-rounded wpex-xing']")
    public WebElement xing;


    @FindBy(xpath = "//span[@class='vcex-social-links__icon ticon ticon-linkedin']")
    public WebElement linkedinLink;


}

