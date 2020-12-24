package tests;

import com.codeborne.selenide.Configuration;
import config.WebConfigHelper;
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
        Configuration.browser = WebConfigHelper.getBrowserName();
        Configuration.browserVersion = WebConfigHelper.getBrowserVersion();
        Configuration.remote = WebConfigHelper.getWebDriverRemoteURL();
    }


    @Test
    void selenideSearchInChrome() {
        String searchItem = WebConfigHelper.getSearchItem();
        String searchResult = WebConfigHelper.getSearchResult();
        String baseURL = WebConfigHelper.getBaseUrl();

        open(baseURL);
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));
    }
}
