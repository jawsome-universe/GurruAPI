package GurruUsersPage;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class UserCreate {

    private By createUserButton = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/ix-index-template/div/div/div/div/div[1]/a[1]");
    private By emailTextField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.email')]");
    private By usernameTextField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.userName')]");
    private By firstNameTextField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.firstName')]");
    private By lastNameTextField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.lastName')]");
    private By phoneNumberField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.phoneNumber')]");
    private By positionTextField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.position')]");

    private By openRoleDropdown = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/form/div[1]/div/div/div/fieldset/div[7]/span/span[1]/span[1]");
    private By selectRole = xpath("/html/body/div[3]/div/div[3]/ul/li[4]");

    private By openSupervisorDropdown = xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/form/div[1]/div/div/div/fieldset/div[9]/span/span[1]/span[1]");
    private By selectSupervisor = xpath("//*[@id=\"supervisor_listbox\"]/li[2]/span[2]/h5");

    private By userPasswordTextField = xpath("//div[contains(@class, 'form-group')]/input[contains(@ng-model, 'user.password')][1]");
    private By confirmUserPasswordTextField = xpath("/html//div[2]/form/div[1]//fieldset/div[12]/input");

    private By createButton = xpath("//button[contains(@class, 'btn bg_gradient_blue btn_like btn_update')][2]");

    private By confirmPopUp = xpath("//div[contains(@ng-class, 'alertClasses(message)')]"); //"Successfully created User"


    public UserCreate open(){
        Selenide.open("#/users");
        return this;
    }

    public void clickOnCreateUserButton(){
        $(createUserButton).click();
    }

    public UserCreate typeEmail(String email) {
        $(emailTextField).setValue(email);
        return this;
    }

    public UserCreate typeUserName(String username) {
        $(usernameTextField).setValue(username);
        return this;
    }

    public UserCreate typeFirstName(String firstname) {
        $(firstNameTextField).setValue(firstname);
        return this;
    }

    public UserCreate typeLastName(String lastname) {
        $(lastNameTextField).setValue(lastname);
        return this;
    }

    public UserCreate typePhoneNumber(String phoneNumber) {
        $(phoneNumberField).setValue(phoneNumber);
        return this;
    }







}