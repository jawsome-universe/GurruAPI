package GurruContactsPage;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class ContactCreate {
    private By customersSideBarDropdown = xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[2]/span");
    private By contactsSideBarTab = xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[2]/ul/li[2]/a");
    private By createContactButton = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/ix-index-template/div/div/div/div/div[1]/a[1]");
    private By firstNameField = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/form/div[1]/div/div/fieldset/div[2]/input");
    private By lastNameField = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/form/div[1]/div/div/fieldset/div[3]/input");
    private By createButton = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/form/div[3]/div/div/button[3]");
    private By confirmPopUp = xpath("//div[contains(@class, 'growl-message ng-binding')]");


    public ContactCreate open(){
        Selenide.open("#/contacts");
        return this;
    }

    public void clickOnCustomerSidebarTab(){
        $(customersSideBarDropdown).click();
    }

    public void clickOnContactsTab(){
        $(contactsSideBarTab).click();
    }

    public void clickOnContactCreateButton(){
        $(createContactButton).click();
    }

    public ContactCreate typeFirstName(String firstName) {
        $(firstNameField).setValue(firstName);
        return this;
    }

    public ContactCreate typeLastName(String lastName) {
        $(lastNameField).setValue(lastName);
        return this;
    }

    public void clickOnCreateButton(){
        $(createButton).click();
    }

    public void checkConfirmPopUp(){
        $(confirmPopUp).getText();
    }
}
