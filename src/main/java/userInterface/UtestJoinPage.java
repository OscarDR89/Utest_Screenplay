package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage {
    public static final Target inici_secion_Boton = Target.the("boton que nos permite iniciar secion1")
            .located(By.linkText("/login?return_to="));
    public static final Target Login_nombre = Target.the("donde escribimos el nombre de usuario")
            .located(By.name("username"));
    public static final Target Login_contraseña = Target.the("donde escribimos la contraseña")
            .located(By.name("password"));
    public static final Target boton_iniciar_seccion = Target.the("boton que nos permite iniciar secion")
            .located(By.id("kc-login"));
}
