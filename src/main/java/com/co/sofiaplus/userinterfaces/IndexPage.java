package com.co.sofiaplus.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {

    public static final Target ROL = Target.the("select the rol on menu")
            .locatedBy("//select[@id='seleccionRol:roles']/option[@value='5']");

    public static final Target BTN_OFFICE = Target.the("click another button")
            .locatedBy("//input[@id='formTitulo:j_id_jsp_1643087639_29']");

    public static final Target MENU1 = Target.the("click the second button")
            .locatedBy("//i[@class='fa fa-edit fa-fw']");

    public static final Target MENU2 = Target.the("click the third button")
            .locatedBy("//a[@id='13165Opcion']");

    public static final Target OPCION1 = Target.the("click the image")
            .locatedBy("//img[@id='fichasCertificadas:dtFichasCertificadas:5:imgTitulacion']");

    public static final Target OPCION2 = Target.the("click the image")
            .locatedBy("//img[@id='formConsulta:imgConstanciasCompl1516-10']");
}
