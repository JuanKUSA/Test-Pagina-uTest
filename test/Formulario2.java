import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Formulario2 {
    private WebDriver chromeDriver;

    @Before
    public void abrirDriver() {
        //Busqueda ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\Chrome\\chromedriver.exe");

        //Opciones del Driver
        ChromeOptions options = new ChromeOptions();
        options.setCapability("manejador", false);

        //Nueva instancia de ChromeDriver
        chromeDriver = new ChromeDriver(options);

        //Abrimos una URL
        chromeDriver.get("https://www.utest.com/");
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
