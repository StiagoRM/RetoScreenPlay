package com.carulla.tasks;

import com.carulla.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.carulla.userInterfaces.RegistroPage.*;
import static com.carulla.tasks.EsperaImplicita.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_CUENTA),
                    Click.on(BTN_INGRESAR),
                    Click.on(BTN_CEAR_CLAVE),
                    Click.on(BTN_CUENTA),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,0)).into(TXT_EMAIL),
                    Click.on(BTN_ENVIAR),
                    esperaImplicita(20),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,1)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("Datos.xlsx","DatosRegistro",1,1)).into(TXT_CONFIRMAR_CLAVE),
                    Click.on(BTN_CREAR)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Registro informacion(){
        return instrumented (Registro.class);
    }
}
