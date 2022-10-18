package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement name;

    public MainPage() {
        this.name = $(By.xpath("//*[contains(@class,\"tico ellip\")]"));
    }

    public String getName() {
        return name.getText();
    }
}
