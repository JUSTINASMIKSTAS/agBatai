package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.ChangePasswordPage;
import lt.justinas.page.agBatai.LoginPage;
import lt.justinas.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangePasswordTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1", 8);
        LoginPage.acceptCokies();
        LoginPage.clickOnButtonPrisijungti();
        LoginPage.loginToAccount("antanas895@gmail.com", "skaiciai111");
    }

    @Test
    public void test() {
        String slaptazodis = "skaiciai111";
        String NaujasSlaptazodis = "skaiciai1112";
        String expectedResult = "Informacija atnaujinta.";
        String actualResult = null;
        ChangePasswordPage.clickButtonProfile();
        ChangePasswordPage.clickButtonProfileInfo();
        ChangePasswordPage.enterPassword(slaptazodis);
        ChangePasswordPage.enterNewPassword(NaujasSlaptazodis);
        ChangePasswordPage.clickButtonPrivacyPolicy();
        ChangePasswordPage.ClickButtonIssaugoti();
        actualResult = ChangePasswordPage.readInformacijaAtnaujinta();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
