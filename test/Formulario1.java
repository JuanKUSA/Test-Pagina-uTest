import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Formulario1 {
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

    @Test
    public void ValidarOpcionProjects(){
        //Encontramos un el elemento Projects
        WebElement Projects2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[3]/unauthenticated-header-nav-item/a/span"));
        Projects2.click();
        WebElement ExistProject = chromeDriver.findElement(By.xpath("//p[contains(text(),'Please view a small fraction of the available paid')]"));
        Assert.assertTrue(ExistProject.getText().contains("Please view a small fraction of the available paid project opportunities uTest has to offer! Sign up today and fill out your tester profile to receive more projects."));
        //Cerramos el driver
        chromeDriver.close();
    }

    @Test
    public void ValidarExistenciaPestañaSuggested(){
        //Encontramos un el elemento Projects
        WebElement Projects2 = chromeDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/ul/li[1]/a"));
        Projects2.click();
        WebElement Suggested = chromeDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/ul/li[1]/a"));
        System.out.println(Suggested);
        Assert.assertTrue(Suggested.getText().contains("suggested"));
    }

    @Test
    public void ValidarExistenciaPestañaAll(){
        //Encontramos un el elemento Projects
        WebElement Projects2 = chromeDriver.findElement(By.xpath(""));
        Projects2.click();
        WebElement All = chromeDriver.findElement(By.xpath(""));
    }

    @Test
    public void ValidarExistenciaPestañaUrgent(){
        //Encontramos un el elemento Projects
        WebElement Projects2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[3]/unauthenticated-header-nav-item/a/span"));
        Projects2.click();
        WebElement Urgent = chromeDriver.findElement(By.xpath(""));
    }


}
