package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterfaces.UtestCreatePasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

public class Create implements Task {

    private String password;

    public Create(String password) {
        this.password = password;
    }

    public static Performable thePassword(String password) {
        return Tasks.instrumented(Create.class, password);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(password).into(UtestCreatePasswordPage.INPUT_PASSWORD),
                Enter.theValue(password).into(UtestCreatePasswordPage.INPUT_CONFIRM_PASSWORD),

                Click.on(UtestCreatePasswordPage.CHECKBOX_POLICY),
                Click.on(UtestCreatePasswordPage.CHECKBOX_TERMS),
                Click.on(UtestCreatePasswordPage.TEXT_FINAL)
        );

    }
}
