package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy (css = ".success-msg span")
    private WebElementFacade addedToCartMessageParagraph;

    @FindBy (css = ".checkout-types.top span > span")
    private WebElementFacade proceedToCheckoutButton;

    public String getAddedToCartMessage(){
        return addedToCartMessageParagraph.getText();
    }

    public void clickProceedToCheckout(){
        clickOn(proceedToCheckoutButton);
    }


}
