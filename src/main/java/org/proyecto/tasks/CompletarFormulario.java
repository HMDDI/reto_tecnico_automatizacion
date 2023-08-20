package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.proyecto.userinterface.PaginaFormulario.*;
import static org.proyecto.utils.DatosPersonales.*;

public class CompletarFormulario implements Task {



    public static CompletarFormulario CFormulario() {
        return Tasks.instrumented(CompletarFormulario.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(FIRST_NAME).into(INPUT_NAME),
                Enter.theValue(LAST_NAME).into(INPUT_LASTNAME),
                Enter.theValue(EMAIL).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(BIRTH_MONTH).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(BIRTH_DAY).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(BIRTH_YEAR).from(SELECT_YEAR)
        );

        actor.attemptsTo(WaitUntil.the(BTN_NEXT_LOCATION,isVisible()).forNoMoreThan(60).seconds(),Click.on(BTN_NEXT_LOCATION));

        actor.attemptsTo(

                Enter.theValue(NAME_CITY).into(INPUT_CITY),
                Enter.theValue(POSTAL_CODE).into(INPUT_POSTAL_CODE),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(NAME_COUNTRY).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY)

        );

        actor.attemptsTo(
                WaitUntil.the(BTN_NEXT_DEVICE,isVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_NEXT_DEVICE));

        actor.attemptsTo(
                Click.on(SELECT_OS),
                Enter.theValue(TYPE_OS).into(INPUT_OS),
                Hit.the(Keys.ENTER).into(INPUT_OS),

                Click.on(SELECT_VERSION_OS),
                Enter.theValue(VERSION_OS).into(INPUT_VERSION_OS),
                Hit.the(Keys.ENTER).into(INPUT_VERSION_OS),

                Click.on(SELECT_LANGUAGE_OS),
                Enter.theValue(LANGUAGE_OS).into(INPUT_LANGUAGE_OS),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE_OS)
        );

        actor.attemptsTo( WaitUntil.the(BTN_NEXT_LAST_STEP,isVisible()).forNoMoreThan(60).seconds(),Click.on(BTN_NEXT_LAST_STEP));


        actor.attemptsTo(
                Enter.theValue(PASSWORD).into(INPUT_PASSWORD),
                Enter.theValue(PASSWORD).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_TERM_OF_USE),
                Click.on(CHECK_PRIVACY_SETTING)
        );



        actor.attemptsTo(WaitUntil.the(BTN_COMPLETE_SETUP,isVisible()).forNoMoreThan(60).seconds(),Click.on(BTN_COMPLETE_SETUP));
    }




}
