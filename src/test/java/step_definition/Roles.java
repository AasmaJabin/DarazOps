package step_definition;

import Pages.DashboardPage;
import Pages.RolesPage;
import Pages.StudentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static Pages.driverInitialization.driver;

public class Roles {
    @When("User clicks on Roles.")
    public static void clickRoles(){
        RolesPage.getroleButton().click();
    }
    @And("User clicks on Add Roles button.")
    public static void clickAddRoles(){
        RolesPage.getaddRoleButton().click();
    }
    @Then("Add Role page should open.")
    public static void OpenCreateRole() throws InterruptedException {
        Thread.sleep(3000);
        String actual = RolesPage.getcreateRoleText().getText();
        String expected = "Name of the Role";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);}
    @And("User enters role name.")
    public static void enterRoleName(){

        RolesPage.getnewRoleNameField().sendKeys(RolesPage.name);
    }
    @And("User Chooses permissions.")
    public static void addPermission() {
        RolesPage.gettickViewRoleBox().click();
        RolesPage.getCrossBtn().click();
        RolesPage.getmovePageTwo().click();
        RolesPage.gettickViewTeacherBox().click();
        RolesPage.getmoveNextPage().click();
        RolesPage.tickViewCourseBox().click();

    }
    @And("User clicks submit.")
    public static void clickSubmitButton(){
        RolesPage.getcreateRoleButton().click();
    }

    @And("User clicks on View Roles button.")
    public static void clickViewButton(){
        RolesPage.getviewRoleButton().click();
    }
    @And("User enter the newly added role name in search box.")
    public static void searchRole(){
        RolesPage.getSearchBox().sendKeys(RolesPage.name);
        RolesPage.getSearchBtn().click();
    }
    @And("User should be able to search role.")
    public static void verifySearch() throws InterruptedException {
        Thread.sleep(3000);
        String actual = RolesPage.getSearchResults().getText();
        String expected = (String) RolesPage.name;
        System.out.println(expected);
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @And("User clicks on Create button.")
    public static void getCreateBtn(){
        RolesPage.getcreateButton().click();

    }
    @Then("User should be redirected to Create Role Page.")
    public static void VerifyCreateRole() throws InterruptedException {
        Thread.sleep(3000);
        String actual = RolesPage.getcreateRoleText().getText();
        String expected = "Name of the Role";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);}


}