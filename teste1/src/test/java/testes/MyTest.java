package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyTest{
    TelaDeLogin login = new TelaDeLogin();
    TelaDeLogout logout = new TelaDeLogout();
    Inicio start = new Inicio();
    driver driver = new driver();

    @Test
    public void Testes() {
int i = 1;
            driver.Start();

        start.PaginaLogin(driver.getNavegador());
                login.Login(driver.getNavegador(), "22889474895", "rsi123456");
                logout.Logout(driver.getNavegador());

                }

    }









