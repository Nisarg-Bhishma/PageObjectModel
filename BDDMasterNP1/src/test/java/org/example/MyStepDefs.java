package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    SuccessfullyRegister successfullyRegister=new SuccessfullyRegister();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();
    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registerPage.RegisterForm();

    }

    @When("click on register submit button")
    public void click_on_register_submit_button() {
        registerPage.ClickOnSubmitRegister();
    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        successfullyRegister.VerifyUserRegisteredSuccessfully();
    }
}
