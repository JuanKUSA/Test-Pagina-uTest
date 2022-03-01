import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MenuPrincipal {
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
    public void VerificarWhyuTest(){
        //Elemento Why uTest
        WebElement why = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[1]/unauthenticated-header-nav-item/a/span"));
        System.out.println(why.getText());
        Assert.assertTrue(why.getText().contains("Why uTest"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarAboutUs(){
        //Elemento About Us
        WebElement AboutUs = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[2]/unauthenticated-header-nav-item/a/span"));
        System.out.println(AboutUs.getText());
        Assert.assertTrue(AboutUs.getText().contains("About Us"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarProjects(){
        //Elemento Projects
        WebElement Projects = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[3]/unauthenticated-header-nav-item/a/span"));
        System.out.println(Projects.getText());
        Assert.assertTrue(Projects.getText().contains("Projects"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarLogin(){
        //Elemento Log in
        WebElement Login = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
        System.out.println(Login.getText());
        Assert.assertTrue(Login.getText().contains("Log In"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarJoinToday(){
        //Elemento Join Today
        WebElement JoinToday = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
        System.out.println(JoinToday.getText());
        Assert.assertTrue(JoinToday.getText().contains("Join Today"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarIngresoWhyTest() {
        WebElement WhyuTest2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[1]/unauthenticated-header-nav-item/a/span"));
        WhyuTest2.click();
        WebElement Exist = chromeDriver.findElement(By.xpath("//*[@id=\"mainUiView\"]/ui-view/ui-view-ng-upgrade/ui-view/ut-why-utest/div/header/h1"));
        Assert.assertTrue(Exist.getText().contains("Why uTest?"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarIngresoAboutUs() {
        //Encontramos un el elemento About Us
        WebElement AboutUs2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[2]/unauthenticated-header-nav-item/a/span"));
        AboutUs2.click();
        WebElement ExistAbout = chromeDriver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div/div[2]/h1"));
        Assert.assertTrue(ExistAbout.getText().contains("About Us"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarIngresoProjects() {
        //Encontramos un el elemento Projects
        WebElement Projects2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[1]/li[3]/unauthenticated-header-nav-item/a/span"));
        Projects2.click();
        WebElement ExistProject = chromeDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/div[2]/h1"));
        Assert.assertTrue(ExistProject.getText().contains("Projects Board"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarIngresoLogin() {
        //Encontramos un el elemento Log in
        WebElement Login2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
        Login2.click();
        WebElement ExistLogin = chromeDriver.findElement(By.xpath("//*[@id=\"kc-header-wrapper\"]/section/h1"));
        Assert.assertTrue(ExistLogin.getText().contains("Sign in to uTest"));
        //Cerramos el driver
        chromeDriver.close();
    }
    @Test
    public void VerificarIngresoJoinToday() {
        //Encontramos un el elemento Join Today
        WebElement JoinToday2 = chromeDriver.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
        JoinToday2.click();
        WebElement ExistJointoday = chromeDriver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
        Assert.assertTrue(ExistJointoday.getText().contains("Tell us about yourself"));
        //Cerramos el driver
        chromeDriver.close();
    }
}
