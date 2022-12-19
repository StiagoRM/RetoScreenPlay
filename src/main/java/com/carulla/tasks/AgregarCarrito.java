package com.carulla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.carulla.tasks.EsperaImplicita.*;


import static com.carulla.userInterfaces.CategoriaPage.*;
import static com.carulla.userInterfaces.AgregarCarritoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarCarrito implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_CATEGORIA),
                MoveMouse.to(BTN_PANADERIA),
                WaitUntil.the(BTN_PANADERIA_TRADICIONAL, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20).seconds(),
                Click.on(BTN_PANADERIA_TRADICIONAL),
                esperaImplicita(5),
                Click.on(BTN_AGREGAR_PRODUCTO),
                Click.on(BTN_SUMAR_PRODUCTO),
                Click.on(BTN_SUMAR_PRODUCTO),
                Click.on(BTN_AGREGAR_PRODUCTO_2),
                esperaImplicita(3),
                Click.on(BTN_CARRITO)
        );

    }

    public static AgregarCarrito informacion() {
        return instrumented(AgregarCarrito.class);
    }
}
