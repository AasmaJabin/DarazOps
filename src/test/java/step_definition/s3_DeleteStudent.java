package step_definition;

import Pages.StudentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class s3_DeleteStudent {
    @And("^User clicks on View Student button.$")
    public void clickViewStudentButton(){
     StudentsPage.getViewStuButton().click();

    }
    @When("^User enters Employee id.$")
    public void enterEMPID(){
        StudentsPage.getSearchEMPID().sendKeys(StudentsPage.EmpID+"11");

    }
    @And("^User enters WFM id$")
    public void enterWFMID(){
        StudentsPage.getSearchWFMID().sendKeys(StudentsPage.WFMid+"11");

    }
    @And("^User enters User Name.$")
    public void enterUN(){
        StudentsPage.getSearchUN().sendKeys(StudentsPage.userName+"11");

    }
    @And("^User selects Venture$")
    public void selectVenture(){
        StudentsPage.getSearchVenture().click();
        Select drpDepartment= new Select(StudentsPage.getSearchVenture());
        drpDepartment.selectByVisibleText("Sri Lanka");
    }

    @And("^User select Department.$")
    public void selectDepartment(){
        StudentsPage.getSearchDepartment().click();
        Select drpVenture= new Select(StudentsPage.getSearchDepartment());
        drpVenture.selectByVisibleText("SQA");
    }
    @And("^User click search button.$")
    public void clickSearchButton(){
        StudentsPage.getSearchButton().click();
    }

    @Then("^User should be able to search the record.$")
    public void verifySearch() throws Exception{

    }
    @When("^User clicks delete.$")
    public void clickDel(){
        StudentsPage.clickDelButton().click();
    }
    @Then("^A prompt should appear asking for confirmation.$")
    public void verifyDelPrompt() throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.verifyDelButtonTxt().getText();
        String expected = "Are you sure you want to delete student";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @When("^User clicks delete again.$")
    public void clickDelagain(){
        StudentsPage.clickDeleteButtonToConfirm().click();
    }
    @Then("^Record should be deleted successfully.$")
    public void verifyDelSuccessMsg() throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.verifyDeleteSuccessText().getText();
        String expected = "Record deleted";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
}
