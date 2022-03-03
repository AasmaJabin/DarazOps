package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RolesPage {
    public static String roleButton="//*[@id=\"sidebar\"]/ul/li[2]/a";
    public static CharSequence name=StudentsPage. randomStringGenerator();;

    public static WebElement getroleButton(){
        return driverInitialization.driver.findElement(By.xpath(roleButton));
    }
    public static String addRoleButton="//*[@id=\"sidebar\"]/ul/li[2]/ul/li[1]/a";
    public static WebElement getaddRoleButton(){
        return driverInitialization.driver.findElement(By.xpath(addRoleButton));
    }
    public static String viewRoleButton="//*[@id=\"sidebar\"]/ul/li[2]/ul/li[2]/a";
    public static WebElement getviewRoleButton(){
        return driverInitialization.driver.findElement(By.xpath(viewRoleButton));
    }
    public static String createRoleText="//*[@id=\"form\"]/div[1]/div/div/label";
    public static WebElement getcreateRoleText(){
        return driverInitialization.driver.findElement(By.xpath(createRoleText));
    }
    public static String newRoleNameField="//*[@id=\"role_name\"]";
    public static WebElement getnewRoleNameField(){
        return driverInitialization.driver.findElement(By.xpath(newRoleNameField));
    }
    public static String tickViewRoleBox="//*[@id=\"per5\"]";
    public static WebElement gettickViewRoleBox(){
        return driverInitialization.driver.findElement(By.xpath(tickViewRoleBox));
    }
    public static String movePageTwo="//*[@id=\"tblBookingDetails_paginate\"]/span/a[2]";
    public static WebElement getmovePageTwo(){
        return driverInitialization.driver.findElement(By.xpath(movePageTwo));
    }

    public static String tickCross="/html/body/div[3]/div[3]/div[2]/a[1]";
    public static WebElement getCrossBtn(){
        return driverInitialization.driver.findElement(By.xpath(tickCross));
    }

    public static String tickViewTeacherBox="//*[@id=\"per13\"]";
    public static WebElement gettickViewTeacherBox(){
        return driverInitialization.driver.findElement(By.xpath(tickViewTeacherBox));
    }
    public static String moveNextPage="//*[@id=\"tblBookingDetails_next\"]";
    public static WebElement getmoveNextPage(){
        return driverInitialization.driver.findElement(By.xpath(moveNextPage));
    }
    public static String tickViewCourseBox="//*[@id=\"tblBookingDetails\"]/tbody/tr[1]/td[3]";
    public static WebElement tickViewCourseBox(){
        return driverInitialization.driver.findElement(By.xpath(tickViewCourseBox));
    }
    public static String createRoleButton="//*[@id=\"form\"]/div[3]/div/div/button";
    public static WebElement getcreateRoleButton(){
        return driverInitialization.driver.findElement(By.xpath(createRoleButton));
    }
    public static String createButton="/html/body/div[2]/div[2]/main/div/div[1]/div[2]/a";
    public static WebElement getcreateButton(){
        return driverInitialization.driver.findElement(By.xpath(createButton));
    }
    public static String searchBox="//*[@id=\"name\"]";
    public static WebElement getSearchBox(){
        return driverInitialization.driver.findElement(By.xpath(searchBox));
    }
    public static String searchBtn="/html/body/div[2]/div[2]/main/div/div[2]/div/div/form/div/div/div[2]/button";
    public static WebElement getSearchBtn(){
        return driverInitialization.driver.findElement(By.xpath(searchBtn));
    }
    public static String searchResult="//*[@id=\"tblUsers\"]/tbody/tr/td[1]";
    public static WebElement getSearchResults(){
        return driverInitialization.driver.findElement(By.xpath(searchResult));
    }


}
