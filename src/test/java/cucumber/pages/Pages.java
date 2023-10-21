package cucumber.pages;

import org.openqa.selenium.By;

public class Pages {
    By field_username= By.xpath("//*[@id='user-name']");
    By field_password= By.xpath("//*[@id='password']");
    By button_login= By.xpath("//*[@id='login-button']");
    By error_login= By.xpath("//*[contains(text(),'Epic sadface')]");
    By label_homepage= By.xpath("//*[text()='Products']");
    By button_addProduct1= By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
    By button_addProduct2= By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']");
    By button_addProduct3= By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    By button_addProduct4= By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");
    By button_addProduct5= By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']");
    By button_addProduct6= By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
    By button_removeProduct1= By.xpath("//*[@id='remove-sauce-labs-backpack']");
    By button_removeProduct2= By.xpath("//*[@id='remove-sauce-labs-bike-light']");
    By button_removeProduct3= By.xpath("//*[@id='remove-sauce-labs-bolt-t-shirt']");
    By button_removeProduct4= By.xpath("//*[@id='remove-sauce-labs-fleece-jacket']");
    By button_removeProduct5= By.xpath("//*[@id='remove-sauce-labs-onesie']");
    By button_removeProduct6= By.xpath("//*[@id='remove-test.allthethings()-t-shirt-(red)']");
    By button_cart= By.xpath("//*[@id='shopping_cart_container']");
    By label_cart= By.xpath("//*[text()='Your Cart']");
    By label_product1= By.xpath("//*[@id='item_1_title_link']");
    By label_product2= By.xpath("//*[@id='item_2_title_link']");
    By label_product3= By.xpath("//*[@id='item_3_title_link']");
    By label_product4= By.xpath("//*[@id='item_4_title_link']");
    By label_product5= By.xpath("//*[@id='item_5_title_link']");
    By label_product6= By.xpath("//*[@id='item_6_title_link']");
    By button_checkout= By.xpath("//*[@id='checkout']");
    By label_information= By.xpath("//*[text()='Checkout: Your Information']");
    By field_firstname= By.xpath("//*[@id='first-name']");
    By field_lastname= By.xpath("//*[@id='last-name']");
    By field_postCode= By.xpath("//*[@id='postal-code']");
    By button_continue= By.xpath("//*[@id='continue']");
    By error_information= By.xpath("//*[contains(text(),'First Name is required')]");
    By label_overview= By.xpath("//*[text()='Checkout: Overview']");
    By label_total= By.xpath("//*[contains(text(),'140.34')]");
    By button_finish= By.xpath("//*[@id='finish']");
    By label_checkoutCompleted= By.xpath("//*[contains(text(),'Thank you for your order!')]");
    By button_backHome= By.xpath("//*[@id='back-to-products']");

    By error_addProductFirst= By.xpath("//*[contains(text(),'dummy')]");

    public By getField_username() {
        return field_username;
    }

    public By getField_password() {
        return field_password;
    }

    public By getButton_login() {
        return button_login;
    }

    public By getError_login() {
        return error_login;
    }

    public By getLabel_homepage() {
        return label_homepage;
    }
    public By getButton_addProduct1() {
        return button_addProduct1;
    }

    public By getButton_addProduct2() {
        return button_addProduct2;
    }

    public By getButton_addProduct3() {
        return button_addProduct3;
    }

    public By getButton_addProduct4() {
        return button_addProduct4;
    }

    public By getButton_addProduct5() {
        return button_addProduct5;
    }
    public By getButton_addProduct6() {
        return button_addProduct6;
    }

    public By getButton_removeProduct1() {
        return button_removeProduct1;
    }

    public By getButton_removeProduct2() {
        return button_removeProduct2;
    }

    public By getButton_removeProduct3() {
        return button_removeProduct3;
    }

    public By getButton_removeProduct4() {
        return button_removeProduct4;
    }

    public By getButton_removeProduct5() {
        return button_removeProduct5;
    }

    public By getButton_removeProduct6() {
        return button_removeProduct6;
    }

    public By getButton_cart() {
        return button_cart;
    }

    public By getLabel_cart() {
        return label_cart;
    }

    public By getLabel_product1() {
        return label_product1;
    }

    public By getLabel_product2() {
        return label_product2;
    }

    public By getLabel_product3() {
        return label_product3;
    }

    public By getLabel_product4() {
        return label_product4;
    }

    public By getLabel_product5() {
        return label_product5;
    }

    public By getLabel_product6() {
        return label_product6;
    }

    public By getButton_checkout() {
        return button_checkout;
    }

    public By getLabel_information() {
        return label_information;
    }

    public By getField_firstname() {
        return field_firstname;
    }

    public By getField_lastname() {
        return field_lastname;
    }

    public By getField_postCode() {
        return field_postCode;
    }

    public By getButton_continue() {
        return button_continue;
    }

    public By getError_information() {
        return error_information;
    }

    public By getLabel_overview() {
        return label_overview;
    }

    public By getLabel_total() {
        return label_total;
    }

    public By getButton_finish() {
        return button_finish;
    }
    public By getLabel_checkoutCompleted() {
        return label_checkoutCompleted;
    }

    public By getButton_backHome() {
        return button_backHome;
    }

    public By getError_addProductFirst() {
        return error_addProductFirst;
    }

}