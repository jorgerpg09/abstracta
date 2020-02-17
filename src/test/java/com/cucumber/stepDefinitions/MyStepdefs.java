package com.cucumber.stepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.en.*;

import java.io.FileNotFoundException;

public class MyStepdefs extends BaseUtil {

    private BaseUtil base;

    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I open {string}")
    public void openUrl(String url) {
        System.out.println(url);
        base.openUrl(url);
        assert base.getTitle().equals("Mercado Libre Uruguay");
    }

    @And("I search {string}")
    public void doSearch(String value) {
        getBasePage().setMlSearch(value);
    }

    @Then("I see results")
    public void validateResults() {
        assert getResultsPage().checkResults().toLowerCase().equals("autos");
    }

    @And("I save results")
    public void saveResults() throws FileNotFoundException {
        getResultsPage().saveResults();
    }
}
