package co.com.choucair.certification.utest.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestAddTheAddressPage {

    public static final Target INPUT_CITY = Target.the("Input City").located(By.id("city"));
    public static final Target INPUT_COD_POSTAL = Target.the("Input Code Postal").located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Select Country").located(By.xpath("//div[@name='countryId']"));
    public static final Target INPUT_COUNTRY = Target.the("Input Country").located(By.xpath("//div[@name='countryId']//input"));
    public static final Target NEXT_BUTTON = Target.the("Next Button").located(By.xpath("//*[@class='btn btn-blue pull-right']"));

}
