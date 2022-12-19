package com.carulla.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaPage extends PageObject {

    public static final Target BTN_CATEGORIA = Target.the("click categoría").located(
            By.xpath("//span/div/div/*[@xmlns='http://www.w3.org/2000/svg']"));

    public static final Target BTN_PANADERIA = Target.the("click panaderia").located(
            By.xpath("(//div/span[@class='ph3 pr5 exito-category-menu-3-x-backHoverIcon'])[9]"));

    public static final Target BTN_PANADERIA_TRADICIONAL = Target.the("click panaderia tradicional").located(
            By.xpath("//p[.='Panaderia tradicional']"));



}
