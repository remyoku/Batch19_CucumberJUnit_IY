package com.euroTech.step_definitions;

import com.euroTech.pages.AddEducationPage;
import com.euroTech.pages.AddExperiencePage;
import com.euroTech.pages.UserProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UserProfile_StepDefs {

    UserProfilePage userProfilePage = new UserProfilePage();
    AddExperiencePage addExperiencePage = new AddExperiencePage();
    AddEducationPage addEducationPage = new AddEducationPage();

    @When("The user navigates user profile tab menu with :{string}")
    public void the_user_navigates_user_profile_tab_menu_with(String tabMenu) {
        userProfilePage.navigateUserProfileTabs(tabMenu);
    }

    @Then("The user should be able to verify add experience form labels with following list")
    public void the_user_should_be_able_to_verify_add_experience_form_labels_with_following_list(List<String> labels) {
        Assert.assertEquals(labels, addExperiencePage.getAddExperienceFormLabelsTexts());


    }

    @Then("The user should be able to verify add education form labels with following list")
    public void the_user_should_be_able_to_verify_add_education_form_labels_with_following_list(List<String> educationLabels) {
        Assert.assertEquals(educationLabels, addEducationPage.getAddEducationFormLabelsTexts());
    }
}
