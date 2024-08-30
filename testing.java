package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to the chromedriver executable
  
    	
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://in.puma.com/in/en");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click on "My Account" button
            WebElement accountButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("account-button")));
            accountButton.click();
            Thread.sleep(2000); // Delay after clicking

            // Click on "Login" link
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-test-id='login-button']")));
            loginLink.click();
            Thread.sleep(1000); // Delay after clicking

            // Click on "Login with Email and Password" button
            WebElement loginWithEmailButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login with Email and Password']")));
            loginWithEmailButton.click();
            Thread.sleep(1000); // Delay after clicking

            // Enter the email
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            emailField.sendKeys("hfuryte@gmail.com");

            // Enter the password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            passwordField.sendKeys("Hellothere@1");

            // Click the login submit button
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
            loginButton.click();
            Thread.sleep(3000); // Delay after clicking

            // Click the "Men" section using XPath
            WebElement menSection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nav-bar-sticky']/nav/div/ul/li[3]/div/div[1]/a/span")));
            
            // Scroll the element into view using JavaScript and then click
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menSection);
            Thread.sleep(1000); // Short delay before clicking
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menSection);
            Thread.sleep(3000); // Delay after clicking

            // Scroll down a little bit after opening the Men section
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 200);"); // Adjust scroll distance

            // Wait for the first product to be visible and clickable
            WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='product-list-items']/li[1]/a/div/div[3]/h3")));
            firstProduct.click();
            Thread.sleep(3000); // Delay after clicking

            WebElement sizePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='size-picker']/label/span")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sizePicker);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sizePicker);
            Thread.sleep(1000); // Delay after clicking

            // Wait for the "Add to Cart" button to be clickable
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='puma-skip-here']/div/section/div[1]/section[2]/div/div[7]/div[2]/button[1]")));
            
            // Scroll into view and click using JavaScript to handle overlay issues
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
            Thread.sleep(1000); // Short delay before clicking
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButton);
            Thread.sleep(2000); // Delay after clicking

            // Wait for the cart to update
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Click the "Women" section using XPath
            WebElement womenSection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nav-bar-sticky']/nav/div/ul/li[2]/div/div[1]/a/span")));
            
            // Scroll the element into view using JavaScript and then click
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenSection);
            Thread.sleep(1000); // Short delay before clicking
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", womenSection);
            Thread.sleep(3000); // Delay after clicking

            // Scroll down a little bit after opening the Women section
            js.executeScript("window.scrollBy(0, 200);"); // Adjust scroll distance

            // Wait for the first product to be visible and clickable
            WebElement firstProductWomen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='product-list-items']/li[1]/a/div/div[3]/h3")));
            firstProductWomen.click();
            Thread.sleep(3000); // Delay after clicking

            // Wait for the size picker to be clickable and select a size
            WebElement sizePickerWomen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='size-picker']/label/span")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sizePickerWomen);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sizePickerWomen);
            Thread.sleep(1000); // Delay after clicking

            // Wait for the "Add to Cart" button to be clickable
            WebElement addToCartButtonWomen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='puma-skip-here']/div/section/div[1]/section[2]/div/div[7]/div[2]/button[1]")));
            
            // Scroll into view and click using JavaScript to handle overlay issues
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButtonWomen);
            Thread.sleep(1000); // Short delay before clicking
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToCartButtonWomen);
            Thread.sleep(2000); // Delay after clicking

            // Navigate to the cart page
            driver.get("https://in.puma.com/in/en/cart");
            Thread.sleep(2000); // Delay to ensure the cart page loads

            // Wait for and click the price breakdown link
            WebElement priceBreakdownLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='price-breakdown-container']/div[3]/a")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priceBreakdownLink);
            Thread.sleep(1000); // Delay before clicking
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", priceBreakdownLink);
            Thread.sleep(3000); // Delay after clicking

            // Scroll down a little bit
            js.executeScript("window.scrollBy(0, 1000);"); // Adjust scroll distance

            WebElement checkoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='puma-skip-here']/div/section/div[2]/div/form/div/div/button")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutButton);
            Thread.sleep(1000); // Short delay before clicking
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkoutButton);
            Thread.sleep(3000); // Delay after clicking
            js.executeScript("window.scrollBy(0, 500);"); 

        } finally {
            // Close the browser after all interactions are done
            //driver.quit();
        }
    }
}
