package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.LoginPage;
import lt.justinas.page.agBatai.RegistrationPage;
import lt.justinas.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1",8);
        LoginPage.acceptCokies();
        LoginPage.clickOnButtonPrisijungti();
    }
     @Test
         public void testLogin() {
         String elPastas = "antanas895@gmail.com";
         String slaptazodis = "skaiciai111";
             String expectedResult = "Antanas Antanaitis";
             String actualResult = null;

         LoginPage.enterElPastas(elPastas);
         LoginPage.enterSlaptazodis(slaptazodis);
         LoginPage.clickOnButtonLogin();
         actualResult = LoginPage.readProfileName();

             Assert.assertTrue(
                     actualResult.contains(expectedResult),
                     "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
             );
         }
}
