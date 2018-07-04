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

public class CreateContactTest extends BaseGurruTest{

    private ContactCreate contactCreate;

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
