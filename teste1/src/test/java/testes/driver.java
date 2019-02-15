package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class driver {
    WebDriver navegador;
    @Test
    public WebDriver Start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gabriel.soares\\Desktop\\ChromeDriver\\chromedriver.exe");
        //navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();


        return navegador;
    }

    public WebDriver getNavegador() {
        return navegador;
    }
}
