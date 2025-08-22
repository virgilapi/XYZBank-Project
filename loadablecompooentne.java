public class loadablecompooentne {

//    package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.LoadableComponent;
//
//import java.time.Duration;
//
//public class LoginPage extends LoadableComponent<LoginPage> {
//
//    private WebDriver driver;
//    private WebDriverWait wait;
//    private By usernameField = By.id("username"); // schimbă după proiectul tău
//    private By passwordField = By.id("password");
//    private By loginButton   = By.id("loginButton");
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//
//    @Override
//    protected void load() {
//        // Dacă pagina ta are URL dedicat
//        driver.get("https://example.com/login");
//    }
//
//    @Override
//    protected void isLoaded() throws Error {
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
//        } catch (Exception e) {
//            throw new Error("LoginPage nu s-a încărcat corect", e);
//        }
//    }
//
//    public void enterUsername(String username) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
//    }
//
//    public void enterPassword(String password) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
//    }
//
//    public void clickLogin() {
//        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
//    }
//}
}
