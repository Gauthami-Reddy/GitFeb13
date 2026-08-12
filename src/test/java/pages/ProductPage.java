package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By productName = By.xpath("(//h1[contains(@class,'product_title')])[2]");

    By addToCart = By.name("add-to-cart");

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Verify Product Name

    public boolean verifyProductName() {

        WebElement name = wait.until(
                ExpectedConditions.visibilityOfElementLocated(productName));

        System.out.println("Product Name : " + name.getText());

        return name.isDisplayed();
    }

    // Select Size

    public void selectSize(String size) {

        WebElement sizeElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@data-select='" + size.toLowerCase() + "']")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the size
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", sizeElement);

        // Wait for scrolling
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click using JavaScript
        js.executeScript("arguments[0].click();", sizeElement);

        System.out.println("Selected Size : " + size);
    }

    // Click Add To Cart
  //button[contains(text(),'Add to cart')]
   

    public void clickAddToCart() {
    	 By addToCart = By.cssSelector("button.single_add_to_cart_button");
        WebElement cart = wait.until(
                ExpectedConditions.visibilityOfElementLocated(addToCart));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView({block:'center'});", cart);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", cart);

        System.out.println("Add To Cart Clicked");
    }

}