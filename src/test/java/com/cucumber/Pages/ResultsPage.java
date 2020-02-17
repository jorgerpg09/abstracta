package com.cucumber.Pages;



import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ResultsPage extends BaseUtil {

    WebElement pageTitle = BaseUtil.webDriver.findElement(By.className("breadcrumb__title"));
    List<WebElement> resultList = BaseUtil.webDriver.findElements(By.className("rowItem"));
    List<WebElement> resultLinks = BaseUtil.webDriver.findElements(By.cssSelector("a.item__info-link.item__js-link"));
    List<WebElement> resultTitle = BaseUtil.webDriver.findElements(By.className("main-title"));

    public String checkResults(){
        return pageTitle.getText();
    }

    public void saveResults() throws FileNotFoundException {
        String[] results = new String[50];
        PrintWriter pr = new PrintWriter("searchResults");
        for (int i = 0; i < resultList.size(); i++){
            results[i] = resultTitle.get(i).getText() + " " + resultLinks.get(i).getAttribute("href") ;
            pr.println(results[i]);
        }
    }
}
