package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.junit.Assert;

public class CheckoutSteps {
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void clickProceedToCheckout(){
        cartPage.clickProceedToCheckout();
    }

    @Step
    public void clickNewAddress(){
        checkoutPage.selectNewAddressList();
    }

    @Step
    public void setFirstName(String firstName){
        checkoutPage.setFirstName(firstName);
    }

    @Step
    public void setLastName (String lastName){
        checkoutPage.setLastName(lastName);
    }

    @Step

    public void setAddress (String address){
        checkoutPage.setAddress(address);
    }

    @Step

    public void setCity (String city){
        checkoutPage.setCity(city);
    }

    @Step
    public void selectState(){
        checkoutPage.selectState();
    }

    @Step

    public void setZip(String zip){
        checkoutPage.setZipCode(zip);
    }

    @Step

    public void selectCountry(){
        checkoutPage.selectCountry();
    }

    @Step

    public void setTelephone(Integer telephone){
        checkoutPage.setTelephone(telephone);
    }

    @Step

    public void selectShipToThisAddressButton(){
        checkoutPage.clickShipToThisAddressButton();
    }

    @Step
    public void continueToShippingButton(){
        checkoutPage.clickContinueToShippingButton();
    }

    @Step

    public void selectFreeShippingButton(){
        checkoutPage.clickFreeShippingButton();
    }

    @Step

    public void continueToPaymentButton(){
        checkoutPage.clickContinueToPaymentButton();
    }

    @Step

    public void continueToOrderReviewButton(){
        checkoutPage.clickContinueToOrderReviewButton();
    }

    @Step

    public void placeOrderButton(){
        checkoutPage.clickPlaceOrderButton();
    }

    @Step

    public void checkPlacedOrderMessage(String expected){
        String message = checkoutPage.getPlacedOrderMessage();
        Assert.assertEquals(expected, message);
    }



}
