package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Test
    public void signingInShouldSignIn() {
        anna.goToThePage();
        anna.clickTheSignInLinkRespectfully();
        anna.enterMyEpicCredentialsAndEpiclyPressSignInButton();
        anna.ensureTheSiteIsPolite();
    }

    @Test
    public void signingOutShouldInFactSignOut() {
        signingInShouldSignIn();
        anna.ejectFromTheWebsite();
        anna.verifyWeAreSignedOut();
    }

    @Test
    public void searchForARattlesnakeLikeABoss() {
        anna.goToThePage();
        anna.searchForSomeStuff("rattle");
        anna.makeSureTheFirstSearchResultMatchesThis("Rattlesnake");
    }

    @Test
    public void butAPersianCat() {
        signingInShouldSignIn();
        anna.buyAPersianCat();
        anna.ejectFromTheWebsite();
        anna.verifyWeAreSignedOut();
    }
} 