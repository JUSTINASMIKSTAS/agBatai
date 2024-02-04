package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class DeleteAccountPage extends PageBase {
    public static void clickButtonProfile() {
        Common.clickOnElement(Locator.AgBatai.DeleteAccount.buttonProfileName);
    }

    public static void clickButtonIstrintiSavoPaskira() {
        Common.clickOnElement(Locator.AgBatai.DeleteAccount.buttonIstrintiSavoPaskira);
    }
}
