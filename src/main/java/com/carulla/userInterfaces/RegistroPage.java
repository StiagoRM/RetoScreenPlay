package com.carulla.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.carulla.com/")
public class RegistroPage extends PageObject {

    public static final Target BTN_CUENTA = Target.the("click cuenta").located(
            By.xpath("//span[@class='vtex-menu-2-x-styledLinkIcon vtex-menu-2-x-styledLinkIcon--header-link mh2']"));

    public static final Target BTN_INGRESAR = Target.the("click ingresar con email y contraseña").located(
            By.xpath("//div[@class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn']"));

    public static final Target BTN_CEAR_CLAVE = Target.the("click no tienes contraseña").located(
            By.xpath("//a[@class='vtex-login-2-x-dontHaveAccount link dim c-link t-small']"));

    public static final Target TXT_EMAIL = Target.the("ingresar email").located(
            By.xpath("//label/div/input[@name='email']"));

    public static final Target TXT_CLAVE = Target.the("ingresar clave").located(
            By.xpath("(//label[@class='vtex-input w-100']/div/input[@type='password'])[1]"));

    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("ingresar confirmacion clave").located(
            By.xpath("(//label[@class='vtex-input w-100']/div/input[@type='password'])[2]"));

    public static final Target BTN_ENVIAR = Target.the("click enviar correo").located(
            By.xpath("//span[@class='t-small']"));

    public static final Target BTN_CREAR = Target.the("click crear clave").located(
            By.xpath("//span[.='Crear']"));

}
