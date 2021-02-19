
public class Main {

    public static void main(String[] args) {

        AutomationForm website = new AutomationForm();

        website.sendText("myName", "css", "#usp_form > div:nth-child(3) > div:nth-child(1) > fieldset > input", "Lucas Ocampo");
        website.sendText("myEmail", "css", "#usp_form > div:nth-child(3) > div:nth-child(2) > fieldset > input", "lucas@hotmail.com");
        website.sendText("myProductTitle", "css", "#usp_form > fieldset.usp-title > input", "CarPool");
        website.sendText("myProductURL", "css", "#usp_form > div.input_fields_wrap > fieldset > input", "http://www.carpool.com");
        website.sendText("myProductDescription", "css", "#usp_form > fieldset.usp-content > textarea", "Carpool para ahorrar en pasaje");

        website.sendText("myName", "name", "user-submitted-name", "Lucas Ocampo");
        website.sendText("myEmail", "name", "user-submitted-email", "lucas@hotmail.com");
        website.sendText("myProductTitle", "name", "user-submitted-title", "CarPool");
        website.sendText("myProductURL", "name", "user-submitted-url[]", "http://www.carpool.com");
        website.sendText("myProductDescription", "name", "user-submitted-content", "Carpool para ahorrar en pasaje");

        website.sendText("myName", "xpath", "//*[@id=\"usp_form\"]/div[3]/div[1]/fieldset/input", "Lucas Ocampo");
        website.sendText("myEmail", "xpath", "//*[@id=\"usp_form\"]/div[3]/div[2]/fieldset/input", "lucas@hotmail.com");
        website.sendText("myProductTitle", "xpath", "//*[@id=\"usp_form\"]/fieldset[1]/input", "CarPool");
        website.sendText("myProductURL", "xpath", "//*[@id=\"usp_form\"]/div[4]/fieldset/input", "http://www.carpool.com");
        website.sendText("myProductDescription", "xpath", "//*[@id=\"usp_form\"]/fieldset[2]/textarea", "Carpool para ahorrar en pasaje");

    }
}
