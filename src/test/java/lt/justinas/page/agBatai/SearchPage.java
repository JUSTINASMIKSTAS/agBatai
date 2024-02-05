package lt.justinas.page.agBatai;

import lt.justinas.page.Common;
import lt.justinas.page.Locator;
import lt.justinas.page.PageBase;

public class SearchPage extends PageBase {

    public static void enterBatai(String batai) {
        Common.sendKeysToElement(Locator.AgBatai.Search.inputBatai,batai);
    }

    public static void clickButtonSearch() {
        Common.clickOnElement(Locator.AgBatai.Search.buttonSearch);
    }

    public static String readMessageVyriskiBatai() {
        Common.waitElementVisible(Locator.AgBatai.Search.paragraphVyriskiBatai, 6);
        return Common.getTextFromElement(Locator.AgBatai.Search.paragraphVyriskiBatai);
    }
}
