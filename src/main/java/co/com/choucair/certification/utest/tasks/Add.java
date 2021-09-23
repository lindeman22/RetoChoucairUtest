package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterfaces.UtestAddTheAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.Keys;

public class Add implements Task {

    private String city;
    private String postal;
    private String country;

    public Add(String city, String postal, String country) {
        this.city = city;
        this.postal = postal;
        this.country = country;
    }

    public static Performable theAddress(String city, String postal, String country) {
        return Tasks.instrumented(Add.class, city, postal, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(city).into(UtestAddTheAddressPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestAddTheAddressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestAddTheAddressPage.INPUT_CITY),
                Enter.theValue(postal).into(UtestAddTheAddressPage.INPUT_COD_POSTAL),
                Click.on(UtestAddTheAddressPage.SELECT_COUNTRY),
                Enter.theValue(country).into(UtestAddTheAddressPage.INPUT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(UtestAddTheAddressPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(UtestAddTheAddressPage.INPUT_COUNTRY),
                Click.on(UtestAddTheAddressPage.NEXT_BUTTON)
        );

    }
}
