package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TelaDeLogin {
    @Test
    public void Login (WebDriver navegador, String usuario, String senha){

        //navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.name("username")).sendKeys(usuario);
        navegador.findElement(By.name("password")).sendKeys(senha);
        navegador.findElement(By.id("login-button")).click();

    }

}
