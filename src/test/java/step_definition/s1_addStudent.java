package step_definition;
import Pages.LoginPage;
import Pages.StudentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class s1_addStudent {

    @When("^User clicks on Students.$")
    public void clickStudents(){
        StudentsPage.clickStudentButton().click();
    }
    @And("^User clicks on Add Student button.$")
    public void clickAddStudentButton(){
        StudentsPage.clickAddStudentButton().click();
    }
    @Then("^Add student page should open.$")
    public void verifyAddStudentPage() throws Exception{

        Thread.sleep(3000);
        String actual =StudentsPage.VerifyAddStudentText().getText();
        String expected = "Add Student";
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @When("^User enters employee id$")
    public void enterEmpID(){
        StudentsPage.getEmpId().clear();
        StudentsPage.getEmpId().sendKeys(StudentsPage.EmpID);

    }
    @And("^User enters WFM id.$")
    public void enterWFMId(){
        StudentsPage.getWFMId().clear();
        StudentsPage.getWFMId().sendKeys(StudentsPage.WFMid);
    }
    @And("^User enters First Name.$")
    public void enterFirstName(){
        StudentsPage.getFN().clear();
        StudentsPage.getFN().sendKeys(StudentsPage.firstName);
    }
    @And("^User enters Last Name.$")
    public void enterLastName(){
        StudentsPage.getLN().clear();
        StudentsPage.getLN().sendKeys(StudentsPage.lastName);

    }
    @And("^User enters User name.$")
    public void enterUserName(){
        StudentsPage.getUN().clear();
        StudentsPage.getUN().sendKeys(StudentsPage.userName);

    }
    @And("^User enters a valid password.$")
    public void enterPassword(){
        StudentsPage.getPassword().clear();
        StudentsPage.getPassword().sendKeys(StudentsPage.Password);
    }
    @And("^User selects Venture.$")
    public void selectVenture(){
        StudentsPage.getVenture().click();
        Select drpVenture= new Select(StudentsPage.getVenture());
        drpVenture.selectByVisibleText("Pakistan");
    }
    @And("^User selects Department.$")
    public void selectDepartment(){
        StudentsPage.getDepartment().click();
        Select drpDepartment= new Select(StudentsPage.getDepartment());
        drpDepartment.selectByVisibleText("SQA Testing department2");

    }
    @And("^User clicks Submit Button.$")
    public void ClickSubmit(){
        StudentsPage.ClickSubmitButton().click();}

    @Then("^User should be able to add a student.$")
    public void VerifySuccessMsg() throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.getAddStuSuccessMsg().getText();
        String expected = "Student created successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @And("^User gets redirected to Update student Page.$")
    public void verifyUpdateStudentText() throws Exception{
        Thread.sleep(3000);
        String actual = StudentsPage.verifyUPDStuText().getText();
        String expected = "Update Student";
        System.out.println(actual);
        Assert.assertEquals(actual,expected);

    }
    @And("^User enters password less then 8 characters.$")
    public void enterinvalidPassword(){
        StudentsPage.getPassword().clear();
        StudentsPage.getPassword().sendKeys("abcd");
    }

}
