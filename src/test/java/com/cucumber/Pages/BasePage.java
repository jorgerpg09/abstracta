package com.cucumber.Pages;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseUtil {

    WebElement searchBar = BaseUtil.webDriver.findElement(By.className("nav-search-input"));
    WebElement searchBut = BaseUtil.webDriver.findElement(By.className("nav-icon-search"));

    public void setMlSearch(String val){
        searchBar.click();
        searchBar.sendKeys(val);
        searchBut.click();
    }

}
