package Base;

import com.cucumber.Pages.BasePage;
import com.cucumber.Pages.ResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {

    // Initialize webdriver
    public static WebDriver webDriver = new ChromeDriver();

    // Basic webdriver operations
    public void openUrl(String url){
        webDriver.get(url);
    }
    public String getTitle() {return webDriver.getTitle();}

    // Init pages
    private BasePage basePage = null;
    private ResultsPage resultsPage = null;

    public BasePage getBasePage(){
        if(basePage == null){
            basePage = new BasePage();
        }
        return basePage;
    }

    public ResultsPage getResultsPage(){
        if(resultsPage == null){
            resultsPage = new ResultsPage();
        }
        return resultsPage;
    }
}
