package BasePage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void productPageMet() throws InterruptedException {
        Thread.sleep(1000);
      // randomProduct(By.cssSelector("div[data-cy='product-favorite']"));   Sırayla ürünleri seçmek için kullanılabilir...
        addProductToFav(4);
        logger.info("---4 Ürün Seçildi");
        driver.get("https://www.gittigidiyor.com/");
        logger.info("---Tekrar Anasayfaya Gidildi");
        sendKeys(By.cssSelector("input[data-cy='header-search-input']"),"çanta");
        logger.info("---Çanta Aratıldı");
        clickTo(By.cssSelector("button[class='qjixn8-0 sc-1bydi5r-0 gaMakD']"));


    }
}
