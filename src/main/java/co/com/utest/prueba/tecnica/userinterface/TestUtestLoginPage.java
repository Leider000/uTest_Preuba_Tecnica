package co.com.utest.prueba.tecnica.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestUtestLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("Boton de acceso al login").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRSTNAME = Target.the("Primer nombre").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Segundo nombre").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Correo electronico").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Mes de nacimiento").
            located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Mes de nacimiento").
            located(By.id("birthDay"));
    public static final Target SELECT_AGE = Target.the("Mes de nacimiento").
            located(By.id("birthYear"));
    public static final Target SELECT_LEAGUAJE = Target.the("Lenguajes").
            located(By.id("languages"));
    public static final Target BUTTON_NEXT_FORM = Target.the("Boton segundo formulario").
            located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the("Lenguajes").
            located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Lenguajes").
            located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Lenguajes").
            located(By.name("countryId"));
    public static final Target BUTTON_NEXT_FORM_3 = Target.the("Tercer formulario").
            located(By.xpath("//a[@class = 'btn btn-blue pull-right']"));
    public static final Target INPUT_DEVICE = Target.the("Tipo de celular").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target LIST_DEVICE = Target.the("Listado de celulares").
            locatedBy ("//div[contains(text(),'{0}')]");
    public static final Target INPUT_MODEL = Target.the("Modelo de celular").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target LIST_MODEL = Target.the("Listado de modelos").
            locatedBy ("//div[contains(text(),'{0}')]");
    public static final Target INPUT_SYSTEM = Target.the("Sistema Operativo").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target LIST_SYSTEM = Target.the("Listado de sistemas operativos").
            locatedBy ("//div[contains(text(),'{0}')]");
    public static final Target BUTTON_NEXT_FORM_4 = Target.the("Cuarto formulario").
            located(By.xpath("//a[@class = 'btn btn-blue pull-right']"));
    public static final Target INPUT_CONTRA =Target.the("Contra").
            located(By.id("password"));
    public static final Target INPUT_CONFIRMAR =Target.the("Confirmar Contra").
            located(By.id("confirmPassword"));
    public static final Target INPUT_INFORMATION = Target.the("Confirmar el uso de datos personales").
            located(By.name("newsletterOptIn"));
    public static final Target INPUT_TERMS = Target.the("Aceptar terminos y condiciones").
            located(By.id("termOfUse"));
    public static final Target INPUT_SECURITY = Target.the("Aceptar terminos y condiciones").
            located(By.id("privacySetting"));
    public static final Target BUTTON_FINISH = Target.the("Boton de finalizacion").
            located(By.id("laddaBtn"));


}
