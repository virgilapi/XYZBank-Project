package pages;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import helperMethods.PageHelper;
import loadableComponent.CustomLoadableComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends CustomLoadableComponent {
    public WebDriver driver;
    public ElementHelper elementHelper;
    public PageHelper pageHelper;
    public AlertHelper alertHelper;

    public BasePage (WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
        pageHelper = new PageHelper(driver);
        alertHelper = new AlertHelper(driver);
        PageFactory.initElements(driver,this);
    }

    @Override
    public void load() {

    }

    @Override
    public void isLoaded() throws Error {

    }
}
