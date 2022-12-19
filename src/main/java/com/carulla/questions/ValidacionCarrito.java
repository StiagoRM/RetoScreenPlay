package com.carulla.questions;

import com.carulla.userInterfaces.MensajeCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCarrito implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeCarrito.MSJ_CARRITO_VACIO.resolveFor(actor).isVisible();
    }

    public static Question validar() {
        return new ValidacionCarrito();
    }
}
