package com.co.sofiaplus.tasks;

import com.co.sofiaplus.models.Credentials;
import com.co.sofiaplus.userinterfaces.ExitMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;


public class Exit implements Task {
    Credentials credentials;
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);

    public Exit(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ExitMenu.BTN_OFFICE));
        actor.attemptsTo(Click.on(ExitMenu.CERRAR));
    }


    public static Exit enter(Credentials credentials) {
        return Tasks.instrumented(Exit.class, credentials);
    }

}
