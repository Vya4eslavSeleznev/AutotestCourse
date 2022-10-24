package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import user.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement phone;
    private SelenideElement password;
    private SelenideElement logInBtn;

    public LoginPage() {
        this.phone = $(By.name("st.email"));
        this.password = $(By.name("st.password"));
        this.logInBtn = $(By.xpath("//*[contains(@class,'button-pro __wide')]"));
    }

    public MainPage login(User user) {
        phone.setValue(user.getPhone());
        password.setValue(user.getPassword());
        logInBtn.click();

        return new MainPage();
    }
}
