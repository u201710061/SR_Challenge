import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    @Test
    void formTest(){

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://apprater.net/add/");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#usp_form > div:nth-child(3) > div:nth-child(1) > fieldset > input")).sendKeys("Luis Orellana");
        driver.findElement(By.cssSelector("#usp_form > div:nth-child(3) > div:nth-child(2) > fieldset > input")).sendKeys("luisore@hotmail.com");
        driver.findElement(By.cssSelector("#usp_form > fieldset.usp-title > input")).sendKeys("Gasolina");
        driver.findElement(By.cssSelector("#usp_form > div.input_fields_wrap > fieldset > input")).sendKeys("http://www.gasolina.com");
        driver.findElement(By.cssSelector("#usp_form > fieldset.usp-content > textarea")).sendKeys("Gasolina cara para llevar");


        driver.findElement(By.name("user-submitted-name")).sendKeys("Luis Orellana");
        driver.findElement(By.name("user-submitted-email")).sendKeys("luisore@hotmail.com");
        driver.findElement(By.name("user-submitted-title")).sendKeys("Gasolina");
        driver.findElement(By.name("user-submitted-url[]")).sendKeys("http://www.gasolina.com");
        driver.findElement(By.name("user-submitted-content")).sendKeys("Gasolina para su auto");



        driver.findElement(By.xpath("//*[@id=\"usp_form\"]/div[3]/div[1]/fieldset/input")).sendKeys("Luis Orellana");
        driver.findElement(By.xpath("//*[@id=\"usp_form\"]/div[3]/div[2]/fieldset/input")).sendKeys("luisore@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"usp_form\"]/fieldset[1]/input")).sendKeys("Gasolina");
        driver.findElement(By.xpath("//*[@id=\"usp_form\"]/div[4]/fieldset/input")).sendKeys("http://www.gasolina.com");
        driver.findElement(By.xpath("//*[@id=\"usp_form\"]/fieldset[2]/textarea")).sendKeys("Gasolina para su auto");



        //driver.close();

    }
}
