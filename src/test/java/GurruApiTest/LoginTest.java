package GurruApiTest;

import GurruLoginPage.LoginPage;
import org.junit.Test;
import org.junit.Assert.*;
import GurruLoginPage.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginTest {

    static LoginPage loginPage;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        browser = "chrome";
        baseUrl = "https://premier-dev.azurewebsites.net/";
    }

    @Test
    public void login() {
        loginPage = new LoginPage();
        loginPage.open()
             .typeUserName("wtAdmin")
             .typePassword("Aa123456!")
             .clickLoginButton();
        $(By.id("dLabel")).shouldHave(text("Administrator Administrator")); //change fucking xpath

    }
/*
    @Test
    public void userCanLoginByUsername() {
        open("/login");
        $(By.name("user.name")).setValue("johny");
        $("#submit").click();
        $(".loading_progress").should(disappear); // Waits until element disappears
        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text
    }
    */
}
