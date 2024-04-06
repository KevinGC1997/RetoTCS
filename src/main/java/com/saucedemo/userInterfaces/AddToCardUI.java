package com.saucedemo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCardUI {

    public static final Target BTN_FILTER = Target.the("button to filters")
            .locatedBy("//select[@class='product_sort_container']");
    public static final Target BTN_PRODUCT = Target.the("product to add")
            .locatedBy("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    public static final Target BTN_CART = Target.the("button cart")
            .locatedBy("//span[@class='shopping_cart_badge']");
    public static final Target TXT_PRODUCT_NAME = Target.the("Text to validate product")
            .locatedBy("//div[@class='inventory_item_name']");

}
