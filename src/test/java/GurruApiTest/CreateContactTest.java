package GurruApiTest;
import BaseGurru.BaseGurruTest;

import GurruContactsPage.ContactCreate;
import GurruLoginPage.LoginPage;
import org.junit.Test;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CreateContactTest extends BaseGurruTest{

    private ContactCreate contactCreate;

    @Test
    public void createContact() {
        contactCreate = new ContactCreate();
        contactCreate
                .clickOnCustomerSidebarTab();

        sleep(3000);
        //.typeUserName("wtAdmin")
        //.typePassword("Aa123456!")
        //.clickLoginButton();
        // $(By.id("dLabel")).shouldHave(text("Administrator Administrator")); //change fucking xpath

    }




    //Error test: $(".alert").shouldNotHave(text("Error"));

    //find element by text: $(byText("asd")).shouldBe(visible);
    //or
    // $(withText("ru")).shouldHave(text("Gurru"));

    //RANDOM:   $(byCssSelector("[name=UserName]")).setValue("TestAutomation"+nextInt()+"Professor");
}
