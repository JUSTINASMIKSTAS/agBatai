package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class ChangePasswordPage extends PageBase {
    public static void clickButtonProfile() {
        Common.clickOnElement(Locator.AgBatai.ChangePassword.buttonProfileName);
    }

    public static void clickButtonProfileInfo() {
        Common.clickOnElement(Locator.AgBatai.ChangePassword.buttonProfileInfo);
    }

    public static void enterPassword(String slaptazodis) {
        Common.sendKeysToElement(Locator.AgBatai.ChangePassword.inputSlaptazodis, slaptazodis);
    }

    public static void enterNewPassword(String naujasSlaptazodis) {
        Common.sendKeysToElement(Locator.AgBatai.ChangePassword.inputNaujasSlaptazodis, naujasSlaptazodis);
    }

    public static void clickButtonPrivacyPolicy() {
        Common.clickOnElement(Locator.AgBatai.ChangePassword.inputrivacyPolicy);
    }

    public static void ClickButtonIssaugoti() {
        Common.clickOnElement(Locator.AgBatai.ChangePassword.buttonIssaugoti);
    }

    public static String readMessageInformacijaAtnaujinta() {
        Common.waitElementVisible(Locator.AgBatai.ChangePassword.paragraphInformacijaAtnaujinta, 6);
        return Common.getTextFromElement(Locator.AgBatai.ChangePassword.paragraphInformacijaAtnaujinta);
    }
}
