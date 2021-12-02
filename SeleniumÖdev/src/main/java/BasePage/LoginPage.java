package BasePage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginPageMet() throws InterruptedException {
        logger.info("----------TEST BAŞLADI-------------");
        assertCont("https://www.gittigidiyor.com/");
        logger.info("---Doğru Site");
        clickTo(By.cssSelector("div[title='Giriş Yap']"));
        clickTo(By.cssSelector("a[data-cy='header-login-button']"));
        sendKeys(By.id("L-UserNameField"), "deneme4481@gmail.com");
        Thread.sleep(1000);
        sendKeys(By.cssSelector("input[type='password']"), "deneme1234");
        logger.info("---Login işlemi yapıldı");
        Thread.sleep(1000);
        clickTo(By.cssSelector("input[class='gg-m-24 gg-t-24 gg-d-24 gg-w-24 gg-ui-btn-primary gg-ui-btn-fluid  gg-ui-btn-lg']"));
    }
}
