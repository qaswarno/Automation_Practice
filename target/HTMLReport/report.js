$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test_Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase TShirt and Update First Name",
  "description": " Description:This feature is to test the product purchase scenario and verifies the generated order and also verifies \n First name updatation done correctly",
  "id": "purchase-tshirt-and-update-first-name",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22710783200,
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
  "location": "LoginProcessSteps.login_Process()"
});
formatter.result({
  "duration": 6323471100,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.verify_My_Account_Page()"
});
formatter.result({
  "duration": 49253200,
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
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "proceed through the checkout process",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "get the order reference id from Order Confirmation page for future reference",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on back to order link and landed on Order History Page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
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
  "duration": 6358718000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 8
    }
  ],
  "location": "CheckoutSteps.select_Product(String)"
});
formatter.result({
  "duration": 6957820000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.checkout_Process()"
});
formatter.result({
  "duration": 13440056000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.get_Order_Reference_Id()"
});
formatter.result({
  "duration": 194700300,
  "status": "passed"
});
formatter.match({
  "location": "Order_HistoryPageSteps.click_Back_To_Order_History_And_Verify()"
});
formatter.result({
  "duration": 3866177400,
  "status": "passed"
});
formatter.match({
  "location": "Order_HistoryPageSteps.verify_Order()"
});
formatter.result({
  "duration": 165087100,
  "status": "passed"
});
formatter.after({
  "duration": 164600,
  "status": "passed"
});
formatter.after({
  "duration": 6561477700,
  "status": "passed"
});
formatter.before({
  "duration": 20628467000,
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
  "location": "LoginProcessSteps.login_Process()"
});
formatter.result({
  "duration": 14072058600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.verify_My_Account_Page()"
});
formatter.result({
  "duration": 39773100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Update user First Name from Personal information",
  "description": "",
  "id": "purchase-tshirt-and-update-first-name;update-user-first-name-from-personal-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@UpdateFirstName"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user clicks on My Personal Information button",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "landed on the Personal information page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user enters updated FirstName and clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "verifies updated FirstName at the header",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPageSteps.click_Personal_Information_Button()"
});
formatter.result({
  "duration": 2721873600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.verify_Personal_Information_Page()"
});
formatter.result({
  "duration": 142273800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.update_Firstname_And_Save()"
});
formatter.result({
  "duration": 5463166200,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountPageSteps.verify_Firstname()"
});
formatter.result({
  "duration": 63763100,
  "status": "passed"
});
formatter.after({
  "duration": 53000,
  "status": "passed"
});
formatter.after({
  "duration": 6080669800,
  "status": "passed"
});
});