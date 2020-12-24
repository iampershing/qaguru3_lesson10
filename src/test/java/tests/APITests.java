package tests;


import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static io.restassured.RestAssured.get;

public class APITests {

    @Test
    void bookStoreTest() {
        get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .body("books[0].title", is("Git Pocket Guide"));
    }
}
