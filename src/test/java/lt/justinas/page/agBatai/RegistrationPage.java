package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class RegistrationPage extends PageBase {
    public static void acceptCokies() {
        Common.waitElementVisible(Locator.AgBatai.Registration.buttonCookie,6);
        Common.clickOnElement(Locator.AgBatai.Registration.buttonCookie);
    }

    public static void enterVardas(String vardas) {
        Common.sendKeysToElement(Locator.AgBatai.Registration.inputVardas,vardas);
    }
}
