package tests;

import com.codeborne.selenide.Configuration;
import config.ConfigHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
        Configuration.browser = ConfigHelper.getBrowserName();
        Configuration.browserVersion = ConfigHelper.getBrowserVersion();
        Configuration.remote = ConfigHelper.getWebDriverRemoteURL();
    }


    @Test
    void selenideSearchInChrome() {
        String searchItem = ConfigHelper.getSearchItem();
        String searchResult = ConfigHelper.getSearchResult();
        String baseURL = ConfigHelper.getBaseUrl();

        open(baseURL);
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));
    }
}
