package com.gittigidiyor.test;


import BasePage.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class TestApp extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;
    ProductBagPage productBagPage;
    AddressPage addressPage;
    FavoritePage favoritePage;


    @Test
    public void TestApp() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.loginPageMet();
        homePage = new HomePage(driver);
        homePage.homePageMet();
        productPage = new ProductPage(driver);
        productPage.productPageMet();
        productBagPage = new ProductBagPage(driver);
        productBagPage.productPageBagMet();
        addressPage = new AddressPage(driver);
        addressPage.addressPageMet();
        favoritePage = new FavoritePage(driver);
        favoritePage.favoritePageMet();



    }
}
