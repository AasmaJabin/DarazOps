package step_definition;

import Pages.StudentsPage;
import Pages.TeachersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
public class addTeachers {
    @When("^User clicks on Teachers.$")
    public void selectTeacher(){
        TeachersPage.getTeacherBtn().click();
    }
    @And("User clicks on Add Teacher button.")
    public void clickAddTeacher(){
        TeachersPage.getAddTeacherBtn().click();
    }
    @Then("Add Teacher page should open.")
    public void verifyAddTeacher() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.getAddTeacherText().getText();
        String expected = "Add Teacher";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @When("User enters Employee ID")
    public void sendEmpID(){
     TeachersPage.getempID().sendKeys(TeachersPage.EmpID);
    }
    @And("User enters First Name")
    public void sendFirsttName(){
       TeachersPage.getfname().sendKeys(TeachersPage.firstName);
    }
    @And("User enters Last Name")
    public void sendLastName(){
        TeachersPage.getlname().sendKeys(TeachersPage.lastName);
    }
    @And("User enters Username.")
    public void sendUserName(){
        TeachersPage.getusername().sendKeys(TeachersPage.userName);
    }
    @And("User enters a valid email.")
    public void sendEmail(){
        TeachersPage.getEmail().sendKeys(TeachersPage.emailAddress+"@gmail.com");
    }
    @And("User selects Venture from dropdown.")
    public void selectVenture(){
        TeachersPage.getVentureBtn().click();
        Select drpDepartment= new Select(TeachersPage.getVenture());
        drpDepartment.selectByIndex(TeachersPage.random);


    }
    @And("User selects role.")
    public void selectRole(){
        Select drpDepartment= new Select(TeachersPage.getRole());
        drpDepartment.selectByVisibleText("Teacher");

    }
    @And("User clicks Submit Button")
    public void clickSubmit(){
        TeachersPage.getSubmitbtn().click();

    }
    @Then("User should be able to add a Teacher.")
    public void verifySuccessMsg() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.getSuccessMsg().getText();
        String expected = "Teacher created successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @And("User should be redirected to Update Teacher Page.")
    public void verifyRedirectionEditPage() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.geteditTeacherText().getText();
        String expected = "Update Teacher";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }

}
