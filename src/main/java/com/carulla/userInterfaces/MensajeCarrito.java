package com.carulla.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCarrito {

    public static final Target MSJ_CARRITO_VACIO = Target.the("Mensaje carrito vacio").located(
            By.xpath("//h2[@class='empty-cart-title']"));

}
