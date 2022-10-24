package lt.erika.pom.pages;


import org.openqa.selenium.By;

public class Locators {

    public static class Login {
        public static By inputUserName = By.xpath("//*[@class='email']");
        public static By buttonSubmit = By.xpath("//*[@class='button-1 login-button']");
        public static By userName = By.xpath("//*[@class='ico-account']");
        public static By formAd = By.xpath("//*[@class='content']");
        public static By buttonCloseAd = By.xpath("//*[@id='eu-cookie-ok']");
        public static By inputPassword = By.xpath("//*[@class='password']");
        public static By errormessage = By.xpath("//*[@class='message-error validation-summary-errors']");
        public static By buttonForgotPassword = By.xpath("//*[@class='forgot-password']");
        public static By buttonResetPassword = By.xpath("//*[@class='button-1 password-recovery-button']");
        public static By inputEmail = By.xpath("//*[@class='email']");
        public static By reportMessage = By.xpath("//div[@class='result']");
    }

    public static class BookSearch {

        public static By searchBoxButton = By.xpath("//*[@class='button-1 search-box-button']");
        public static By extendedSearchButton = By.xpath("//*[@id='advs']");
        public static By selectAuthor = By.xpath("//*[@id='mid']");
        public static By advancedButton = By.xpath("//*[@class='button-1 search-button']");
        public static By buttonBook = By.xpath("//*[@class='product-item hover-variant-one sevenspikes-ajaxcart']");
        public static By bookTitle = By.xpath("//div[@class='productAddedToCartWindowTitle']");
    }

    public static class Books {
        public static By bookTittle = By.xpath("//*[@id='small-searchterms']");
        public static By clickSearchButton = By.xpath("//*[@class='button-1 search-box-button']");
        public static By bookUglyLove = By.xpath("(//span[@class='item-box-overlay-tint'])[1]");
        public static By clickUnits = By.xpath("//span[@class='plus']");
        public static By orderButton = By.xpath("(//button[@id='add-to-cart-button-2026'])[1]");
        public static By units = By.xpath("(//span[@class='quantity'])[1]");
    }
}

