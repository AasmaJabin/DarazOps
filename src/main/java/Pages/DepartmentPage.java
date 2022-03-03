package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Random;

public class DepartmentPage {
    public static CharSequence Dname=DepartmentName();
    private static String Department= "#sidebar > ul > li:nth-child(5) > a";
    private static String ClickAddDepartment= "//*[@id=\"sidebar\"]/ul/li[5]/ul/li[1]/a";
    private static String ClickViewDepartment= "//*[@id=\"sidebar\"]/ul/li[5]/ul/li[2]/a";
    private static String EnterDepartmentName= "name";
    private static String AddDepartmentSubmitbutton= "btnSubmit";
    private static String verifySuccessMSg="body > div.c-wrapper > div.c-body > div";
    private static String VerifyViewDepartment= "/html/body/div[2]/div[2]/main/div[1]/h1";
    private static String searchbox="//*[@id=\"datatable_filter\"]/label/input";
    private static String viewEditButton = ".btn-sm";
    private static String UpdateStudentText="/html/body/div[2]/div[2]/main/div/h1";
    private static String EmployeeIdButton = "name";
    private static String VerifySubmitButton = "btnSubmit"; //locator=id
    private static String SuccessMsg = "/html/body/div[2]/div[2]/div";
    private static String deleteButton = ".btn-delete";
    private static String deleteMsg="//*[@id=\"deleteConfigModal\"]/div/div/div[2]/p";
    private static String deleteText="//*[@id=\"deleteConfigModal\"]/div/div/div[1]";
    private static String ClickDelRecord="btnDelete";
    private static String deleteSuccessText="modalAlertMessage";

    public static WebElement verifyDeleteSuccessText(){
        return driverInitialization.driver.findElement(By.id(deleteSuccessText));
    }
    public static WebElement clickDeleteButtonToConfirm(){
        return driverInitialization.driver.findElement(By.id(ClickDelRecord));
    }
    public static WebElement verifyDeleteMsg(){
        return driverInitialization.driver.findElement(By.xpath(deleteMsg));
    }
    public static WebElement verifyDeleteText(){
        return driverInitialization.driver.findElement(By.xpath(deleteText));
    }
    public static WebElement clickDelButton(){
        return driverInitialization.driver.findElement(By.cssSelector(deleteButton));
    }
    public static WebElement DepartmentUpdateSuccessMsg(){
        return driverInitialization.driver.findElement(By.xpath(SuccessMsg));
    }
    public static WebElement ClickSubmitButton(){
        return driverInitialization.driver.findElement(By.id(VerifySubmitButton));
    }
    public static WebElement getEditDepartmentField(){
        return driverInitialization.driver.findElement(By.id(EmployeeIdButton));
    }
    public static WebElement verifyUPDStuText(){
        return driverInitialization.driver.findElement(By.xpath(UpdateStudentText));
    }
    public static WebElement clickEditButton(){
        return driverInitialization.driver.findElement(By.cssSelector(viewEditButton));
    }

    public static WebElement getDepartment(){
        return driverInitialization.driver.findElement(By.cssSelector(Department));
    }
    public static WebElement ClickAD(){
        return driverInitialization.driver.findElement(By.xpath(ClickAddDepartment));
    }
    public static WebElement EnterDN(){
        return driverInitialization.driver.findElement(By.name(EnterDepartmentName));
    }
    public static WebElement SubmitND(){
        return driverInitialization.driver.findElement(By.id(AddDepartmentSubmitbutton));
    }
    public static WebElement ClickVD(){
        return driverInitialization.driver.findElement(By.xpath(ClickViewDepartment));
    }
    public static WebElement VerifyVD(){
        return driverInitialization.driver.findElement(By.xpath(VerifyViewDepartment));
    }
    public static WebElement getSearchbox(){
        return driverInitialization.driver.findElement(By.xpath(searchbox));
    }
    public static WebElement verifyMSG(){
        return driverInitialization.driver.findElement(By.cssSelector(verifySuccessMSg)) ;
    }
    public static CharSequence DepartmentName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

}
