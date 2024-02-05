package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class AddAddressPage extends PageBase {

    public static void clickButtonProfile() {
        Common.clickOnElement(Locator.AgBatai.AddAddress.buttonProfileName);
    }

    public static void clickButtonMyAddress() {
        Common.clickOnElement(Locator.AgBatai.AddAddress.buttonMyAddress);
    }

    public static void enterAdresas(String adresas) {
        Common.sendKeysToElement(Locator.AgBatai.AddAddress.inputAdresas, adresas);
    }

    public static void enterMiestas(String miestas) {
        Common.sendKeysToElement(Locator.AgBatai.AddAddress.inputMiestas, miestas);
    }

    public static void enterPastoKodas(String pastoKodas) {
        Common.sendKeysToElement(Locator.AgBatai.AddAddress.inputPastoKodas, pastoKodas);
    }

    public static void clickButtonIssaugoti() {
        Common.clickOnElement(Locator.AgBatai.AddAddress.buttonIssaugoti);
    }

    public static String readMessageAdresasSekmingaiPridetas() {
        Common.waitElementVisible(Locator.AgBatai.AddAddress.paragraphAdresasSekmingaiPridetas, 6);
        return Common.getTextFromElement(Locator.AgBatai.AddAddress.paragraphAdresasSekmingaiPridetas);
    }
}
