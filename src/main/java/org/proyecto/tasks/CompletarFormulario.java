package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.proyecto.userinterface.PaginaFormulario.*;

public class CompletarFormulario implements Task {

    public static Map<String, String> datos_Usuario;

    public static CompletarFormulario CFormulario(Map<String, String> datosUsuario) {
        datos_Usuario = datosUsuario;
        return Tasks.instrumented(CompletarFormulario.class, datosUsuario);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(datos_Usuario.get("nombre")).into(INPUT_NAME),
                Enter.theValue(datos_Usuario.get("apellido")).into(INPUT_LASTNAME),
                Enter.theValue(datos_Usuario.get("correo")).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(datos_Usuario.get("mes")).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(datos_Usuario.get("dia")).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(datos_Usuario.get("año")).from(SELECT_YEAR)
        );

      actor.attemptsTo(WaitUntil.the(BTN_NEXT_LOCATION,isVisible()).forNoMoreThan(60).seconds(),Click.on(BTN_NEXT_LOCATION));

        actor.attemptsTo(

                Enter.theValue(datos_Usuario.get("ciudad")).into(INPUT_CITY),
                Enter.theValue(datos_Usuario.get("codigo_postal")).into(INPUT_POSTAL_CODE),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(datos_Usuario.get("pais")).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY)

        );

        actor.attemptsTo(
                WaitUntil.the(BTN_NEXT_DEVICE,isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_NEXT_DEVICE));

        actor.attemptsTo(
                Click.on(SELECT_OS),
                Enter.theValue(datos_Usuario.get("sistema_operativo")).into(INPUT_OS),
                Hit.the(Keys.ENTER).into(INPUT_OS),

                Click.on(SELECT_VERSION_OS),
                Enter.theValue(datos_Usuario.get("version_o_s")).into(INPUT_VERSION_OS),
                Hit.the(Keys.ENTER).into(INPUT_VERSION_OS),

                Click.on(SELECT_LANGUAGE_OS),
                Enter.theValue(datos_Usuario.get("idioma_s_o")).into(INPUT_LANGUAGE_OS),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE_OS)
        );

        actor.attemptsTo( WaitUntil.the(BTN_NEXT_LAST_STEP,isVisible()).forNoMoreThan(60).seconds(),Click.on(BTN_NEXT_LAST_STEP));


        actor.attemptsTo(
                Enter.theValue(datos_Usuario.get("contraseña")).into(INPUT_PASSWORD),
                Enter.theValue(datos_Usuario.get("contraseña")).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_TERM_OF_USE),
                Click.on(CHECK_PRIVACY_SETTING)
        );



        actor.attemptsTo(WaitUntil.the(BTN_COMPLETE_SETUP,isVisible()).forNoMoreThan(60).seconds(),Click.on(BTN_COMPLETE_SETUP));
    }




}
