package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/LoginTestDataCorrect.csv")
public class SearchByKeywordStory_LoginCorrect {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    String username, password, firstname;

    @Test
    public void signingInShouldSignInSuccess() {
        anna.goToThePage();
        anna.clickTheSignInLinkRespectfully();
        anna.enterMyEpicCredentialsAndEpiclyPressSignInButton(username, password);
        anna.ensureTheSiteIsPolite(firstname);
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
//
//    @Test
//    public void butAPersianCat() {
//        signingInShouldSignInSuccess();
//        anna.buyAPersianCat();
//        anna.ejectFromTheWebsite();
//        anna.verifyWeAreSignedOut();
//    }
} 