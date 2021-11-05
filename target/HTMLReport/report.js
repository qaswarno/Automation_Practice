$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test_Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase TShirt and Update First Name",
  "description": " Description:This feature is to test the product purchase scenario and verifies the generated order and also verifies \n First name updatation done correctly",
  "id": "purchase-tshirt-and-update-first-name",
  "keyword": "Feature"
});
formatter.before({
  "duration": 119177120600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User log in to the site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user opens the site and logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify MyAccount page opens",
  "keyword": "And "
});
formatter.match({
  "location": "LoginProcessSteps.user_opens_the_site_and_logged_in()"
});
formatter.result({
  "duration": 40021036400,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.myaccount_page_opens()"
});
formatter.result({
  "duration": 36972300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Purchase Tshirt product and verify the order",
  "description": "",
  "id": "purchase-tshirt-and-update-first-name;purchase-tshirt-product-and-verify-the-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@PurchaseTShirtProduct"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user clicks on the \"T-shirts\" product category link",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "choose \"Faded Short Sleeve T-shirts\" product for purchase",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "proceed through the checkout process",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "get the order reference id from Order Confirmation page for future reference",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on back to order link",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "landed on order history page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
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
  "location": "CheckoutSteps.user_clicks_on_the_product_link(String)"
});
formatter.result({
  "duration": 13476291800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 8
    }
  ],
  "location": "CheckoutSteps.choose_product_for_purchase(String)"
});
formatter.result({
  "duration": 9133796400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.proceed_through_the_checkout_process()"
});
formatter.result({
  "duration": 15359266600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.get_order_reference_id()"
});
formatter.result({
  "duration": 173707700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.user_clicks_on_back_to_order_link()"
});
formatter.result({
  "duration": 3314748600,
  "status": "passed"
});
formatter.match({
  "location": "Order_HistoryPageSteps.user_landed_on_order_history_page()"
});
formatter.result({
  "duration": 64997100,
  "status": "passed"
});
formatter.match({
  "location": "Order_HistoryPageSteps.user_verifies_the_order_reference_payment_method_and_order_price()"
});
formatter.result({
  "duration": 132638600,
  "status": "passed"
});
formatter.after({
  "duration": 133500,
  "status": "passed"
});
formatter.after({
  "duration": 8133059100,
  "status": "passed"
});
formatter.before({
  "duration": 41320327600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User log in to the site",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user opens the site and logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "verify MyAccount page opens",
  "keyword": "And "
});
formatter.match({
  "location": "LoginProcessSteps.user_opens_the_site_and_logged_in()"
});
formatter.result({
  "duration": 9074477300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.myaccount_page_opens()"
});
formatter.result({
  "duration": 52871400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Update user First Name from Personal information",
  "description": "",
  "id": "purchase-tshirt-and-update-first-name;update-user-first-name-from-personal-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@UpdateFirstName"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user clicks on My Personal Information button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "landed on the Personal information page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user enters updated FirstName and clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "varifies updated FirstName at the header",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPageSteps.user_clicks_on_My_Personal_Information_button()"
});
formatter.result({
  "duration": 2004246100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.landed_on_the_Personal_information_page()"
});
formatter.result({
  "duration": 284357000,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.user_enters_updated_FirstName_and_clicks_on_save_button()"
});
formatter.result({
  "duration": 6429277500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.varifies_updated_FirstName_at_the_header()"
});
formatter.result({
  "duration": 57385000,
  "status": "passed"
});
formatter.after({
  "duration": 67000,
  "status": "passed"
});
formatter.after({
  "duration": 6306790600,
  "status": "passed"
});
});