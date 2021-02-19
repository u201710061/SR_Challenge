import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationForm {

    WebDriver driver;

    public AutomationForm()
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://apprater.net/add/");
    }

    public void sendText(String label, String selectorType, String selector, String value){

        switch (selectorType)
        {
            case "css": driver.findElement(By.cssSelector(selector)).sendKeys(value);break;
            case "name":driver.findElement(By.name(selector)).sendKeys(value);break;
            case "xpath": driver.findElement(By.xpath(selector)).sendKeys(value);break;
            default: ;break;
        }

    };

    public void Close(){
        driver.close();
    }


}
