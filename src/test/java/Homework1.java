import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework1 {

@Test
    public void orderTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

    WebElement usernameField = driver.findElement(By.id("user-name"));
    WebElement passwordField = driver.findElement(By.id("password"));

    usernameField.sendKeys("standard_user");
    passwordField.sendKeys("secret_sauce");

    WebElement elementToClick = driver.findElement(By.id("login-button"));
    elementToClick.click();

    WebElement itemToSelect = driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Bike Light')]"));
    itemToSelect.click();

    WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    addToCart.click();

    WebElement goToCart = driver.findElement(By.className("shopping_cart_badge"));
    goToCart.click();

    WebElement checkout = driver.findElement(By.id("checkout"));
    checkout.click();

    WebElement firstName = driver.findElement(By.id("first-name"));
    firstName.sendKeys("Anton");

    WebElement lastName = driver.findElement(By.id("last-name"));
    lastName.sendKeys("Yanchev");

    WebElement postalCode = driver.findElement(By.id("postal-code"));
    postalCode.sendKeys("9010");

    WebElement continueToFinish = driver.findElement(By.id("continue"));
    continueToFinish.click();

    WebElement finishOrder = driver.findElement(By.id("finish"));
    finishOrder.click();

    driver.close();
    }
}
