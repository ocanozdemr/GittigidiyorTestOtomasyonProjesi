package BasePage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);

    }

    public WebElement findTo(By locator) {
        return driver.findElement(locator);
    }

    public void clickTo(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        findTo(locator).click();
    }

    public void newTab() {
        ((JavascriptExecutor) driver).executeScript("window.open()");


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println("Tab Size" + tabs.size());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.gittigidiyor.com/");

    }

    public void sendKeys(By locator, String text) {
        findTo(locator).sendKeys(text);
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4100)");
    }

    public void scrollDownOne() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public void scrollDownTwo() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
    }

    public List<WebElement> findToAll(By locator) {
        return driver.findElements(locator);
    }

    public void randomProduct(By locator) {                                 //Sırayla ürünleri seçmek için kullanılabilir...
        for (int i = 0; i < 4; i++) {
            Random rand = new Random();
            findToAll(locator).get(rand.nextInt(findToAll(locator).size())).click();
            scrollDownTwo();
        }
    }

    public void clickElementList(By locator, int value) {
        findToAll(locator).get(value).click();
    }

    public void assertCont(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    public void assertTotal(String text, By locator) {
        Assert.assertEquals(text, findToText(locator));
    }

    public String findToText(By locator) {
        return driver.findElement(locator).getText();
    }
    public List<WebElement> getAllProducts(By locator){
        return findToAll(locator);
    }

    public void addProductToFav(int amount) throws InterruptedException {
        List<Integer> randlist = new ArrayList<>();
        int count = 0;
        while (count != amount){
            int randIdx = (int)(Math.random() * 10);
            if(!(randlist.contains(randIdx))){
                randlist.add(randIdx);
                try{
                    getAllProducts(By.cssSelector("div[data-cy='product-favorite']")).get(randIdx).click();
                }catch (Exception e){
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", getAllProducts(By.cssSelector("div[data-cy='product-favorite']")).get(randIdx));
                }

                Thread.sleep(500);
                count++;
            }
        }
    }

}
