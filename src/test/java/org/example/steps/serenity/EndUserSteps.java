package org.example.steps.serenity;

import org.example.pages.MainPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserSteps {

    MainPage mainPage;

    @Step
    public void goToThePage() {
        mainPage.open();
    }

    @Step
    public void clickTheSignInLinkRespectfully() {
        mainPage.signInLink.click();
    }

    @Step
    public void enterMyEpicCredentialsAndEpiclyPressSignInButton() {
        mainPage.username.type("123123");
        mainPage.password.type("LP9A1b2hahpLd0B"); // dont steal pls
        mainPage.signInButton.click();
    }

    @Step
    public void ensureTheSiteIsPolite() {
        assertThat(mainPage.welcomeMessage.getText(), is(equalTo("Welcome Skibidi!")));
    }

    @Step
    public void ejectFromTheWebsite() {
        mainPage.signOutLink.click();
    }

    @Step
    public void verifyWeAreSignedOut() {
        assertThat(mainPage.signInLink.isPresent(), is(equalTo(true)));
        assertThat(mainPage.signOutLink.isPresent(), is(equalTo(false)));
    }

    @Step
    public void searchForSomeStuff(String keyword) {
        mainPage.searchBox.type(keyword);
        mainPage.searchButton.click();
    }

    @Step
    public void makeSureTheFirstSearchResultMatchesThis(String text) {
        assertThat(mainPage.firstSearchResult.getText(), is(equalTo(text)));
    }

    @Step
    public void buyAPersianCat() {
        mainPage.catsSection.click();
        mainPage.persianCat.click();
        mainPage.addToCartButton.click();
        mainPage.proceedToCheckoutButton.click();
        mainPage.continueCheckoutButton.click();
        mainPage.confirmCheckoutButton.click();
        assertThat(mainPage.totalCost.getText(), is(equalTo("$93.50")));
    }

//    @Step
//    public void enters(String keyword) {
//        mainPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        mainPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(mainPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        mainPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }
}