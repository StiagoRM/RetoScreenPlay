package com.carulla.stepDefinitions;

import com.carulla.questions.ValidacionRegistro;
import com.carulla.tasks.Registro;
import com.carulla.userInterfaces.RegistroPage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver navegador;
    private Actor santiago = Actor.named("santiago");
    private RegistroPage registroPage = new RegistroPage();

    @Before
    public void configuracion(){
        santiago.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario se encuentre en la pagina$")
    public void elUsuarioSeEncuentreEnLaPagina() {
        santiago.wasAbleTo(Open.browserOn(registroPage));
    }


    @Cuando("^el usuario registre los datos del formulario$")
    public void elUsuarioRegistreLosDatosDelFormulario() {
        santiago.attemptsTo(
                Registro.informacion()
        );
    }

    @Entonces("^visualizara un mensaje de cerrar sesion$")
    public void visualizaraUnMensajeDeCerrarSesion() {
        santiago.should(seeThat("el actor puede ver", ValidacionRegistro.validar(), Matchers.equalTo(true)));
    }
}
