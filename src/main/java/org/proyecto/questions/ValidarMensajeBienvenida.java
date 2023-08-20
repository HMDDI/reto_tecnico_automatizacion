package org.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.proyecto.userinterface.PaginaBienvenida;

public class ValidarMensajeBienvenida implements Question<String> {

    public static ValidarMensajeBienvenida enPagina() {

        return new ValidarMensajeBienvenida();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaBienvenida.MENSAJE_BIENVENIDA).answeredBy(actor).toString();
    }

}
