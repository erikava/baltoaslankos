package lt.erika.pom.pages.baltosLankos;


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
    }

    public static class BookSearch {

        public static By searchBoxButton = By.xpath("//*[@class='button-1 search-box-button']");

        public static By extendedSearchButton = By.xpath("//*[@id='advs']");

        public static By selectAuthor = By.xpath("//*[@id='mid']");
        public static By advancedButton = By.xpath("//*[@class='button-1 search-button']");
        public static By ButtonBook = By.xpath("/html/body/div[9]/div[3]/div[4]/div/div[1]/div/div[2]/div[3]/div/div[2]/div/div/div[4]/div/div[2]/div[4]/a/span");
        public static By bookTitle = By.xpath("//*[@class='product-name']");
    }

    public static class Books {


        public static By clickBook = By.xpath("/html/body/div[9]/div[3]/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[3]/div[4]/a/span");

        public static By clickAddButton = By.xpath("//*[@id='add-to-cart-button-1970']");
        public static By buttonAddMore = By.xpath("//*[@class='plus']");
        public static By productAddedToCartTittle = By.xpath("//*[@class='productAddedToCartWindowTitle']");
    }
}

