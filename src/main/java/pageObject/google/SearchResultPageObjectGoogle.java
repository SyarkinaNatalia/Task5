package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObjectGoogle extends Base {
    public SearchResultPageObjectGoogle(WebDriver driver){

        super(driver);
    }

    @FindBy(xpath = ".//div[@class='main']//a[contains(.,'картинки')]")
    private WebElement imagesTab;

    /**
     * Вводим текст в строку поиска
     * @param
     */
    public boolean isImTabButIsExsist(){

        return waitVisibilityElement(imagesTab);
    }
}
