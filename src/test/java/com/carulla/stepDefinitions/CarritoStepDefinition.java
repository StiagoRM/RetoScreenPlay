package com.carulla.stepDefinitions;

import com.carulla.questions.ValidacionCarrito;
import com.carulla.tasks.AgregarCarrito;
import com.carulla.tasks.EliminarCarrito;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CarritoStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver navegador;
    private Actor santiago = Actor.named("santiago");

    private AgregarCarrito agregarCarrito = new AgregarCarrito();
    private EliminarCarrito eliminarCarrito = new EliminarCarrito();

    @Before
    public void configuracion(){
        santiago.can(BrowseTheWeb.with(navegador));
    }

    @Cuando("^agregue un producto con tres cantidades, luego otro producto$")
    public void agregueUnProductoConTresCantidadesLuegoOtroProducto() {
        santiago.attemptsTo(
                agregarCarrito.informacion()
        );
    }

    @Cuando("^elimine todos los productos del carrito$")
    public void elimineTodosLosProductosDelCarrito() {
        santiago.attemptsTo(
                eliminarCarrito.informacion()
        );
    }

    @Entonces("^el usuario visualizara el carrito de compras vacio$")
    public void elUsuarioVisualizaraElCarritoDeComprasVacio() {
        santiago.should(seeThat("el actor puede ver", ValidacionCarrito.validar(), Matchers.equalTo(true)));
    }
}
