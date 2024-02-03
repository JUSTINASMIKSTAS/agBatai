package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.RegistrationPage;
import lt.justinas.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        RegistrationPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1", 9);
        RegistrationPage.acceptCokies();
    }

    @Test
    public void testRegistration() {
        String elPastas = "antanas895@gmail.com";
        String vardas = "Antanas";
        String pavarde = "Antanaitis";
        String slaptazodis = "skaiciai111";
        String telefonas = "+37064603460";
        String expectedResult = "Antanas Antanaitis";
        String actualResult = null;

        RegistrationPage.enterVardas(vardas);
        RegistrationPage.enterPavarde(pavarde);
        RegistrationPage.enterElPastas(elPastas);
        RegistrationPage.enterTelefonas(telefonas);
        RegistrationPage.enterSlaptazodis(slaptazodis);
        RegistrationPage.clickOnButtonSutinkuSuTaisyklemis();
        RegistrationPage.clickOnButtonRegistruotis();
        actualResult = RegistrationPage.readProfileName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
