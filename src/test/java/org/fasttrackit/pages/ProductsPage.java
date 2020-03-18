package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/sale.html")
public class ProductsPage extends PageObject {

    @FindBy (id = "product-collection-image-423")
    private WebElementFacade productImage;

    @FindBy (css = "[src*=purple]")
    private WebElementFacade productColor;

    @FindBy (css = "#swatch79 span:first-child")
    private WebElementFacade productSize;

    @FindBy (css = "[onclick*=submit].btn-cart span > span")
    private WebElementFacade addToCartButton;

    public void clickProductImage (){
        clickOn(productImage);
    }
    public void clickProductColor(){
        clickOn(productColor);
    }

    public void clickProductSize(){
        clickOn(productSize);
    }

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

}
