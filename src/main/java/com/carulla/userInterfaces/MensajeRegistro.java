package com.carulla.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeRegistro {

    public static final Target MSJ_CERRAR_SESION = Target.the("Mensaje validacion registro").located(By.xpath("//span[@class='exito-login-4-x-greetingsIconContainer']"));
}
