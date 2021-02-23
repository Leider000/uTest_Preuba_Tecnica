package co.com.utest.prueba.tecnica.tasks;

import co.com.utest.prueba.tecnica.userinterface.TestUtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.webelements.Checkbox;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class Login implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String monthOfBirth;
    private String dayOfBirth;
    private String ageOfBirth;
    private String leaguajes;
    private String city;
    private String postalCode;
    private String country;
    private String device;
    private String model;
    private String system;
    private String contra;
    private String confirmaContra;

    public Login(String firstName, String lastName, String email,String monthOfBirth,String dayOfBirth,String ageOfBirth,String leaguajes,String city,
                 String postalCode,String country, String device, String model, String system,String contra,String confirmaContra) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.monthOfBirth=monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.ageOfBirth=ageOfBirth;
        this.leaguajes=leaguajes;
        this.city=city;
        this.postalCode=postalCode;
        this.country=country;
        this.device=device;
        this.model=model;
        this.system=system;
        this.contra=contra;
        this.confirmaContra=confirmaContra;
    }

    public static Login onThePage(String firstName, String lastName,String email,String monthOfBirth,String dayOfBirth,String ageOfBirth,String leaguajes,
    String city,String postalCode,String country,String device,String model,String system,String contra,String confirmaContra) {
        return Tasks.instrumented(Login.class,firstName,lastName,email, monthOfBirth,dayOfBirth,ageOfBirth,leaguajes,city,postalCode,country,device,model,system,
                contra,confirmaContra);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TestUtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(firstName).into(TestUtestLoginPage.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(TestUtestLoginPage.INPUT_LASTNAME),
                Enter.theValue(email).into(TestUtestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(monthOfBirth).from(TestUtestLoginPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(dayOfBirth).from(TestUtestLoginPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(ageOfBirth).from(TestUtestLoginPage.SELECT_AGE),

                Click.on(TestUtestLoginPage.BUTTON_NEXT_FORM),
                Enter.theValue(city).into(TestUtestLoginPage.INPUT_CITY),
                Enter.theValue(postalCode).into(TestUtestLoginPage.INPUT_POSTAL_CODE),
                Click.on(TestUtestLoginPage.BUTTON_NEXT_FORM_3),

                Click.on(TestUtestLoginPage.INPUT_DEVICE),
                Click.on(TestUtestLoginPage.LIST_DEVICE.of(device)),
                Click.on(TestUtestLoginPage.INPUT_MODEL),
                Click.on(TestUtestLoginPage.LIST_MODEL.of(model)),
                Click.on(TestUtestLoginPage.INPUT_SYSTEM),
                Click.on(TestUtestLoginPage.LIST_SYSTEM.of(system)),
                Click.on(TestUtestLoginPage.BUTTON_NEXT_FORM_4),

                Enter.theValue(contra).into(TestUtestLoginPage.INPUT_CONTRA),
                Enter.theValue(confirmaContra).into(TestUtestLoginPage.INPUT_CONFIRMAR),
                Click.on(TestUtestLoginPage.INPUT_INFORMATION),
                Click.on(TestUtestLoginPage.INPUT_TERMS),
                Click.on(TestUtestLoginPage.INPUT_SECURITY),
                Click.on(TestUtestLoginPage.BUTTON_FINISH));




    }
}
