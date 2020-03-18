package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddToCartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private AddToCartSteps addToCartSteps;

    @Test
    public void addToCart() {
        loginSteps.login("checkthisout@mailinator.com",
                "Checkthisout",
                "Hello, chicho chiki!");
        addToCartSteps.navigateToProductsPage();
        addToCartSteps.clickProduct();
        addToCartSteps.clickProductColor();
        addToCartSteps.clickProductSize();
        addToCartSteps.clickAddToCartButton();
        addToCartSteps.checkIfProductIsAdded("Racer Back Maxi Dress was added to your shopping cart.");


}


}
