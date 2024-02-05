package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class LoginPage extends PageBase {

    public static void acceptCokies() {
        Common.waitElementVisible(Locator.AgBatai.Login.buttonCookie, 6);
        Common.clickOnElement(Locator.AgBatai.Login.buttonCookie);
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.AgBatai.Login.buttonPrisijungti);
    }

    public static void enterElPastas(String elPastas) {
        Common.sendKeysToElement(Locator.AgBatai.Login.inputElPastas, elPastas);
    }

    public static void enterSlaptazodis(String slaptazodis) {
        Common.sendKeysToElement(Locator.AgBatai.Login.inputSlaptazodis, slaptazodis);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.AgBatai.Login.buttonLogin);
    }

    public static String readProfileName() {
        Common.waitElementVisible(Locator.AgBatai.Login.paragraphProfileName, 6);
        return Common.getTextFromElement(Locator.AgBatai.Login.paragraphProfileName);
    }

    public static void loginToAccount(String elPastas, String slaptazodis) {
        LoginPage.enterElPastas(elPastas);
        LoginPage.enterSlaptazodis(slaptazodis);
        LoginPage.clickOnButtonLogin();

    }
}
