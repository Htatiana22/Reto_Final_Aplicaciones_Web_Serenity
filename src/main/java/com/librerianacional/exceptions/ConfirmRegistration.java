package com.librerianacional.exceptions;


import com.librerianacional.pageObjects.OpenPageLibreriaNacional;
import com.librerianacional.pageObjects.ValidateRegistrationPageLibreriaNacional;
import com.librerianacional.utils.FormDataExcel;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ConfirmRegistration {

    private static ArrayList<Map<String, String>> readExcelData = new ArrayList<>();

    OpenPageLibreriaNacional pageLibreriaNacional = new OpenPageLibreriaNacional();
    ValidateRegistrationPageLibreriaNacional confirmRegistration = new ValidateRegistrationPageLibreriaNacional();

    @Step
    public void validateMessage() throws IOException {

        //WaitUntil.the(confirmRegistration.getValidateLogMessage(),isPresent()).forNoMoreThan(30).seconds();


       readExcelData= FormDataExcel.readExcel("RegistrationFormData.xlsx","UserData");


        String validate = confirmRegistration.getValidateLogMessage().findElement(pageLibreriaNacional.getDriver()).getText();

        org.junit.Assert.assertEquals("Bienvenido a tu cuenta"+readExcelData.get(0).get("Nombre(s)"),validate);

    }


}
