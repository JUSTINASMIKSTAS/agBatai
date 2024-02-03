package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class LoginPage extends PageBase {
    public static void acceptCokies() {
        Common.waitElementVisible(Locator.AgBatai.Login.buttonCookie, 6);
        Common.clickOnElement(Locator.AgBatai.Login.buttonCookie);
    }
}
