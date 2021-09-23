package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterfaces.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
    private UtestHomePage choucairUtestPage;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairUtestPage));
    }
}
