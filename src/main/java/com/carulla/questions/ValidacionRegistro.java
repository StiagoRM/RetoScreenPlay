package com.carulla.questions;

import com.carulla.userInterfaces.MensajeRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistro.MSJ_CERRAR_SESION.resolveFor(actor).isVisible();
    }

    public static Question validar(){
        return new ValidacionRegistro();
    }
}
