package co.com.choucair.certification.utest.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegisterPersonalDataPage {

    public static final Target JOIN_BUTTON = Target.the("Join Today Button").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRST_NAME = Target.the("Input First Name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Input Last Name").located(By.id("lastName"));
    public static final Target INPUT_MAIL = Target.the("Input Email").located(By.id("email"));
    public static final Target SELECT_MONTH_BIRTH = Target.the("Select Date of birth").located(By.id("birthMonth"));
    public static final Target SELECT_DAY_BIRTH = Target.the("Select Date of day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR_BIRTH = Target.the("Select Date of year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("Input Languages").located(By.xpath("//*[@id='languages']/div[1]/input"));
    public static final Target NEXT_BUTTON = Target.the("Button Next Page").located(By.xpath("//*[@class='btn btn-blue']"));

}
