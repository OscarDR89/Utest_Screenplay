package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.UtetsJoinTodayPage;

public class JoinToday implements Task {

    private String Nombre;
    private String Apellidos;
    private String Correoelectronico;
    private String Dia;
    private String Mes;
    private String Año;
    private String Ciudad;
    private String CodigoPostal;
    private String Pais;
    private String Contraseña;
    private String ConfirmarContraseña;

    public JoinToday(String Inombre, String Iapellidos, String Icorreoelectronico, String Idia, String Imes,
                     String Iaño, String Iciudad, String IcodigoPostal, String Ipais, String Icontraseña,
                     String IconfirmarContraseña) {
        this.Nombre = Inombre;
        this.Apellidos = Iapellidos;
        this.Correoelectronico = Icorreoelectronico;
        this.Dia = Idia;
        this.Mes = Imes;
        this.Año = Iaño;
        this.Ciudad = Iciudad;
        this.CodigoPostal = IcodigoPostal;
        this.Pais = Ipais;
        this.Contraseña = Icontraseña;
        this.ConfirmarContraseña = IconfirmarContraseña;
    }

    public static Performable onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtetsJoinTodayPage.Registro_Boton),
                Enter.theValue("nombre").into(UtetsJoinTodayPage.Nombre),
                Enter.theValue("apellidos").into(UtetsJoinTodayPage.Apellido),
                Enter.theValue("Correo").into(UtetsJoinTodayPage.Correo_electronico),
                Enter.theValue("mes").into(UtetsJoinTodayPage.mes),
                Enter.theValue("dia").into(UtetsJoinTodayPage.dia),
                Enter.theValue("año").into(UtetsJoinTodayPage.año),
                Click.on(UtetsJoinTodayPage.Ubicacion_sigiente_Boton));

        actor.attemptsTo(Enter.theValue("cuidad").into(UtetsJoinTodayPage.ciudad),
                Enter.theValue("Codigo postal").into(UtetsJoinTodayPage.Codigo_postal),
                Enter.theValue("pais").into(UtetsJoinTodayPage.pais),
                Click.on(UtetsJoinTodayPage.Dispositivos_sigiente));

        actor.attemptsTo(Enter.theValue("contraseña").into((UtetsJoinTodayPage.Contraseña)),
                Enter.theValue("Confirmarcontraseña").into(UtetsJoinTodayPage.ConfirmarContraseña));
        actor.attemptsTo(Click.on(UtetsJoinTodayPage.Terminar));
    }
}
