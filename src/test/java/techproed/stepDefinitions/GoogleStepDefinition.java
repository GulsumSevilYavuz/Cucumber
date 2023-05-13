package techproed.stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage googlePage;
    @When("kullanici googleda {string} aratir")
    public void kullaniciGoogledaAratir(String string) {
      googlePage=new GooglePage();
        if (googlePage.cookies.isDisplayed()) {
            googlePage.cookies.click();
        }
        ReusableMethods.bekle(3);
        googlePage.aramaKutusu.sendKeys(string, Keys.ENTER);
    }


    @When("basligin {string} icerdigini dogrular")
    public void basliginIcerdiginiDogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @When("kullanici googleda {string} aratacaktir")
    public void kullaniciGoogledaAratacaktir(String string) {
        googlePage=new GooglePage();
        if (googlePage.cookies.isDisplayed()) {
            googlePage.cookies.click();
        }
        ReusableMethods.bekle(3);
            googlePage=new GooglePage();
            googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(string), Keys.ENTER);
    }

    @When("basligin {string} icerdigini dogrulayacaktir")
    public void basliginIcerdiginiDogrulayacaktir(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(string)));


    }
}
