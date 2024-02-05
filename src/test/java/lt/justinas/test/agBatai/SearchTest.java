package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.LoginPage;
import lt.justinas.page.agBatai.SearchPage;
import lt.justinas.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1", 8);
        LoginPage.acceptCokies();
        LoginPage.clickOnButtonPrisijungti();
        LoginPage.loginToAccount("antanas895@gmail.com", "skaiciai111");
    }

    @Test
    public void testSearch() {
        String batai = "Vyriški batai";
        String expectedResult = "Vyriški batai";
        String actualResult;

        SearchPage.enterBatai(batai);
        SearchPage.clickButtonSearch();
        actualResult = SearchPage.readMessageVyriskiBatai();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
