package BasePage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void homePageMet(){
    clickTo(By.cssSelector("a[class='tyj39b-5 lfsBU']"));
    sendKeys(By.cssSelector("input[data-cy='header-search-input']"),"laptop");
    logger.info("---Aramaya Laptop Yazıldı");
    clickTo(By.cssSelector("button[data-cy='search-find-button']"));
    scrollDown();
    }
}
