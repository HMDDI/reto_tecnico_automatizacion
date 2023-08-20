package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import org.proyecto.userinterface.PaginaInicio;



public class IngresarFormulario implements Task {

    public static IngresarFormulario Iformulario() {

        return Tasks.instrumented(IngresarFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaInicio.BTN_JOIN_TODAY));

    }
}
