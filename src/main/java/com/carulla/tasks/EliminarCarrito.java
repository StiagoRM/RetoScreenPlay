package com.carulla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.carulla.userInterfaces.CarritoPage.*;

public class EliminarCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_VACIAR_CARRITO),
                Click.on(BTN_CONFIRMAR)
        );
    }

    public static EliminarCarrito informacion(){
        return instrumented(EliminarCarrito.class);
    }
}
