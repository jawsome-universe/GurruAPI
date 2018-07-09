package GurruApiTest;
import BaseGurru.BaseGurruTest;

import static org.apache.commons.lang3.RandomUtils.nextInt;
import GurruContactsPage.ContactCreate;
import GurruLoginPage.LoginPage;
import org.junit.Test;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import GurruLoginPage.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CreateContactTest {

    static LoginPage loginPage;
    public ContactCreate contactCreate;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        browser = "chrome";
        baseUrl = "https://premier-dev.azurewebsites.net/";
        loginPage = new LoginPage();
        loginPage.open()
                .typeUserName("wtAdmin")
                .typePassword("Aa123456!")
                .clickLoginButton();
    }

    @Test
    public void createContact() {
        contactCreate = new ContactCreate();
        contactCreate.clickOnCustomerSidebarTab();
        contactCreate.clickOnContactsTab();
        contactCreate.clickOnContactCreateButton();
        contactCreate.typeFirstName("TestUser"+nextInt())
                .typeLastName("LastName"+nextInt())
                .clickOnCreateButton();
        sleep(3000);
        //Check confirm success message
        $(By.xpath("//div[contains(@class, 'growl-message ng-binding')]")).shouldHave(text("Successfully created Contact"));

        //.typeUserName("wtAdmin")
        //.typePassword("Aa123456!")
        //.clickLoginButton();
        // $(By.id("dLabel")).shouldHave(text("Successfully created Contact")); //change fucking xpath

    }




    //Error test: $(".alert").shouldNotHave(text("Error"));

    //find element by text: $(byText("asd")).shouldBe(visible);
    //or
    // $(withText("ru")).shouldHave(text("Gurru"));

    //RANDOM:   $(byCssSelector("[name=UserName]")).setValue("TestAutomation"+nextInt()+"Professor");
}
