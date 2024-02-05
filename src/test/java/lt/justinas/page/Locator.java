package lt.justinas.page;

import org.openqa.selenium.By;

public class Locator {
    public static class AgBatai {
        public static class Search{

            public static By inputBatai = By.xpath(
                    "//input[@id='site-search']"
            );
            public static By buttonSearch = By.xpath(
                    "//div[@class='input-group-append']"
            );
            public static By paragraphVyriskiBatai = By.xpath(
                    "//h2[@class='h2']"
            );
        }

        public static class DeleteAccount {

            public static By buttonProfileName = By.xpath(
                    "//span[text()='Antanas Antanaitis']"
            );
            public static By buttonIstrintiSavoPaskira = By.xpath(
                    "//a[@href='https://www.agbatai.lt/lt/delete-account']"
            );
            public static By buttonTaip = By.xpath(
                    "(//input[@name='delete-account'])[1]"
            );
            public static By buttonPatvirtinti = By.xpath(
                    "//button[@id='submitDeleteAccount']"
            );
            public static By paragraphPrisijungti = By.xpath(
                    "//span[text()='Paskyra']"
            );
        }

        public static class AddAddress {

            public static By buttonProfileName = By.xpath(
                    "//span[text()='Antanas Antanaitis']"
            );
            public static By buttonMyAddress = By.xpath(
                    "//a[@href='https://www.agbatai.lt/lt/adresas']"
            );
            public static By inputAdresas = By.xpath(
                    "//input[@name='address1']"
            );
            public static By inputMiestas = By.xpath(
                    "//input[@name='city']"
            );
            public static By inputPastoKodas = By.xpath(
                    "//input[@name='postcode']"
            );
            public static By buttonIssaugoti = By.xpath(
                    "//button[@class='btn btn-primary form-control-submit']"
            );
            public static By paragraphAdresasSekmingaiPridetas = By.xpath(
                    "//span[text()='Adresas sėkmingai pridėtas!']"
            );
        }

        public static class ChangePassword {

            public static By buttonProfileName = By.xpath(
                    "//span[text()='Antanas Antanaitis']"
            );
            public static By buttonProfileInfo = By.xpath(
                    "//i[@class='icon-user-o align-self-end']"
            );
            public static By inputSlaptazodis = By.xpath(
                    "//input[@name='password']"
            );
            public static By inputNaujasSlaptazodis = By.xpath(
                    "//input[@name='new_password']"
            );
            public static By inputrivacyPolicy = By.xpath(
                    "//input[@id='privacy-policy']"
            );
            public static By buttonIssaugoti = By.xpath(
                    "//button[@data-link-action='save-customer']"
            );
            public static By paragraphInformacijaAtnaujinta = By.xpath(
                    "//span[text()='Informacija atnaujinta.']"
            );
        }

        public static class Login {
            public static By buttonCookie = By.xpath(
                    "//button[@id='lgcookieslaw_accept']"
            );
            public static By buttonPrisijungti = By.xpath(
                    "//div[@class='already-have-account text-center']//a"
            );
            public static By inputElPastas = By.xpath(
                    "//input[@name='email']"
            );
            public static By inputSlaptazodis = By.xpath(
                    "//input[@name='password']"
            );
            public static By buttonLogin = By.xpath(
                    "//button[@id='submit-login']"
            );
            public static By paragraphProfileName = By.xpath(
                    "//span[text()='Antanas Antanaitis']"
            );
        }

        public static class Registration {

            public static By buttonCookie = By.xpath(
                    "//button[@id='lgcookieslaw_accept']"
            );
            public static By inputVardas = By.xpath(
                    "//input[@name='firstname']"
            );
            public static By inputPavarde = By.xpath(
                    "//input[@name='lastname']"
            );
            public static By inputElPastas = By.xpath(
                    "//input[@name='email']"
            );
            public static By inputTelefonas = By.xpath(
                    "//input[@name='phone']"
            );
            public static By inputSlaptazodis = By.xpath(
                    "//input[@id='password']"
            );
            public static By inputSutinkuSuTaisyklemis = By.xpath(
                    "//input[@id='privacy-policy']"
            );
            public static By buttonRegistruokis = By.xpath(
                    "//button[@type='submit']"
            );
            public static By paragraphProfileName = By.xpath(
                    "//span[text()='Antanas Antanaitis']"
            );
        }
    }
}
