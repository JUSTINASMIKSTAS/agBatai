package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.DeleteAccountPage;
import lt.justinas.page.agBatai.LoginPage;
import lt.justinas.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteAccountTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1", 8);
        LoginPage.acceptCokies();
        LoginPage.clickOnButtonPrisijungti();
        LoginPage.loginToAccount("antanas895@gmail.com", "skaiciai1112");
    }

    @Test
    public void testDeleteAccount() {
        String expectedResult = "Prisijungti";
        String actualResult = null;

        DeleteAccountPage.clickButtonProfile();
        DeleteAccountPage.clickButtonIstrintiSavoPaskira();
        DeleteAccountPage.clickButton();
        DeleteAccountPage.clickButtonPatvirtinti();
        actualResult = DeleteAccountPage.readProfileName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
