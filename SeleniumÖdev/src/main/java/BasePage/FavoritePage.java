package BasePage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritePage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public FavoritePage(WebDriver driver) {
        super(driver);
    }
    public void favoritePageMet() throws InterruptedException {
        assertTotal("Alışveriş Sepetim",By.cssSelector("h1[class='cart-title cart-header-title']"));
        logger.info("---Alışveriş Sepetimde Olunduğu Kontrol Edildi");
        scrollDownOne();
        clickElementList(By.cssSelector("a[class='gg-ui-btn-default btn-add-to-basket']"),5);
        logger.info("---2.Ürün Sepete Eklendi");
        Thread.sleep(3000);
        scrollDownOne();
        clickElementList(By.cssSelector("a[class='btn-delete']"),1);
        logger.info("---3.Ürün Favorilerden Silindi");
        Thread.sleep(1500);
        newTab();
        Thread.sleep(1500);
        clickTo(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[3]/div/div[1]/div/div[2]"));
        Thread.sleep(2000);
        clickTo(By.xpath("//*[contains(text(),'Çıkış')]"));
        logger.info("---Çıkış Yapıldı");
        Thread.sleep(1500);
        logger.info("----------TEST BİTTİ-------------");
        driver.close();






    }
}
