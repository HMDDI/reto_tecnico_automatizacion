package org.proyecto.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.proyecto.questions.ValidarMensajeBienvenida;
import org.proyecto.tasks.AbrirPagina;
import org.proyecto.tasks.CompletarFormulario;
import org.proyecto.tasks.IngresarFormulario;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;



public class MyStepdefs {

    @Before
    public void IniciarEscenario() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingrese a la pagina Utest")
    public void ingresarPagina() {
      OnStage.theActorCalled("actor").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("proceda a dar clic en la opción de registro")
    public void ingresarPaginaFormulario() {OnStage.theActorInTheSpotlight().attemptsTo(IngresarFormulario.Iformulario());}

    @Y("complete la información solicitada en el formulario")

    public void completarelFormulario(DataTable datos) {
        List<Map<String, String>> rows = datos.asMaps(String.class, String.class);
        Map<String, String> datosUsuario = rows.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CompletarFormulario.CFormulario(datosUsuario));
        }

    @Entonces("Validar mensaje de bienvenida al nuevo usuario")
    public void MensajedeBienvenidaalnuevousuario() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensajeBienvenida.enPagina(), Matchers.containsString("Welcome to the world's largest community of freelance software testers!")));
    }


}
