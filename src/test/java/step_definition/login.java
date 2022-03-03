package step_definition;
import Pages.LoginPage;
import Pages.driverInitialization;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static Pages.driverInitialization.driver;

public class login {

    @Given("^URL should open successfully$")
    public void openURL() throws Exception {

//        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aasma Jabin\\Music\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
         driver = new ChromeDriver();

        // Launch Website
       driver.get("https://staging-opsacademy.daraz.com/login");
        Thread.sleep(2000);

        //Maximize the browser
        driver.manage().window().maximize();
    }

   @When("^User enters a valid email address$")
    public void enterEmail(){
       LoginPage.getEmail().clear();
       LoginPage.getEmail().sendKeys("productops@daraz.pk");
    }
    @And("^User enters correct password$")
    public void enterPassword(){
        LoginPage.getPassword().clear();
        LoginPage.getPassword().sendKeys("secret");
    }

    @And("^User click Login button$")
    public void clickLoginButton(){
        LoginPage.getButton();
        LoginPage.getButton().click();

    }

    @Then("^User should be able to login$")
    public void DashboardText() throws Exception{
        Thread.sleep(3000);
        String actual= LoginPage.getDashboard().getText();
        String expected= "Dashboard";
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

    @When("^User enters a invalid email address$")
    public void enterivalidEmail(){
        LoginPage.getEmail().clear();
        LoginPage.getEmail().sendKeys("abc@daraz.pk");
    }
    @Then("^An error message should appear.$")
    public void verifyErrorMsg() throws Exception{
        Thread.sleep(3000);
        String actual= LoginPage.VerifyErrorMsg().getText();
        String expected= "Invalid username or password.";
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
}
    @When("^User enters incorrect password$")
    public void enterinvalidPassword(){
        LoginPage.getPassword().clear();
        LoginPage.getPassword().sendKeys("abcdf");
    }
    @When("^User clicks FORGOT PASSWORD option.$")
    public void clickForgotPassword(){
        LoginPage.getForgotPassword().click();

    }
    @Then("^Enter Email address text box should appear.$")
    public void verifyResettext() throws Exception{
        Thread.sleep(3000);
        String actual = LoginPage.getResetText().getText();
        String expected = "Reset Your Password";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }
    @When("^User enters invalid email address$")
    public void enterivalidEmailFP(){
        LoginPage.getResetTextBox().clear();
        LoginPage.getResetTextBox().sendKeys("abc@daraz.pk");
    }
    @When("^press send send password reset link.$")
    public void clickResetPasswordLinkButton(){
        LoginPage.getResetPasswordLinkButton().click();
    }


    @Then("^An invalid email error message should appear.$")
    public void verifyEmailErrorMsg() throws Exception {
        Thread.sleep(3000);
        String actual = LoginPage.VerifyinvalidEmailErrorMsg().getText();
        String expected = "We can't find a user with that email address.";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }
    @When("^User enters valid email address$")
    public void entervalidEmailFP(){
        LoginPage.getResetTextBox().clear();
       // LoginPage.getResetTextBox().sendKeys("automationdaraz7@gmail.com");
        LoginPage.getResetTextBox().sendKeys("Dimples@mailinator.com");
    }
    @Then("User should be able to send reset Link.")
    public void resetsuccessfulmsg() throws Exception {
        Thread.sleep(3000);
        String actual = LoginPage.getSuccessMsg().getText();
        String expected = "We have emailed your password reset link!";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @When("^User Clicks user name on top right corner of dashboard.$")
    public void userName(){
        LoginPage.getuserName().click();
}

    @And("^User clicks on Logout Button$")
    public void clickLogout(){
        LoginPage.VerifyLogoutButton().click();}
    @Then("^Close the browser.$")
    public void close(){
        driver.quit();}

    @And("^User opens email box and clicks reset link.$")
    public void newBrowserForReset() throws InterruptedException {
        driver.get("https://www.mailinator.com/v4/public/inboxes.jsp");
        LoginPage.getInboxSearchB().sendKeys("Dimples");
        LoginPage.getGoButton().click();
        Thread.sleep(3000);
        LoginPage.emailThreads().click();
    }
    @And("User click reset password button.")
    public void clickResetPassword(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,20000)", "");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);
        driver.switchTo().frame(0); // Switching the Outer Frame
        LoginPage.getResetLink().click();

    }
    @And("User enter new password.")
    public void setPassword(){
        System.out.println("checkeeeeeerrrrrrrrr");
        LoginPage.getSetPassword().sendKeys("Aasma@123");
    }

    @And("User confirms new password.")
    public void confirmPassword(){
        LoginPage.getConfirmPassword().sendKeys("Aasma@123");
    }
    @And("user clicks Reset button.")
    public void clickSubmitPassword(){
        LoginPage.getConfirmPassword().click();
    }
    @Then("Reset password page should open.")
    public void verifyRestPassword() throws Exception {
        Thread.sleep(3000);
        System.out.println(LoginPage.getResetPassowrdText().getText());
        String actual = LoginPage.getResetPassowrdText().getText();
        String expected = "Reset Password";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

}

