package BasePage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public AddressPage(WebDriver driver) {
        super(driver);
    }
    public void addressPageMet() throws InterruptedException {
        clickTo(By.cssSelector("button[class='gg-ui-btn-primary gg-btn post-address gg-ui-btn-fluid post-address-button gg-ui-btn-lg']"));
        logger.info("---Hatalı Adres Görüldü");
        scrollDown();
        clickTo(By.cssSelector("a[title='Sepeti Düzenle']"));
        logger.info("---Sepet Düzenlendi");
        Thread.sleep(1500);

    }
}
