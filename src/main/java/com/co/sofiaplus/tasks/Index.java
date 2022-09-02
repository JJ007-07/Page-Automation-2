package com.co.sofiaplus.tasks;

import com.co.sofiaplus.models.Credentials;
import com.co.sofiaplus.userinterfaces.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;


public class Index implements Task {
    Credentials credentials;
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);

    public Index(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexPage.ROL));
        actor.attemptsTo(Click.on(IndexPage.BTN_OFFICE));
        actor.attemptsTo(Click.on(IndexPage.MENU1));
        actor.attemptsTo(Click.on(IndexPage.MENU2));
        actor.attemptsTo(Click.on(IndexPage.OPCION1));
        actor.attemptsTo(Click.on(IndexPage.OPCION2));
    }

    public static Index enter(Credentials credentials) {
        return Tasks.instrumented(Index.class, credentials);
    }

}
