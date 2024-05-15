package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory_BuyCat {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;


//    @Test
    public void signingInShouldSignInSuccess() {
        anna.goToThePage();
        anna.clickTheSignInLinkRespectfully();
        anna.enterMyEpicCredentialsAndEpiclyPressSignInButton("123123", "LP9A1b2hahpLd0B");
        anna.ensureTheSiteIsPolite("Skibidi");
    }

//    @Test
//    public void signingOutShouldInFactSignOut() {
//        signingInShouldSignInSuccess();
//        anna.ejectFromTheWebsite();
//        anna.verifyWeAreSignedOut();
//    }
//
//    @Test
//    public void searchForARattlesnakeLikeABoss() {
//        anna.goToThePage();
//        anna.searchForSomeStuff("rattle");
//        anna.makeSureTheFirstSearchResultMatchesThis("Rattlesnake");
//    }

    @Test
    public void butAPersianCat() {
        signingInShouldSignInSuccess();
        anna.buyAPersianCat();
        anna.ejectFromTheWebsite();
        anna.verifyWeAreSignedOut();
    }
} 