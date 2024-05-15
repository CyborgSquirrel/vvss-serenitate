package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/features/search/LoginTestDataIncorrect.csv")
public class SearchByKeywordStory_LoginIncorrect {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    String username, password;

    @Test
    public void signingInShouldSignInFail() {
        anna.goToThePage();
        anna.clickTheSignInLinkRespectfully();
        anna.enterMyEpicCredentialsAndEpiclyPressSignInButton(username, password);
        anna.verifyWeAreSignedOut();
    }
} 