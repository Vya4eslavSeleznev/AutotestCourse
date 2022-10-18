package test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import page.LoginPage;
import page.MainPage;
import user.User;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    private static User user;
    private static String name = "";
    private static String phone = "";
    private static String password = "";

    @BeforeAll
    public static void createUser() {
        user = new User(name, phone, password);
    }

    @Test
    public void loginTest() {
        String url = "https://ok.ru/";
        Selenide.open(url);
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = loginPage.login(user);
        assertEquals(mainPage.getName(), user.getName());
    }
}
