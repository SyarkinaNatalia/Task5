package seleniumTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.mangalib.InitPageObjectManga;
import pageObject.mangalib.SearchResultPageObjectManga;

public class MyTestSel extends BaseTest {
    @Test
    public void startTest() {
        getDriver().get("https://mangalib.me/");
        getDriver().manage().window().maximize();

        InitPageObjectManga in = new InitPageObjectManga(getDriver());
        SearchResultPageObjectManga sr = new SearchResultPageObjectManga(getDriver());
        Assertion as = new Assertion();

        as.assertTrue(sr.isImTabButIsExsistMang1());
        in.clickSubmitSearch();
        in.setSearchText("Берсерк");
        in.clickSubmitSearch2();
        as.assertTrue(sr.isImTabButIsExsistMang2());
        in.clickSubmitSearch3();
        as.assertTrue(sr.isImTabButIsExsistMang1());
        in.clickSubmitSearch();
        in.setSearchText("Ванпанчмен");
        in.clickSubmitSearch4();
        as.assertTrue(sr.isImTabButIsExsistMang3());

    }
}