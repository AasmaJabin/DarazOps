package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class TeachersPage {
    public static String teacherBtn="//*[@id=\"sidebar\"]/ul/li[7]/a";
    public static WebElement getTeacherBtn(){
        return driverInitialization.driver.findElement(By.xpath(teacherBtn));
    }

    public static String addTeacherBtn="//*[@id=\"sidebar\"]/ul/li[7]/ul/li[1]/a";
    public static WebElement getAddTeacherBtn(){
        return driverInitialization.driver.findElement(By.xpath(addTeacherBtn));
    }

    public static String viewTeacherBtn="//*[@id=\"sidebar\"]/ul/li[7]/ul/li[2]/a";
    public static WebElement getViewTeacherBtn(){
        return driverInitialization.driver.findElement(By.xpath(viewTeacherBtn));
    }

    public static String fname="//*[@id=\"firstName\"]";
    public static WebElement getfname(){
        return driverInitialization.driver.findElement(By.xpath(fname));
    }

    public static String lname="//*[@id=\"lastName\"]";
    public static WebElement getlname(){
        return driverInitialization.driver.findElement(By.xpath(lname));
    }
    public static String empID="//*[@id=\"employeeId\"]";
    public static WebElement getempID(){
        return driverInitialization.driver.findElement(By.xpath(empID));
    }

    public static String addTeacherText="/html/body/div[2]/div[2]/main/div[1]/h1";
    public static WebElement getAddTeacherText(){
        return driverInitialization.driver.findElement(By.xpath(addTeacherText));
    }
    public static String username="//*[@id=\"name\"]";
    public static WebElement getusername(){
        return driverInitialization.driver.findElement(By.xpath(username));
    }
    public static String email="//*[@id=\"email\"]";
    public static WebElement getEmail(){
        return driverInitialization.driver.findElement(By.xpath(email));
    }
    public static String venture="country";
    public static WebElement getVenture(){
        return driverInitialization.driver.findElement(By.name(venture));
    }
    public static String ventureBtn="//*[@id=\"form\"]/div[1]/div/div[6]/select";
    public static WebElement getVentureBtn(){
        return driverInitialization.driver.findElement(By.xpath(ventureBtn));
    }
    public static String editSuccessMsg="/html/body/div[2]/div[2]/div";
    public static WebElement getEditSuccessMsg(){
        return driverInitialization.driver.findElement(By.xpath(editSuccessMsg));
    }
    public static String role="role";
    public static WebElement getRole(){
        return driverInitialization.driver.findElement(By.name(role));
    }
    public static String submitbtn="//*[@id=\"btnSubmit\"]";
    public static WebElement getSubmitbtn(){
        return driverInitialization.driver.findElement(By.xpath(submitbtn));
    }
            static Random rand = new Random(); //instance of random class
            static int upperbound = 5;
            //generate random values from 0-5
            public static int random = rand.nextInt(upperbound);


    public static String successMsg="/html/body/div[2]/div[2]/div";
    public static WebElement getSuccessMsg(){
        return driverInitialization.driver.findElement(By.xpath(successMsg));
    }
    public static String editTeacherText="/html/body/div[2]/div[2]/main/div[1]/h1";
    public static WebElement geteditTeacherText(){
        return driverInitialization.driver.findElement(By.xpath(editTeacherText));
    }
    public static CharSequence EmpID=   StudentsPage.randomStringGenerator();
    public static CharSequence userName=StudentsPage.randomStringGenerator();
    public static CharSequence firstName=StudentsPage.randomStringGenerator();
    public static CharSequence lastName=StudentsPage.randomStringGenerator();
    public static CharSequence emailAddress=StudentsPage.randomStringGenerator();
    public static String searchBtn="/html/body/div[2]/div[2]/main/div[1]/div[1]/div/div/form/div/div/div[4]/div/button";
    public static WebElement getSearchBtn(){
        return driverInitialization.driver.findElement(By.xpath(searchBtn));
    }
    public static String editBtnTeacher=".btn-sm";
    public static WebElement getEditBtnTeacher(){
        return driverInitialization.driver.findElement(By.cssSelector(editBtnTeacher));
    }
    public static String deleteBtnTeacher=".modal-delete-teacher";
    public static WebElement getDeleteBtnTeacher(){
        return driverInitialization.driver.findElement(By.cssSelector(deleteBtnTeacher));
    }
    public static String deleteTecaher="//*[@id=\"btnSubmitDeleteTeacher\"]";
    public static WebElement getDeleteTecaher(){
        return driverInitialization.driver.findElement(By.xpath(deleteTecaher));
    }
    public static String deletePopUpTeacher="//*[@id=\"deleteTeacher\"]/div/div/div[2]/form/p";
    public static WebElement getdeletePopUpTeacher(){
        return driverInitialization.driver.findElement(By.xpath(deletePopUpTeacher));
    }
    public static String uploadTeacher="//*[@id=\"sidebar\"]/ul/li[7]/ul/li[3]/a";
    public static WebElement getuploadTeacher(){
        return driverInitialization.driver.findElement(By.xpath(uploadTeacher));
    }
    public static String uploadTeacherBtn="//*[@id=\"file\"]";
    public static WebElement getuploadTeacherBtn(){
        return driverInitialization.driver.findElement(By.xpath(uploadTeacherBtn));
    }
    public static String clickSubmitOnUploadTeacher="//*[@id=\"btnSubmit\"]";
    public static WebElement getclickSubmitOnUploadTeacher(){
        return driverInitialization.driver.findElement(By.xpath(clickSubmitOnUploadTeacher));
    }
    public static String verifyUploadSuccessMsg="//*[@id=\"form\"]/div[3]";
    public static WebElement getverifyUploadSuccessMsg(){
        return driverInitialization.driver.findElement(By.xpath(verifyUploadSuccessMsg));
    }
}
