package com.co.sofiaplus.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ExitMenu {

    public static final Target BTN_OFFICE = Target.the("click another button")
            .locatedBy("//input[@id='formTitulo:j_id_jsp_1643087639_29']");

    public static final Target CERRAR = Target.the("click another button")
            .locatedBy("//a[@id='Salirform:cmdLogOut']");
}
