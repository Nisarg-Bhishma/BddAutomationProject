package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    SuccessfullyRegistered successfullyRegistered=new SuccessfullyRegistered();


    @Given("^User is on homepage$")
    public void user_is_on_homepage() {  homePage.verifyHomepage();
    }
    @When("^User click on Register Button$")
    public void user_click_on_Register_Button() { homePage.clickOnRegisterButton();
    }

    @When("^User enters all the required details of registration form$")
    public void user_enters_all_the_required_details_of_registration_form(){ registerPage.RegisterForm();
        registerPage.ClickOnSubmitRegister();
    }

    @Then("^User should be able to register successfully$")
    public void user_should_be_able_to_register_successfully() {    successfullyRegistered.VerifyUserRegisteredSuccessfully();
    }
}
