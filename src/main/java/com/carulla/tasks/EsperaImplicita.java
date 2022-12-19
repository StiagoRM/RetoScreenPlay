package com.carulla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperaImplicita implements Task {
    private final int segundos;
    public EsperaImplicita(int segundos){
        this.segundos = segundos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }


    public static EsperaImplicita esperaImplicita (int segundos){
        return instrumented (EsperaImplicita.class,segundos);
    }
}
