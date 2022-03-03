package step_definition;

import Pages.RolesPage;
import Pages.StudentCSVGenerator;
import Pages.StudentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class s4_uploadStudents {
    @And("User clicks on Upload Student button.")
    public void clickUploadBtn(){
        System.out.println(StudentsPage.getUploadButton().getText());
        StudentsPage.getUploadButton().click();
}
    @And("Send CSV file.")
    public void uploadCSV(){
        //StudentCSVGenerator.main();
        StudentsPage.getChooseFileBtn().sendKeys("C:\\Users\\Aasma Jabin\\IdeaProjects\\DarazOps\\src\\main\\java\\Pages\\UploadStudent.csv");
        StudentsPage.getSumbitOnUpload().click();
    }
    @Then("Verify the Success message.")
    public void Submit() throws InterruptedException {
        Thread.sleep(3000);
        String actual = StudentsPage.getSuccessMsg1().getText();
        String expected = "File has uploaded successfully";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);
    }


}
