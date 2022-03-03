package step_definition;

import Pages.StudentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class s2_UpdateStudent {
    @When("^User modifies employee id.$")
    public void modifyEmpID(){
        StudentsPage.getEmpId().sendKeys("11");

    }
    @And("^User modifies WFM id.$")
    public void modifyWFMId(){
        StudentsPage.getWFMId().sendKeys("11");
    }
    @And("^User modifies First Name.$")
    public void modifyFirstName(){
        StudentsPage.getFN().sendKeys("11");
    }
    @And("^User modifies Last Name.$")
    public void modifyLastName(){
        StudentsPage.getLN().sendKeys("11");

    }
    @And("^User modifies User name.$")
    public void modifyUserName(){
        StudentsPage.getUN().sendKeys("11");

    }
    @And("^User modifies Venture.$")
    public void modifyVenture(){
        StudentsPage.getVenture().click();
        Select drpVenture= new Select(StudentsPage.getVenture());
        drpVenture.selectByVisibleText("Sri Lanka");
    }
    @And("^User modifies Department.$")
    public void modifyDepartment(){
        StudentsPage.getDepartment().click();
        Select drpDepartment= new Select(StudentsPage.getDepartment());
        drpDepartment.selectByVisibleText("SQA");
    }
    @And("^User clicks Submit Button again.$")
    public void clickModifySubmit(){
        StudentsPage.ClickSubmitButton().click();
    }
    @Then("^User should be able to modify student details.$")
    public void VerifyModification()throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.getUpdateStuSuccessMsg().getText();
        String expected = "Student updated successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @When("^User clicks edit.$")
    public void clickViewEditButton(){
        StudentsPage.clickEditButton().click();
    }
    @Then("^User should be redirected to Update student page.$")
    public void VerifyViewUpdatePage()throws Exception{
     Thread.sleep(3000);
    String actual = StudentsPage.verifyUPDStuText().getText();
    String expected = "Update Student";
        System.out.println(actual);
        Assert.assertEquals(actual,expected);}
    @Then("^User should get an error message.$")
    public void VerifyPasswordEM()throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.getPasswordErrorMessage().getText();
        String expected = "The password must be at least 8 characters.";
        System.out.println(actual);
        Assert.assertEquals(actual,expected);}

    @And("^User click Set Password.$")
    public void cSetPassword(){
        StudentsPage.clickSetPasswordButton().click();
    }
    @Then("^User should be redirected to Set Password Screen.$")
    public void VerifyRestPasswordText()throws Exception{
        Thread.sleep(3000);
        Thread.sleep(3000);
        String actual = StudentsPage.verifyResetPsswordT().getText();
        String expected = "Set Password";
        boolean isAvailable = actual.equals(expected);
        Assert.assertTrue(isAvailable);
    }
    @And("^User enters an invalid password.$")
    public void enterInvalidPassword(){
        StudentsPage.enterNewPassword().sendKeys("Pirate");}
    @And("^confirms the password.$")
    public void confirmInvalidPassword(){
        StudentsPage.confirmNewPassword().sendKeys("Pirate");}


    @Then("^An error related to password length message should appear.$")
    public void VerifyLengthErrorMsg()throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.getlengthmsg().getText();
        String expected = "Password length must be 8 character";
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @And("^User enters password of equal to or more than 8 characters.$")
    public void enterPassword() throws InterruptedException {
        StudentsPage.enterNewPassword().clear();
        StudentsPage.confirmNewPassword().clear();
        StudentsPage.enterNewPassword().sendKeys("Pirate@11564");
        StudentsPage.confirmNewPassword().sendKeys("Pirate@11564");
        Thread.sleep(3000);

    }
    @And("^User clicks Update Button again.$")
    public void getUpdatePasswordButton() throws InterruptedException {
        StudentsPage.getUpdatePassword().click();
        Thread.sleep(3000);
    }








}
