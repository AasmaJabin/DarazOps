package step_definition;

import Pages.DashboardPage;
import Pages.DepartmentPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Dashboard {
    @Then("Verify Dashboard and student text on dashboard.")
    public void dashboardVerification() throws InterruptedException {
        String actual1 = DashboardPage.getStudentText().getText();
        String expected1 = "Students";
        System.out.println(actual1);
        boolean isAvailable1 = actual1.contains(expected1);
        Assert.assertTrue(isAvailable1);
    }
    @When("User clicks on view more from Courses.")
    public void courseRedirectionVerification(){
        DashboardPage.getViewMoreCoursesButton().click();
    }
    @Then("User should be redirected to View Courses Tab.")
    public void verifyCourseRedirection() throws InterruptedException {
        Thread.sleep(3000);
        String actual = DashboardPage.getsearchCourseText().getText();
        String expected = "Search Courses";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);}

    @When("User clicks on view more from categories.")
    public void categoriesRedirectionVerification(){
        DashboardPage.getDashboardButton().click();
        DashboardPage.getViewMoreCategoriesButton().click();
    }
    @Then("User should be redirected to View Categories.")
    public void verifyCategoriesRedirection() throws InterruptedException {
        Thread.sleep(3000);
        String actual = DashboardPage.getsearchCategoriesText().getText();
        String expected = "Course Categories";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);}

    @When("User clicks on View more from Teachers Tab.")
    public void teachersRedirectionVerification(){
        DashboardPage.getDashboardButton().click();
        DashboardPage.getViewMoreTeacherButton().click();
    }
    @Then("User should be redirected to View Teachers Page.")
    public void verifyTeachersRedirection() throws InterruptedException {
        Thread.sleep(3000);
        String actual = DashboardPage.getsearchTeacherText().getText();
        String expected = "Search Teacher";
        System.out.println(actual);
        boolean isAvailable = actual.contains(expected);
        Assert.assertTrue(isAvailable);}

}
