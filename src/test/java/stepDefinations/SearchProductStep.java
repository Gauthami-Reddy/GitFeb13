package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import pages.ProductPage;
import pages.SearchPage;

public class SearchProductStep {

    WebDriver driver;

    SearchPage searchPage;
    ProductPage productPage;

    @Before
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        searchPage = new SearchPage(driver);

        productPage = new ProductPage(driver);
    }

    @Given("User launches FootballMonk website")
    public void user_launches_football_monk_website() {

        driver.get("https://footballmonk.in/");
    }

    @When("User searches for {string}")
    public void user_searches_for(String product) {

        searchPage.searchProduct(product);
    }

    @And("User opens the first product")
    public void user_opens_the_first_product() {

        searchPage.openFirstProduct();
    }

    @Then("Product name should be displayed")
    public void product_name_should_be_displayed() {

        Assert.assertTrue(productPage.verifyProductName());
    }

    @And("User should select size {string}")
    public void user_should_select_size(String size) {
        productPage.selectSize(size);
    }

    @And("Add To Cart button should be clicked")
    public void add_to_cart_button_should_be_clicked() {
        productPage.clickAddToCart();
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}