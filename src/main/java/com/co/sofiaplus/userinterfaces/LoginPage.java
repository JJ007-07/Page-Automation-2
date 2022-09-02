package com.co.sofiaplus.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target CLOSE = Target.the("Close the Image")
            .locatedBy("//img[@title='Cerrar']");

    public static final Target BOTON = Target.the("Press the button to sign in")
            .locatedBy("//input[@class='ingresobutton2']");

    public static final Target TXT_DOCUMENT = Target.the("select the typedocument")
            .locatedBy("//select[@id='tipoId']");

    public static final Target TXT_USERDOCUMENT = Target.the("select the typedocument")
            .locatedBy("//select[@id='tipoId']/option[@value='TI']");

    public static final Target TXT_NUMBERDOCUMENT = Target.the("enter the username")
            .locatedBy("//input[@name='ingreso']");

    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//input[@name='josso_password']");

    public static final Target BTN_LOGIN = Target.the("click the button")
            .locatedBy("//input[@name='ingresar']");

    public static final Target BTN_OFFICE = Target.the("click another button")
            .locatedBy("//input[@id='formTitulo:j_id_jsp_1643087639_29']");
}
