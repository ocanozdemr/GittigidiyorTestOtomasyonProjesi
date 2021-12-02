package BasePage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductBagPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public ProductBagPage(WebDriver driver) {
        super(driver);
    }
    public void productPageBagMet() throws InterruptedException {
        scrollDownOne();
        clickTo(By.xpath("(//div[@class='sc-1yvp483-0 dTGwmm'])[8]"));
        Thread.sleep(1000);
        clickTo(By.id("add-to-basket"));
        logger.info("---Ürün Sepete Eklendi");
        clickTo(By.cssSelector("span[class='basket-title']"));
        clickTo(By.cssSelector("select[class='amount']"));
        clickTo(By.cssSelector("option[value='2']"));
        logger.info("---2 Adet Seçildi");
        clickTo(By.cssSelector("input[class='gg-d-24 gg-ui-btn-primary gg-ui-btn-lg btn-pay']"));


    }
}
