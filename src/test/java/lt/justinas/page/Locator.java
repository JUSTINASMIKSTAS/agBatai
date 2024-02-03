package lt.justinas.page;

import org.openqa.selenium.By;

public class Locator {
    public static class AgBatai {
        public static class Login{
            public static By buttonCookie = By.xpath("//button[@id='lgcookieslaw_accept']");
        }

        public static class Registration {

            public static By buttonCookie = By.xpath("//button[@id='lgcookieslaw_accept']");
            public static By inputVardas = By.xpath("//input[@name='firstname']");
            public static By inputPavarde = By.xpath("//input[@name='lastname']");
            public static By inputElPastas = By.xpath("//input[@name='email']");
            public static By inputTelefonas = By.xpath("//input[@name='phone']");
            public static By inputSlaptazodis = By.xpath("//input[@id='password']");
            public static By inputSutinkuSuTaisyklemis = By.xpath("//input[@id='privacy-policy']");
            public static By buttonRegistruokis = By.xpath("//button[@type='submit']");
            public static By paragraphProfileName = By.xpath("//span[text()='Antanas Antanaitis']");
        }
    }
}
