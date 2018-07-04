package GurruLoginPage;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class LoginPage {
    private By userNameField = xpath("//*[@id=\"login-username\"]");
    private By passwordField = xpath("//*[@id=\"login-password\"]");
    private By loginButton = xpath("//*[@id=\"loginBtn\"]");


    public LoginPage open() {
        Selenide.open("#/login");
        return this;
    }

    public LoginPage typeUserName(String userName) {
        $(userNameField).setValue(userName);
        return this;
    }

    public LoginPage typePassword (String password){
        $(passwordField).val(password);
        return this;
    }

    public void clickLoginButton () {
        $(loginButton).click();
    }


    //Selenide timauot configure: mvn -Dselenide.timeout=8000
}
