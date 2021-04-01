package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.UtestJoinPage;

public class loginUtest implements Task {
    private String NombresUsuario;
    private String ContraseñaInicio;

    public loginUtest(String nombresUsuario, String contraseñaInicio) {
        NombresUsuario = nombresUsuario;
        ContraseñaInicio = contraseñaInicio;
    }

    public static Performable onThePage(String nombresUsuario, String contraseñaInicio) {
        return Tasks.instrumented(JoinToday.class,nombresUsuario,contraseñaInicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestJoinPage.inici_secion_Boton));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue("nombre de usuario").into(UtestJoinPage.Login_nombre),
                Enter.theValue("Contraseña").into(UtestJoinPage.Login_contraseña),
                Click.on(UtestJoinPage.boton_iniciar_seccion));
    }
}
