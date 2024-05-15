package org.example.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class MainPage extends PageObject {
    @FindBy(linkText = "Sign In")
    public WebElementFacade signInLink;

    @FindBy(name = "username")
    public WebElementFacade username;

    @FindBy(name = "password")
    public WebElementFacade password;

    @FindBy(name = "signon")
    public WebElementFacade signInButton;

    @FindBy(linkText = "Sign Out")
    public WebElementFacade signOutLink;

    @FindBy(id = "WelcomeContent")
    public WebElementFacade welcomeMessage;

    @FindBy(name = "keyword")
    public WebElementFacade searchBox;

    @FindBy(name = "searchProducts")
    public WebElementFacade searchButton;

    @FindBy(css = "#Catalog > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(3)")
    public WebElementFacade firstSearchResult;

    @FindBy(css = "#SidebarContent > a:nth-child(7)")
    public WebElementFacade catsSection;

    @FindBy(linkText = "FL-DLH-02")
    public WebElementFacade persianCat;

    @FindBy(linkText = "Add to Cart")
    public WebElementFacade addToCartButton;

    @FindBy(name = "EST-16")
    public WebElementFacade persianCatQuantity;

    @FindBy(linkText = "Proceed to Checkout")
    public WebElementFacade proceedToCheckoutButton;

    @FindBy(name = "newOrder")
    public WebElementFacade continueCheckoutButton;

    @FindBy(linkText = "Confirm")
    public WebElementFacade confirmCheckoutButton;

    @FindBy(css = "#Catalog > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(26) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(5)")
    public WebElementFacade totalCost;
}