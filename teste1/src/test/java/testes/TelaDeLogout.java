package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TelaDeLogout {
    @Test
    public void Logout(WebDriver navegador){


        //navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.linkText("Olá, Irineu")).click();
        navegador.findElement(By.linkText("Sair")).click();

    }

}