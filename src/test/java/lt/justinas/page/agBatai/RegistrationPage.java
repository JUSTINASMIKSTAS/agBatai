package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class RegistrationPage extends PageBase {

    public static void acceptCokies() {
        Common.waitElementVisible(Locator.AgBatai.Registration.buttonCookie, 6);
        Common.clickOnElement(Locator.AgBatai.Registration.buttonCookie);
    }

    public static void enterVardas(String vardas) {
        Common.sendKeysToElement(Locator.AgBatai.Registration.inputVardas, vardas);
    }

    public static void enterPavarde(String pavarde) {
        Common.sendKeysToElement(Locator.AgBatai.Registration.inputPavarde, pavarde);
    }

    public static void enterElPastas(String elPastas) {
        Common.sendKeysToElement(Locator.AgBatai.Registration.inputElPastas, elPastas);
    }

    public static void enterTelefonas(String telefonas) {
        Common.sendKeysToElement(Locator.AgBatai.Registration.inputTelefonas, telefonas);
    }

    public static void enterSlaptazodis(String slaptazodis) {
        Common.sendKeysToElement(Locator.AgBatai.Registration.inputSlaptazodis, slaptazodis);
    }

    public static void clickOnButtonSutinkuSuTaisyklemis() {
        Common.clickOnElement(Locator.AgBatai.Registration.inputSutinkuSuTaisyklemis);
    }

    public static void clickOnButtonRegistruotis() {
        Common.clickOnElement(Locator.AgBatai.Registration.buttonRegistruokis);
    }

    public static String readProfileName() {
        Common.waitElementVisible(Locator.AgBatai.Registration.paragraphProfileName, 6);
        return Common.getTextFromElement(Locator.AgBatai.Registration.paragraphProfileName);
    }
}
