package lt.justinas.test.agBatai;

import lt.justinas.page.agBatai.LoginPage;
import lt.justinas.test.TestBase;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open("https://www.agbatai.lt/lt/prisijungimas?create_account=1",8);
        LoginPage.acceptCokies();
    }
}
