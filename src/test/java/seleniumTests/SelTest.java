package seleniumTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.google.InitPageObjectGoogle;
import pageObject.google.SearchResultPageObjectGoogle;

public class SelTest extends BaseTest {
    @Test
    public void startTest(){
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();

        InitPageObjectGoogle in = new InitPageObjectGoogle(getDriver());
        in.setSearchText("Привет");
        in.clickSubmitSearch();
        SearchResultPageObjectGoogle sr =new SearchResultPageObjectGoogle(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isImTabButIsExsist());
    }
}
