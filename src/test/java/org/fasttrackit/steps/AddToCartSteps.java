package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ProductsPage;
import org.junit.Assert;

public class AddToCartSteps {
    private ProductsPage productsPage;
    private CartPage cartPage;

    @Step
    public void navigateToProductsPage(){
        productsPage.open();
    }

    @Step

    public void clickProduct(){
        productsPage.clickProductImage();
    }

    @Step

    public void clickProductColor(){
        productsPage.clickProductColor();
    }

    @Step

    public void clickProductSize(){
        productsPage.clickProductSize();
    }

    @Step

    public void clickAddToCartButton(){
        productsPage.clickAddToCartButton();
    }

    @Step

    public void checkIfProductIsAdded(String expected){
        String message = cartPage.getAddedToCartMessage();
        Assert.assertEquals(expected, message);
    }

    @Step

    public void AddToCart(String message){
        navigateToProductsPage();
        clickProduct();
        clickProductColor();
        clickProductSize();
        clickAddToCartButton();
        checkIfProductIsAdded(message);
    }
}

