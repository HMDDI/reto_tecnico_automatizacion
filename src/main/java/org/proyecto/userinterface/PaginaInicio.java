package org.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaInicio extends PageObject {
public static final Target BTN_JOIN_TODAY = Target.the("Join Today").located(By.xpath("//a[@href='/signup/personal']"));

}
