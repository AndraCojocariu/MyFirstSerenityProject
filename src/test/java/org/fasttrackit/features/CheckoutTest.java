package org.fasttrackit.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)

    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private AddToCartSteps addToCartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void ProceedToCheckout(){
        loginSteps.login("checkthisout@mailinator.com",
                "Checkthisout",
                "Hello, chicho chiki!");
        addToCartSteps.AddToCart("Racer Back Maxi Dress was added to your shopping cart.");
        checkoutSteps.clickProceedToCheckout();
        checkoutSteps.clickNewAddress();
        checkoutSteps.setFirstName("Cici");
        checkoutSteps.setLastName("Flici");
        checkoutSteps.setAddress("Queen Street no 11");
        checkoutSteps.setCity("California");
        checkoutSteps.selectState();
        checkoutSteps.setZip("23456");
        checkoutSteps.selectCountry();
        checkoutSteps.setTelephone(1234);
        checkoutSteps.selectShipToThisAddressButton();
        checkoutSteps.continueToShippingButton();
        checkoutSteps.selectFreeShippingButton();
        checkoutSteps.continueToPaymentButton();
        checkoutSteps.continueToOrderReviewButton();
        checkoutSteps.placeOrderButton();
        checkoutSteps.checkPlacedOrderMessage("THANK YOU FOR YOUR PURCHASE!");

    }
}
