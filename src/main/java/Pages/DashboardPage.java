package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    public static String DashboardButton="//*[@id=\"sidebar\"]/ul/li[1]/a";
    public static String DashboardText="/html/body/div[2]/div[2]/main/div/h1";
    public static String StudentText="//*[@id=\"CountApp\"]/div/div[4]/div/div[1]/h3";
    public static String viewMoreCourses="//*[@id=\"CountApp\"]/div/div[1]/div/div[3]/a";
    public static String viewMoreCategories="//*[@id=\"CountApp\"]/div/div[2]/div/div[3]/a";
    public static String viewMoreTeacher="//*[@id=\"CountApp\"]/div/div[3]/div/div[3]/a";
    public static String searchCourseText="/html/body/div[2]/div[2]/main/div[1]/div[1]/div/h1";
    public static String searchCategoriesText="/html/body/div[2]/div[2]/main/div[1]/h1";
    public static String searchTeacherText="/html/body/div[2]/div[2]/main/div[1]/h1";

    public static WebElement getsearchTeacherText(){
        return driverInitialization.driver.findElement(By.xpath(searchTeacherText));}
    public static WebElement getsearchCategoriesText(){
        return driverInitialization.driver.findElement(By.xpath(searchCategoriesText));}
    public static WebElement getsearchCourseText(){
        return driverInitialization.driver.findElement(By.xpath(searchCourseText));
    }
    public static WebElement getDashboardButton(){
        return driverInitialization.driver.findElement(By.xpath(DashboardButton));
    }
    public static WebElement getDashboardText(){
        return driverInitialization.driver.findElement(By.xpath(DashboardText));
    }
    public static WebElement getStudentText(){
        return driverInitialization.driver.findElement(By.xpath(StudentText));
    }
    public static WebElement getViewMoreCoursesButton(){
        return driverInitialization.driver.findElement(By.xpath(viewMoreCourses));
    }
    public static WebElement getViewMoreCategoriesButton(){
        return driverInitialization.driver.findElement(By.xpath(viewMoreCategories));
    }
    public static WebElement getViewMoreTeacherButton(){
        return driverInitialization.driver.findElement(By.xpath(viewMoreTeacher));
    }
}
