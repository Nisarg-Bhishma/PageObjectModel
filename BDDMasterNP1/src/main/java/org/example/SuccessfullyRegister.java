package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

import static org.example.Utils.getTextFromElement;

public class SuccessfullyRegister extends Utils {
    private By _SuccessMessage = By.xpath("//div[@class='result']");
    String _expectedText = "Your registration completed";

    public void VerifyUserRegisteredSuccessfully() {
        Assert.assertEquals(getTextFromElement(_SuccessMessage), _expectedText, "expected match with actual");
    }
}