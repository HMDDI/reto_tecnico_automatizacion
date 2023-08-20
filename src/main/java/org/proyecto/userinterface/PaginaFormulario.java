package org.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;



public class PaginaFormulario extends PageObject {
    public static By INPUT_NAME = By.id("firstName");
    public static By INPUT_LASTNAME = By.id("lastName");
    public static By INPUT_EMAIL = By.id("email");
    public static By SELECT_MONTH = By.id("birthMonth");
    public static By SELECT_DAY =  By.id("birthDay");
    public static By SELECT_YEAR = By.id("birthYear");
    public static final Target BTN_NEXT_LOCATION = Target.the("BTN_NEXT_LOCATION").located(By.xpath("//a[@href='#']"));
    public static By INPUT_CITY = By.id("city");
    public static By INPUT_POSTAL_CODE= By.id("zip");
    public static By SELECT_COUNTRY = By.name("countryId");
    public static final Target INPUT_COUNTRY = Target.the("INPUT_COUNTRY").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BTN_NEXT_DEVICE = Target.the("BTN_NEXT_DEVICE").located(By.xpath("//a[@href='#']"));
    public static final Target BTN_NEXT_LAST_STEP = Target.the("BTN_NEXT_LAST_STEP").located(By.xpath("//a[@href='#']"));
    public static By SELECT_OS = By.name("osId");
    public static final Target INPUT_OS = Target.the("INPUT_OS").located(By.xpath("//input[@placeholder='Select OS']"));
    public static By SELECT_VERSION_OS = By.name("osVersionId");
    public static final Target INPUT_VERSION_OS = Target.the("INPUT_VERSION_OS").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static By SELECT_LANGUAGE_OS = By.name("osLanguageId");
    public static final Target INPUT_LANGUAGE_OS = Target.the("INPUT_LANGUAGE_OS").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static By INPUT_PASSWORD=  By.id("password");
    public static By INPUT_CONFIRM_PASSWORD = By.id("confirmPassword");
    public static By CHECK_TERM_OF_USE = By.id("termOfUse");
    public static By CHECK_PRIVACY_SETTING= By.id("privacySetting");
    public static final Target BTN_COMPLETE_SETUP = Target.the("BTN_COMPLETE_SETUP").located(By.xpath("//a[@href='#']"));


}
