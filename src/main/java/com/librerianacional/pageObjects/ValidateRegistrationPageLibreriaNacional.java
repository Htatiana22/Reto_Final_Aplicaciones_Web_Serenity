package com.librerianacional.pageObjects;

import org.openqa.selenium.By;

public class ValidateRegistrationPageLibreriaNacional {

    By ValidateLogMessage = By.xpath("//div[text()='Bienvenido a tu cuenta']");

    public By getValidateLogMessage() {
        return ValidateLogMessage;
    }
}

