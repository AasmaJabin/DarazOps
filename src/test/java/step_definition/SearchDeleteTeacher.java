package step_definition;

import Pages.TeachersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static Pages.driverInitialization.driver;

public class SearchDeleteTeacher {
    @And("User clicks on View Teachers button.")
    public void clickAddTeacher(){
        TeachersPage.getViewTeacherBtn().click();
    }
    @Then("User enters Employee ID.")
    public void verifyAddTeacher()  {
        TeachersPage.getempID().sendKeys(TeachersPage.EmpID+"11");
    }
    @And("User enters Username..")
    public void sendUserName(){
        TeachersPage.getusername().sendKeys(TeachersPage.userName);
    }
    @And("User click search Button")
    public void clickSubmit(){
        TeachersPage.getSearchBtn().click();
    }
    @When("User clicks edit from search.")
    public void getEditRedirection(){
        TeachersPage.getEditBtnTeacher().click();
    }
    @Then("User should be redirected to Update Teachers page.")
    public void getRedirectedPage() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.geteditTeacherText().getText();
        String expected = "Update Teacher";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @When("Click on delete button of searched record.")
    public void clickDelTeacher(){
        driver.navigate().back();
        TeachersPage.getDeleteBtnTeacher().click();
    }
    @And("Delete dialog box opens.")
    public void verifyDeleteBox() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.getdeletePopUpTeacher().getText();
        String expected = "Are you sure you want to delete teacher";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }
    @And("User clicks Delete.")
    public void clickSubmitDel(){
        TeachersPage.getDeleteTecaher().click();
    }
    @And("User clicks on Upload Teacher button.")
    public void clickUploadTeacher(){
        TeachersPage.getuploadTeacher().click();
    }
    @And("Send CSV file for teachers.")
    public void sendCSVFile(){
        TeachersPage.getuploadTeacherBtn().sendKeys("C:\\Users\\Aasma Jabin\\IdeaProjects\\DarazOps\\src\\main\\java\\Pages\\UploadTeachers.csv");
        TeachersPage.getclickSubmitOnUploadTeacher().click();

    }
    @And("Verify the Success message for upload teachers.")
    public void verifyUploadSuccessMsg() throws InterruptedException {
        Thread.sleep(3000);
        String actual = TeachersPage.getverifyUploadSuccessMsg().getText();
        String expected = "File has uploaded sucessfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
       }


}
