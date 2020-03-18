package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.core.Is.is;

public class CheckoutPage extends PageObject {

    @FindBy (css = "[onchange*=newAddress][name*=billing]")
    private WebElementFacade enterNewAddress;


    @FindBy (css = ".field.name-firstname [name*=billing]")
    private WebElementFacade firstNameField;

    @FindBy (css = ".field.name-lastname [name*=billing]")
    private WebElementFacade lastNameField;

    @FindBy (css = ".input-box [title$=Address][name*=billing]")
    private WebElementFacade addressField;

    @FindBy (css = "[title*=City][name*=billing]")
    private WebElementFacade cityField;

    @FindBy (css = "select[name*=billing][title*=State]")
    private WebElementFacade stateFieldList;

    @FindBy (css = "[title*=Zip][name*=billing]")
    private WebElementFacade zipCodeField;

    @FindBy (css = "[name*=billing][title*=Country]")
    private WebElementFacade countryList;

    @FindBy (css = "[title*=Telephone][name*=billing]")
    private WebElementFacade telephoneField;

    @FindBy (css = "[title*=this]")
    private WebElementFacade shipToThisAddressButton;

    @FindBy (css = "[title*=Continue][onclick*=billing] span > span")
    private WebElementFacade continueToShippingButton;

    @FindBy (css = "[value*=freeshipping]")
    private WebElementFacade freeShippingButton;

    @FindBy (css = "[onclick*=shippingMethod] > span > span")
    private WebElementFacade continueToPaymentButton;

    @FindBy (css = "[onclick*=payment] > span > span")
    private WebElementFacade continueToOrderReviewButton;

    @FindBy (css = "[onclick*=review] > span > span")
    private WebElementFacade placeOrderButton;

    @FindBy (css = ".sub-title")
    private WebElementFacade placedOrderMessage;


    public void selectNewAddressList(){
        enterNewAddress.selectByVisibleText("New Address");
    }

    public void setFirstName(String firstName ){
        typeInto(firstNameField, firstName);

    }

    public void setLastName (String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setAddress (String address){
        typeInto(addressField, address);
    }

    public void setCity (String city){
        typeInto(cityField, city);
    }

    public void selectState(){
        stateFieldList.selectByVisibleText("California");

    }

    public void setZipCode(String zip){
        typeInto(zipCodeField, zip);
    }

    public void selectCountry(){
        countryList.selectByVisibleText("Statele Unite ale Americii");
    }

    public void setTelephone(Integer telephone){
        typeInto(telephoneField, String.valueOf(telephone));
    }

    public void clickShipToThisAddressButton(){
        clickOn(shipToThisAddressButton);
    }

    public void clickContinueToShippingButton(){
        clickOn(continueToShippingButton);
    }

    public void clickFreeShippingButton(){
        clickOn(freeShippingButton);
    }

    public void clickContinueToPaymentButton(){
        clickOn(continueToPaymentButton);
    }

    public void clickContinueToOrderReviewButton(){
        clickOn(continueToOrderReviewButton);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }


    public String getPlacedOrderMessage(){
        return placedOrderMessage.getText();
    }



}
