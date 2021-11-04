$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test_Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase TShirt and Update First Name",
  "description": " Description:This feature is to test the product purchase scenario and verifies the generated order and also verifies \n First name updatation done correctly",
  "id": "purchase-tshirt-and-update-first-name",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11096700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Open the index page and log in to the site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user is at the index page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify Sign in page opens",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user logged in to the site",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify MyAccount page opens",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_at_the_index_page()"
});
formatter.result({
  "duration": 30993213300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_the_Sign_in_link()"
});
formatter.result({
  "duration": 6349805900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.sign_in_page_opens()"
});
formatter.result({
  "duration": 8572200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_logged_in_to_the_site()"
});
formatter.result({
  "duration": 3364018700,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.myaccount_page_opens()"
});
formatter.result({
  "duration": 52610300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Purchase Tshirt product and verify the order",
  "description": "",
  "id": "purchase-tshirt-and-update-first-name;purchase-tshirt-product-and-verify-the-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@PurchaseTShirtProduct"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user clicks on the \"T-shirts\" product category link",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "verify \"T-shirts\" product category page opened",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user scroll to \"T-shirts\" product listing section",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click Add To Cart button for \"Faded Short Sleeve T-shirts\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verify the desired Product and correct price is showing for checkout",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user clicks on proceed to checkout button from popup",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user redirect to shopping cart page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user verifies the product and price",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user clicks on proceed to checkout button from shopping cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "landed on the Addresses tab",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user clicks on proceed to checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "landed on the shipping tab",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user accept the terms and condition",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user clicks on proceed to checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user landed on payment tab",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user verifies the product and price",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user selects the payment method",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user landed on the order summary tab",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user verifies the payment method and order amount",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user clicks on confirm order button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user landed on order confirmation page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user verifies the order price at order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "get the order reference id for future reference",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks on back to order link",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "user landed on order history page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user verifies the order reference payment method and order price",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "T-shirts",
      "offset": 20
    }
  ],
  "location": "MyAccountPageSteps.user_clicks_on_the_product_link(String)"
});
formatter.result({
  "duration": 5560382800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T-shirts",
      "offset": 8
    }
  ],
  "location": "Product_Listing_and_checkout_PageSteps.verify_product_page_opened(String)"
});
formatter.result({
  "duration": 7773300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T-shirts",
      "offset": 16
    }
  ],
  "location": "Product_Listing_and_checkout_PageSteps.user_scroll_to_product_listing_section(String)"
});
formatter.result({
  "duration": 97211400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 30
    }
  ],
  "location": "Product_Listing_and_checkout_PageSteps.added_into_cart(String)"
});
formatter.result({
  "duration": 2481732300,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.verify_the_desired_Product_showing_for_checkout()"
});
formatter.result({
  "duration": 292779300,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.proceed_to_checkout_popup()"
});
formatter.result({
  "duration": 3768634200,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_redirect_to_shopping_cart_page()"
});
formatter.result({
  "duration": 54630500,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_verifies_the_shopping_cart_product_and_price()"
});
formatter.result({
  "duration": 209430400,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_clicks_on_proceed_to_checkout_button_from_shopping_cart_page()"
});
formatter.result({
  "duration": 2993398400,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.landed_on_the_Addresses_tab()"
});
formatter.result({
  "duration": 63629000,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_clicks_on_proceed_to_checkout_button()"
});
formatter.result({
  "duration": 2104172200,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.landed_on_the_shipping_tab()"
});
formatter.result({
  "duration": 54118600,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_accept_the_terms_and_condition()"
});
formatter.result({
  "duration": 161765800,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_clicks_on_proceed_to_checkout_button()"
});
formatter.result({
  "duration": 4612723500,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_landed_on_payment_tab()"
});
formatter.result({
  "duration": 50310100,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_verifies_the_shopping_cart_product_and_price()"
});
formatter.result({
  "duration": 189473100,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_selects_the_payment_method()"
});
formatter.result({
  "duration": 2290915700,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_landed_on_the_order_summary_tab()"
});
formatter.result({
  "duration": 84689500,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_verifies_the_payment_method_and_order_amount()"
});
formatter.result({
  "duration": 79313500,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_clicks_on_confirm_order_button()"
});
formatter.result({
  "duration": 6937013400,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_landed_on_order_confirmation_page()"
});
formatter.result({
  "duration": 40686400,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_verifies_the_order_price_at_order_confirmation_page()"
});
formatter.result({
  "duration": 70165500,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.get_order_reference_id()"
});
formatter.result({
  "duration": 63509000,
  "status": "passed"
});
formatter.match({
  "location": "Product_Listing_and_checkout_PageSteps.user_clicks_on_back_to_order_link()"
});
formatter.result({
  "duration": 3289880900,
  "status": "passed"
});
formatter.match({
  "location": "Order_HistoryPageSteps.user_landed_on_order_history_page()"
});
formatter.result({
  "duration": 51392900,
  "status": "passed"
});
formatter.match({
  "location": "Order_HistoryPageSteps.user_verifies_the_order_reference_payment_method_and_order_price()"
});
formatter.result({
  "duration": 166285700,
  "status": "passed"
});
formatter.after({
  "duration": 232700,
  "status": "passed"
});
formatter.after({
  "duration": 6777783200,
  "status": "passed"
});
formatter.before({
  "duration": 774900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Open the index page and log in to the site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user is at the index page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify Sign in page opens",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user logged in to the site",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify MyAccount page opens",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_at_the_index_page()"
});
formatter.result({
  "duration": 15403332100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_the_Sign_in_link()"
});
formatter.result({
  "duration": 4215024300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.sign_in_page_opens()"
});
formatter.result({
  "duration": 21477700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_logged_in_to_the_site()"
});
formatter.result({
  "duration": 3810903000,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.myaccount_page_opens()"
});
formatter.result({
  "duration": 53063600,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Update user First Name from Personal information",
  "description": "",
  "id": "purchase-tshirt-and-update-first-name;update-user-first-name-from-personal-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@UpdateFirstName"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user clicks on My Personal Information button",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "landed on the Personal information page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user enters updated FirstName and clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "varifies updated FirstName at the header",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPageSteps.user_clicks_on_My_Personal_Information_button()"
});
formatter.result({
  "duration": 1855142100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.landed_on_the_Personal_information_page()"
});
formatter.result({
  "duration": 53581300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.user_enters_updated_FirstName_and_clicks_on_save_button()"
});
formatter.result({
  "duration": 4018563100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.varifies_updated_FirstName_at_the_header()"
});
formatter.result({
  "duration": 55583600,
  "status": "passed"
});
formatter.after({
  "duration": 26900,
  "status": "passed"
});
formatter.after({
  "duration": 5895235100,
  "status": "passed"
});
});