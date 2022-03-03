package step_definition;

import Pages.DepartmentPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.security.PublicKey;

public class d1_addDepartment {
    @When("^User clicks department$")
    public void ClickD(){
        {
            DepartmentPage.getDepartment();
            DepartmentPage.getDepartment().click();
        }
    }
    @And("^User clicks Add department$")
    public void ClickAddDepartment(){
        DepartmentPage.ClickAD();
        DepartmentPage.ClickAD().click();
    }
    @And("^User enters unique Department Name$")
    public void EnterDepartmentName(){
        DepartmentPage.EnterDN().clear();
        DepartmentPage.EnterDN().sendKeys(DepartmentPage.Dname);
    }
    @And("^User click submit button$")
    public void SubmitDN(){
        DepartmentPage.SubmitND();
        DepartmentPage.SubmitND().click();
    }
    @Then("^User should be able to add a new department$")
    public void verifyDepartment(){
        DepartmentPage.verifyMSG();
    }
}
