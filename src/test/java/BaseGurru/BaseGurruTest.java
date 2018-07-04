package BaseGurru;

import GurruLoginPage.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;

public class BaseGurruTest {
    public LoginPage loginPage;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        browser = "chrome";
        baseUrl = "https://premier-dev.azurewebsites.net/";

    }

}