package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtetsJoinTodayPage {

    public static final Target Registro_Boton = Target.the("boton que nos muestra el formulario de registro")
            .located(By.linkText("Join Today"));
    public static final Target Titulo_registro = Target.the("conocer si esta en el formulario de inscripcion")
            .located(By.xpath("//h1 [@class='step-title']"));

    //primer formulario

    public static final Target Nombre = Target.the("donde escribimos los nombre")
            .located(By.id("firstName"));
    public static final Target Apellido = Target.the("donde escribimos los apellidos")
            .located(By.id("lastName"));
    public static final Target Correo_electronico = Target.the("donde escribimos el correo electronico")
            .located(By.id("email"));
    public static final Target mes = Target.the("donde escribimos el mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target dia = Target.the("donde escribimos el dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target año = Target.the("donde escribimos el año de nacimiento")
            .located(By.id("birthYear"));
    public static final Target Ubicacion_sigiente_Boton = Target.the("boton para agregar datos de lugar donde vive")
            .located(By.xpath("//a [@aria-label='Next step - define your location']"));

    //segundo formulario

    public static final Target ciudad = Target.the("donde escribimos la ciudad donde vive")
            .located(By.id("city"));
    public static final Target Estado = Target.the("donde escribimos el estado donde vive")
            .located(By.id("email"));
    public static final Target Codigo_postal = Target.the("donde escribimos codigo postal")
            .located(By.id("zip"));
    public static final Target pais = Target.the("donde escribimos el pais donde vive")
            .located(By.id("birthMonth"));
    public static final Target Dispositivos_sigiente = Target.the("boton para inscibir los dispositivos que tiene")
            .located(By.xpath("////a [@aria-label='Next step - select your devices']"));

    //Tercer formulario

    public static final Target Contraseña = Target.the("donde escribimos la contraseña")
            .located(By.id("password"));
    public static final Target ConfirmarContraseña = Target.the("donde escribimos la confirmamos la contraseña")
            .located(By.id("confirmPassword"));
    public static final Target Terminar = Target.the("boton para terminar registro")
            .located(By.linkText("#"));
}
