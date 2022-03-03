package step_definition;

import Pages.DepartmentPage;
import Pages.LoginPage;
import Pages.StudentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class d2_viewDepartment {
    @And("^User clicks view Departments.$")
    public void ClickVD() throws Exception{
         Thread.sleep(3000);
            DepartmentPage.ClickVD().click();

        }
    @Then("^User should be able to see all departments.$")
    public void VerifyVDPage() throws Exception{
        Thread.sleep(3000);
        String actual = DepartmentPage.VerifyVD().getText();
        String expected = "Department";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }
    @When("User click search button and enter an existing department.")
    public void SearchDepartmentName() {

        DepartmentPage.getSearchbox().sendKeys(DepartmentPage.Dname);
    }
    @Then("Department should appear in search results.")
    public void VerifySearchedName() {

    }

    @When("User clicks Edit button")
    public void clickViewEditButton(){
        DepartmentPage.clickEditButton().click();
    }
    @Then("^An edit prompt should appear.$")
    public void VerifyViewUpdatePage()throws Exception{
        Thread.sleep(3000);
        String actual = DepartmentPage.verifyUPDStuText().getText();
        String expected = "Update Department";
        System.out.println(actual);
        Assert.assertEquals(actual,expected);}
    @When("^User edits the name$")
    public void modifyDepartmentName(){
        DepartmentPage.getEditDepartmentField().sendKeys("11");

    }
    @And("^User clicks submit button.$")
    public void clickModifySubmit(){
        DepartmentPage.ClickSubmitButton().click();
    }
    @Then("^User should be able to edit the name and a success message should appear.$")
    public void VerifyDepartmentUpdatePage()throws Exception{
        Thread.sleep(3000);
        String actual = DepartmentPage.DepartmentUpdateSuccessMsg().getText();
        String expected = "Department updated successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);}
    @When("^User clicks Delete button$")
    public void clickDel(){
        DepartmentPage.clickDelButton().click();
    }
    @When("User should be able to search edited department.")
    public void SearchEditedDepartmentName() {
        DepartmentPage.getSearchbox().sendKeys(DepartmentPage.Dname+"11");
    }

    @Then("^A Delete prompt should appear.$")
    public void verifyDelPrompt() throws Exception{
        Thread.sleep(3000);
        String actual1 = DepartmentPage.verifyDeleteMsg().getText();
        String actual2 = DepartmentPage.verifyDeleteText().getText();
        String expected1 = "Are you sure you want to delete this department?";
        String expected2 = "Delete";
        System.out.println(actual1);
        boolean isAvailable = actual1.contains(expected1) & actual2.contains(expected2);;
        Assert.assertTrue(isAvailable);
    }
    @When("^When user clicks delete button.$")
    public void clickDelagain(){
        DepartmentPage.clickDeleteButtonToConfirm().click();
    }
    @Then("^The record should be deleted and success message should appear.$")
    public void verifyDelSuccessMsg() throws Exception{
        Thread.sleep(3000);
        String actual = DepartmentPage.verifyDeleteSuccessText().getText();
        String expected = "Record deleted successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
}
