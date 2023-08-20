package org.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaBienvenida extends PageObject {
    public static final Target MENSAJE_BIENVENIDA = Target.the("Welcome message").located(By.xpath("//div[@class='image-box-header']"));
}
