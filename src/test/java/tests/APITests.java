package tests;

import config.APIConfigHelper;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static io.restassured.RestAssured.get;

public class APITests {

    @Test
    void bookStoreTest() {
        String baseUrl = APIConfigHelper.getBaseUrl();
        String assertedValue = APIConfigHelper.assertedValue();

        get(baseUrl)
                .then()
                .body("books[0].title", is(assertedValue));
    }
}
