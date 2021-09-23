package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestAnswerPage {

    public static final Target TEXT_MESSAGE = Target.the("Text Message").located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));

}
