package com.carulla.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage extends PageObject {

    public static final Target BTN_VACIAR_CARRITO = Target.the("click vaciar carrito").located(
            By.xpath("//span[text()='Vaciar carrito']"));

    public static final Target BTN_CONFIRMAR = Target.the("click confirmar").located(
            By.xpath("//*[text()='Confirmar']"));
}
