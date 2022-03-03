package Pages;
import gherkin.deps.com.google.gson.JsonArray;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Pages.driverInitialization.driver;

public class LoginPage {

    private static String email="name";
    private static String password= "password";
    private static String lbutton ="body > div.container > div.row.home-box > div:nth-child(2) > form > div.row > div.col-4 > button";
    private static String dashboard= "body > div.c-wrapper > div.c-body > main > div > h1";
    private static String ErrorMsg="/html/body/div[1]/div[2]/div[2]/form/div[1]/div";
    private static String InvalidEmail= "/html/body/div[1]/div/div/div/div/div/form/div[1]/div[2]";
    private static String ForgotPassword="/html/body/div[1]/div[2]/div[2]/form/div[3]/div[2]/a";
    private static String ResetText="/html/body/div[1]/div/div/div/div/div/form/h1";
    private static String ResetTextBox="email";
    private static String SuccessmsgReset="/html/body/div[1]/div/div/div/div/div/div";
    private static String ResetPasswordLinkButton="/html/body/div[1]/div/div/div/div/div/form/div[2]/div/button";
    private static String userName="/html/body/div[2]/header/ul[3]/li/a/div";
    private static String Logout="/html/body/div[2]/header/ul[3]/li/div/a";
    public static WebElement VerifyLogoutButton() {
        return driver.findElement(By.xpath(Logout));
    }
    public static WebElement getEmail(){
        return driver.findElement(By.name(email));
    }
    public static WebElement VerifyErrorMsg() {
        return driver.findElement(By.xpath(ErrorMsg));
    }
    public static WebElement VerifyinvalidEmailErrorMsg() {
        return driver.findElement(By.xpath(InvalidEmail));
    }
    public static WebElement getForgotPassword(){
        return driver.findElement(By.xpath(ForgotPassword));
    }
    public static WebElement getSuccessMsg(){
        return driver.findElement(By.xpath(SuccessmsgReset));
    }
    public static WebElement getResetText(){
        return driver.findElement(By.xpath(ResetText));
    }
    public static WebElement getResetTextBox(){
        return driver.findElement(By.name(ResetTextBox));
    }
    public static WebElement getResetPasswordLinkButton(){
        return driver.findElement(By.xpath(ResetPasswordLinkButton));
    }
    public static WebElement getuserName(){
        return driver.findElement(By.xpath(userName));
    }
    public static WebElement getPassword(){
        return driver.findElement(By.name(password));
    }
    public static WebElement getButton(){
        return driver.findElement(By.cssSelector(lbutton));
    }
    public static WebElement getDashboard(){
        return driver.findElement(By.cssSelector(dashboard));}


     ///Forgot Password Function

    public static String inboxSearch="//*[@id=\"inbox_field\"]";
    public static WebElement getInboxSearchB(){
        return driver.findElement(By.xpath(inboxSearch));}
    public static String goButton= "//*[@id=\"inbox_pane\"]/div[1]/div[5]/button";
    public static WebElement getGoButton(){
        return driver.findElement(By.xpath(goButton));}
    public static String mailTEXT="//*[@id=\"inbox_pane\"]/div[1]/div[1]/h4";
    public static WebElement getmailinatortext(){
        return driver.findElement(By.xpath(mailTEXT));}
    public static  String resetEmail="[id*='row_dimples']";
    public static WebElement emailThreads(){
        //return driverInitialization.driver.findElement(By.cssSelector(resetEmail));
        return driver.findElement(By.cssSelector(resetEmail));
        }

    public static  String setPassword="password";
    public static WebElement getSetPassword(){
        return driverInitialization.driver.findElement(By.name(setPassword));
    }

    public static  String confirmPassword="password_confirmation";
    public static WebElement getConfirmPassword(){
        return driverInitialization.driver.findElement(By.name(confirmPassword));
    }

    public static  String resetPassowrdText="/html/body/div[1]/div/div/div/div/form/h1";
    public static WebElement getResetPassowrdText(){
        return driverInitialization.driver.findElement(By.xpath(resetPassowrdText));
    }

    public static String ResetLink="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a";
    public static WebElement getResetLink(){
        return driver.findElement(By.xpath(ResetLink));}
    public static void waitForVisible(WebDriver driver, WebElement element) {
        try {
            Thread.sleep(3000);
            System.out.println("Waiting for element visibility");
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



}
