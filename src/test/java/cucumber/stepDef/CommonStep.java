package cucumber.stepDef;

import cucumber.pages.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static cucumber.config.env.driver;

public class CommonStep {

    public int integer = 10;
//    public Duration duration = Duration.ofSeconds(integer);
    WebDriverWait wait = new WebDriverWait(driver, integer); //create object
    Pages element = new Pages();
    private String locator;

    @Given("user at Swag Labs Login screen")
    public void user_is_on_orange_hrm_homepage() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(element.getButton_login())
        );
    }

    @When("user type (.*) in Username field$")
    public void user_input_username(String username) {
        WebElement field_userName = driver.findElement(element.getField_username());
        field_userName.isDisplayed();
        field_userName.sendKeys(username);
    }

    @When("user type (.*) in Password field$")
    public void user_input_password(String password) {
        WebElement field_userName = driver.findElement(element.getField_password());
        field_userName.isDisplayed();
        field_userName.sendKeys(password);
    }

    @When("user click Login button")
    public void click_button_login() {
        WebElement el = driver.findElement(element.getButton_login());
        el.isDisplayed();
        el.click();
    }

    @When("user click Add to cart on product Sauce Labs Backpack")
    public void click_button_login_saucelab_backpack() {
        WebElement el = driver.findElement(element.getButton_addProduct1());
        el.isDisplayed();
        el.click();
    }

    @When("user click Add to cart on product Sauce Labs Bike Light")
    public void click_button_login_saucelab_bike() {
        WebElement el = driver.findElement(element.getButton_addProduct2());
        el.isDisplayed();
        el.click();
    }

    @When("user click Add to cart on product Sauce Labs Bolt T-Shirt")
    public void click_button_login_saucelab_tshirt() {
        WebElement el = driver.findElement(element.getButton_addProduct3());
        el.isDisplayed();
        el.click();
    }

    @When("user click Add to cart on product Sauce Labs Fleece Jacket")
    public void click_button_login_saucelab_flece() {
        WebElement el = driver.findElement(element.getButton_addProduct4());
        el.isDisplayed();
        el.click();
    }

    @When("user click Add to cart on product Sauce Labs Onesie")
    public void click_button_login_saucelab_onesie() {
        WebElement el = driver.findElement(element.getButton_addProduct5());
        el.isDisplayed();
        el.click();
    }

    @When("user click Add to cart on product Test.allTheThings T-Shirt Red")
    public void click_button_login_saucelab_allthethings() {
        WebElement el = driver.findElement(element.getButton_addProduct6());
        el.isDisplayed();
        el.click();
    }

    @When("user click Cart button")
    public void click_button_cart() {
        WebElement el = driver.findElement(element.getButton_cart());
        el.isDisplayed();
        el.click();
    }

    @When("user click Checkout button")
    public void click_button_checkout() {
        WebElement el = driver.findElement(element.getButton_checkout());
        el.isDisplayed();
        el.click();
    }

    @When("user click Finish button")
    public void click_button_finish() {
        WebElement el = driver.findElement(element.getButton_finish());
        el.isDisplayed();
        el.click();
    }

    @When("user click Continue button")
    public void click_button_continue() {
        WebElement el = driver.findElement(element.getButton_continue());
        el.isDisplayed();
        el.click();
    }

    @When("user type (.*) in First Name field$")
    public void user_input_firstname(String firstname) {
        WebElement field_userName = driver.findElement(element.getField_firstname());
        field_userName.isDisplayed();
        field_userName.sendKeys(firstname);
    }

    @When("user type (.*) in Last Name field$")
    public void user_input_lastname(String lastname) {
        WebElement field_userName = driver.findElement(element.getField_lastname());
        field_userName.isDisplayed();
        field_userName.sendKeys(lastname);
    }

    @When("user type (.*) in Postal Code field$")
    public void user_input_postCode(String postcode) {
        WebElement field_userName = driver.findElement(element.getField_postCode());
        field_userName.isDisplayed();
        field_userName.sendKeys(postcode);
    }

    @Then("user navigated to Product page")
    public void user_see_label_product() {
        ExpectedConditions.visibilityOfElementLocated(element.getLabel_homepage());
    }

    @Then("user see error message Epic sadface")
    public void user_see_label_epic_face() {
        ExpectedConditions.visibilityOfElementLocated(element.getLabel_homepage());
    }

    @Then("user navigated to Checkout: Complete!")
    public void user_see_label_complete() {
        ExpectedConditions.visibilityOfElementLocated(element.getLabel_checkoutCompleted());
    }

    @Then("user see error message Error: First Name is required displayed")
    public void user_see_label_error_firstname_required() {
        ExpectedConditions.visibilityOfElementLocated(element.getError_information());
    }

    @Then("user see Error message Please add at least 1 product")
    public void user_see_label_error_add_product() {
        ExpectedConditions.visibilityOfElementLocated(element.getError_addProductFirst());
    }
}
