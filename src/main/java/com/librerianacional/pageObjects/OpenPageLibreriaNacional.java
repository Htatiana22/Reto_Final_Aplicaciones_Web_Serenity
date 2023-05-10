package com.librerianacional.pageObjects;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://librerianacional.com/")

public class OpenPageLibreriaNacional extends PageObject {
    By ButtonAccount = By.cssSelector("header #dropdownMenuLogin");
    By ButtonRegister = By.cssSelector("header #dropdownMenuLogin ~ div a:nth-child(2)");
    By TxtEmail = By.id("email");
    By TxtName= By.id("nombres");
    By TxtLastName= By.id("apellidos");
    By ListDocumentype = By.name("tipo_identificacion");
    By OptionCC= By.cssSelector("select[name='tipo_identificacion'] option:nth-child(2)");
    By TxtIdNumber= By.id("identificacion");
    By TxtCellPhoneNumber= By.id("telefono_movil");
    By TxtPhoneNumber= By.id("telefono");
    By TxtPassword = By.id("contrasena");
    By TxtConfirmPassword = By.id("repeatContrasena");

    By ButtonAcceptPrivacyPolicy = By.id("terminosCondiciones");
    By ButtonSignUp = By.cssSelector ("button[type='submit']");

    By ButtonMiCuenta = By.xpath("/html/body/app-root/div/app-mi-cuenta/div[2]/div/div/div[1]/div/div/div[2]/div/li[1]/a");

    public By getButtonMiCuenta() {
        return ButtonMiCuenta;
    }

    public By getButtonAccount() {
        return ButtonAccount;
    }

    public By getButtonRegister() {
        return ButtonRegister;
    }

    public By getTxtEmail() {
        return TxtEmail;
    }

    public By getTxtName() {
        return TxtName;
    }

    public By getTxtLastName() {
        return TxtLastName;
    }

    public By getListDocumentype() {
        return ListDocumentype;
    }

    public By getOptionCC() {
        return OptionCC;
    }

    public By getTxtIdNumber() {
        return TxtIdNumber;
    }

    public By getTxtCellPhoneNumber() {
        return TxtCellPhoneNumber;
    }

    public By getTxtPhoneNumber() {
        return TxtPhoneNumber;
    }

    public By getTxtPassword() {
        return TxtPassword;
    }

    public By getTxtConfirmPassword() {
        return TxtConfirmPassword;
    }

    public By getButtonAcceptPrivacyPolicy() {
        return ButtonAcceptPrivacyPolicy;
    }

    public By getButtonSignUp() {
        return ButtonSignUp;
    }
}
