package lt.justinas.page;

import org.openqa.selenium.By;

public class Locator {
    public static class AgBatai{
        public static class Registration{

            public static By buttonCookie = By.xpath("//button[@id='lgcookieslaw_accept']");
            public static By inputVardas = By.xpath("//input[@name='firstname']");
        }
    }
}
