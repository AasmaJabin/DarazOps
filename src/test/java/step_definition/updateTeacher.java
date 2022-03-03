package step_definition;

import Pages.TeachersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class updateTeacher {
    @When("User modifies Employee ID.")
    public void updateEmpID(){
        TeachersPage.getempID().sendKeys("11");
    }
    @And("User modifies First Name")
    public void updateFirsttName(){
        TeachersPage.getfname().sendKeys("11");
    }
    @And("User modifies Last Name")
    public void updateLastName(){
        TeachersPage.getlname().sendKeys("11");}
    @And("User clicks Submit Button..")
    public void clickSearch(){
        TeachersPage.getSubmitbtn().click();

    }
    @Then("User should be able to modify teacher details.")
    public void verifySuccessMsg() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.getEditSuccessMsg().getText();
        String expected = "Teacher updated successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
}
