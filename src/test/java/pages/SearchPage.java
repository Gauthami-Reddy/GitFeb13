package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By searchBox = By.id("elementor-search-form-dd78eab");
    By searchButton = By.xpath("//button[@type='submit']");
    By productLinks = By.cssSelector("a.woocommerce-LoopProduct-link");

    public void launchWebsite() {
        driver.get("https://footballmonk.in/");
    }

    public void searchProduct(String product) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }

    public void openFirstProduct() {

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productLinks));

        List<WebElement> links = driver.findElements(productLinks);

        System.out.println("Total Links : " + links.size());

        for (WebElement link : links) {

            if (link.isDisplayed()) {

                String href = link.getAttribute("href");
                System.out.println("Opening : " + href);

                driver.get(href);
                break;
            }
        }
    
    }
}