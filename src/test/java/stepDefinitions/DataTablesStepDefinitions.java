package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();


    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extn) {
        dataTablesPage.extn.sendKeys(extn);
    }

    @And("startDate bolumune {string} yazar")
    public void startdateBolumuneYazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }

    Actions actions = new Actions(Driver.getDriver());
    @And("tab yapar")
    public void tabYapar() {
        actions.sendKeys(Keys.TAB);

    }
}
