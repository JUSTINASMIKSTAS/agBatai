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
        RegistrationPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1",9);
        RegistrationPage.acceptCokies();
    }
     @Test
         public void test() {
             String expectedResult = "";
             String actualResult = null;

             Assert.assertTrue(
                     actualResult.contains(expectedResult),
                     "\nExpected result: %S\nActual result: %s".formatted(expectedResult, actualResult)
             );
         }
}
