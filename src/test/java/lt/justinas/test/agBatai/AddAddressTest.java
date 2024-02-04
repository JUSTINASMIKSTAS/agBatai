package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.AddAddressPage;

import lt.justinas.page.agBatai.LoginPage;
import lt.justinas.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAddressTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1", 8);
        LoginPage.acceptCokies();
        LoginPage.clickOnButtonPrisijungti();
        LoginPage.loginToAccount("antanas895@gmail.com", "skaiciai1112");

    }

    @Test
    public void testAddAddress() {
        String adresas = "Nemuno g. 39";
        String miestas = "Kaunas";
        String pastoKodas = "44288";
        String expectedResult = "Adresas sėkmingai pridėtas!";
        String actualResult;

        AddAddressPage.clickButtonProfile();
        AddAddressPage.clickButtonMyAddress();
        AddAddressPage.enterAdresas(adresas);
        AddAddressPage.enterMiestas(miestas);
        AddAddressPage.enterPastoKodas(pastoKodas);
        AddAddressPage.clickButtonIssaugoti();
        actualResult = AddAddressPage.readMessageAdresasSekmingaiPridetas();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
