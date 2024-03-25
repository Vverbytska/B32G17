package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class B32G17_191_CompanyModules_StepDefs {

    CompanyPage companyPage = new CompanyPage();

    @When("user clicks on Company option")
    public void user_clicks_on_company_option() {
        companyPage.companyButton.click();

    }

    @Then("user should be able to see the following modules")
    public void user_should_be_able_to_see_the_following_modules(List<String> expectedModules) {
        List<String> modulesAsString = BrowserUtils.getElementsText(companyPage.currentModules);
        Assert.assertEquals(expectedModules,modulesAsString);

    }


}
