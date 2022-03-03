package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class StudentsPage {
    //AddStudentPage
    private static String successMsg= "//*[@id=\"form\"]/div[3]";
    private static String SubonUpload= "//*[@id=\"btnSubmit\"]";
    private static String StudentButton= "//*[@id=\"sidebar\"]/ul/li[6]/a";
    private static String chooseFileBtn= "//*[@id=\"file\"]";
    private static String AddStudentButton="//*[@id=\"sidebar\"]/ul/li[6]/ul/li[1]/a";
    private static String ViewStudentButton="//*[@id=\"sidebar\"]/ul/li[6]/ul/li[2]/a";
    private static String UploadStudentsButton="//*[@id=\"sidebar\"]/ul/li[6]/ul/li[3]/a";
    private static String VerifyAddStudentText="/html/body/div[2]/div[2]/main/div[1]/h1"; //locator= xpath
    private static String verifyAddSuccessMsg= "/html/body/div[2]/div[2]/div";
    private static String verifyUpdateSuccessMsg= "/html/body/div[2]/div[2]/div";
    private static String VerifySubmitButton = "//*[@id=\"btnSubmit\"]"; //locator=id
    private static String deleteButton = ".modal-delete-student";
    private static String viewEditButton = ".btn-sm";
    private static String verifyDeleteButton = "//*[@id=\"deleteStudent\"]/div/div/div[2]/form/p";
    private static String ClickDelRecord = "//*[@id=\"btnSubmitDeleteStudent\"]";
    private static String deleteSuccessText = "#modalAlertMessage";
    private static String WFMidButton= "wfmId"; //locator=id
    private static String EmployeeIdButton = "employeeId"; //locator=id
    private static String searchEMPID="//*[@id=\"employeeId\"]";
    private static String searchWFID="//*[@id=\"wfmId\"]";
    private static String searchUN="//*[@id=\"name\"]";
    private static String searchVenture="/html/body/div[2]/div[2]/main/div[1]/div[2]/div/div/form/div/div/div[4]/select";
    private static String searchDepartment="/html/body/div[2]/div[2]/main/div[1]/div[2]/div/div/form/div/div/div[5]/select";
    private static String FirstNameButton="firstName"; //locator=name
    private static String LastNameButton="lastName"; //locator=name
    private static String userNameButton="name";  //locator=name
    private static String passwordButton="password"; //locator= name
    private static String VentureButton="country"; //locator=name
    private static String DepartmentButton="department"; //locator=name
    private static String UpdateStudentText="/html/body/div[2]/div[2]/main/div[1]/h1";
    private static String ExcelUploadFileSuccessMsg="//*[@id=\"form\"]/div[3]";
    private static String SearchButton="/html/body/div[2]/div[2]/main/div[1]/div[2]/div/div/form/div/div/div[6]/div/button";
    public static String PasswordErrorMessgae="//*[@id=\"form\"]/div[1]/div/div[6]/span";
    public static String setPassword="setPassword";
    public static String newPassword="password";
    public static String confirmPassword="confirmPassword";
    public static String resetPasswordText="//*[@id=\"resetPasswordModal\"]/div/div/div[1]/h5";
    public static String lengthErrorOnConfromPassword="//*[@id=\"error\"]";
    public static String updatePassword="//*[@id=\"updatePassword\"]";
    public static CharSequence EmpID=randomStringGenerator();
    public static CharSequence WFMid=randomStringGenerator();
    public static CharSequence firstName=randomStringGenerator();
    public static CharSequence lastName=randomStringGenerator();
    public static CharSequence userName=randomStringGenerator();
    public static CharSequence Password=randomStringGenerator();

    public static WebElement getSuccessMsg1(){
        return driverInitialization.driver.findElement(By.xpath(successMsg));
    }
    public static WebElement getPasswordErrorMessage(){
        return driverInitialization.driver.findElement(By.xpath(PasswordErrorMessgae));
    }
    public static WebElement getlengthmsg(){
        return driverInitialization.driver.findElement(By.xpath(lengthErrorOnConfromPassword));
    }
    public static WebElement getUpdatePassword(){
        return driverInitialization.driver.findElement(By.xpath(updatePassword));
    }
    public static WebElement verifyResetPsswordT(){
        return driverInitialization.driver.findElement(By.xpath(resetPasswordText));
    }
    public static WebElement clickSetPasswordButton(){
        return driverInitialization.driver.findElement(By.id(setPassword));
    }
    public static WebElement enterNewPassword(){
        return driverInitialization.driver.findElement(By.id(newPassword));
    }
    public static WebElement confirmNewPassword(){
        return driverInitialization.driver.findElement(By.id(confirmPassword));
    }

    public static WebElement getSumbitOnUpload(){
        return driverInitialization.driver.findElement(By.xpath(SubonUpload));
    }
    public static WebElement clickStudentButton(){
        return driverInitialization.driver.findElement(By.xpath(StudentButton));
    }

    public static WebElement getUploadButton(){
        return driverInitialization.driver.findElement(By.xpath(UploadStudentsButton));
    }
    public static WebElement getChooseFileBtn(){
        return driverInitialization.driver.findElement(By.xpath(chooseFileBtn));
    }
    public static WebElement verifyDeleteSuccessText(){
        return driverInitialization.driver.findElement(By.cssSelector(deleteSuccessText));
    }
    public static WebElement clickDeleteButtonToConfirm(){
        return driverInitialization.driver.findElement(By.xpath(ClickDelRecord));
    }
    public static WebElement verifyDelButtonTxt(){
        return driverInitialization.driver.findElement(By.xpath(verifyDeleteButton));
    }
    public static WebElement clickEditButton(){
        return driverInitialization.driver.findElement(By.cssSelector(viewEditButton));
    }
    public static WebElement clickDelButton(){
        return driverInitialization.driver.findElement(By.cssSelector(deleteButton));
    }
    public static WebElement verifyUPDStuText(){
        return driverInitialization.driver.findElement(By.xpath(UpdateStudentText));
    }
    public static WebElement getAddStuSuccessMsg(){
        return driverInitialization.driver.findElement(By.xpath(verifyAddSuccessMsg));
    }
    public static WebElement getUpdateStuSuccessMsg(){
        return driverInitialization.driver.findElement(By.xpath(verifyUpdateSuccessMsg));
    }
    public static WebElement clickAddStudentButton(){
        return driverInitialization.driver.findElement(By.xpath(AddStudentButton));
    }
    public static WebElement VerifyAddStudentText(){
        return driverInitialization.driver.findElement(By.xpath(VerifyAddStudentText));
    }
    public static WebElement getEmpId(){
        return driverInitialization.driver.findElement(By.id(EmployeeIdButton));
    }
    public static WebElement getWFMId(){
        return driverInitialization.driver.findElement(By.id(WFMidButton));
    }
    public static WebElement getFN(){
        return driverInitialization.driver.findElement(By.name(FirstNameButton));
    }
    public static WebElement getLN(){
        return driverInitialization.driver.findElement(By.name(LastNameButton));
    }
    public static WebElement getUN(){
        return driverInitialization.driver.findElement(By.name(userNameButton));
    }
    public static WebElement getPassword(){
        return driverInitialization.driver.findElement(By.name(passwordButton));
    }
    public static WebElement getVenture(){
        return driverInitialization.driver.findElement(By.name(VentureButton));
    }
    public static WebElement getDepartment(){
        return driverInitialization.driver.findElement(By.name(DepartmentButton));
    }
    public static WebElement ClickSubmitButton(){
        return driverInitialization.driver.findElement(By.xpath(VerifySubmitButton));
    }

    public static CharSequence randomStringGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }



    //UpdateStudent



    //ViewStudentPage
    public static WebElement getViewStuButton(){
        return driverInitialization.driver.findElement(By.xpath(ViewStudentButton));
    }
    public static WebElement getSearchButton(){
        return driverInitialization.driver.findElement(By.xpath(SearchButton));
    }
    public static WebElement getSearchEMPID(){
        return driverInitialization.driver.findElement(By.xpath(searchEMPID));
    }
    public static WebElement getSearchWFMID(){
        return driverInitialization.driver.findElement(By.xpath(searchWFID));
    }
    public static WebElement getSearchUN(){
        return driverInitialization.driver.findElement(By.xpath(searchUN));
    }
    public static WebElement getSearchVenture(){
        return driverInitialization.driver.findElement(By.xpath(searchVenture));
    }
    public static WebElement getSearchDepartment(){
        return driverInitialization.driver.findElement(By.xpath(searchDepartment));
    }



}
