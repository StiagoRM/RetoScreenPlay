package com.carulla.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarCarritoPage extends PageObject {

    public static final Target BTN_AGREGAR_PRODUCTO = Target.the("click agregar producto").located(
            By.xpath("(//*[@class='exito-vtex-components-4-x-buttonText'])[1]"));

    public static final Target BTN_SUMAR_PRODUCTO = Target.the("click sumar producto").located(
            By.xpath("(//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus'])[1]"));

    public static final Target BTN_AGREGAR_PRODUCTO_2 = Target.the("click agregar producto 2").located(
            By.xpath("(//*[@class='exito-vtex-components-4-x-buttonText'])[2]"));

    public static final Target BTN_CARRITO = Target.the("click carrito").located(
            By.xpath("//div/a[@href='/checkout/#/cart']"));

}
