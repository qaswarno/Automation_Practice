Feature: Purchase TShirt and Update First Name  
   Description:This feature is to test the product purchase scenario and verifies the generated order and also verifies 
   First name updatation done correctly

 Background: Open the index page and log in to the site
   Given user is at the index page
    When user clicks on the Sign in link
    And verify Sign in page opens
    Then user logged in to the site
    And verify MyAccount page opens
  
  
  @PurchaseTShirtProduct
  Scenario: Purchase Tshirt product and verify the order   
    Then user clicks on the "T-shirts" product category link
    And verify "T-shirts" product category page opened
    Then user scroll to "T-shirts" product listing section
    And click Add To Cart button for "Faded Short Sleeve T-shirts"
    And verify the desired Product and correct price is showing for checkout
    Then user clicks on proceed to checkout button from popup
    And user redirect to shopping cart page
    Then user verifies the product and price
    Then user clicks on proceed to checkout button from shopping cart page
    And landed on the Addresses tab
    Then user clicks on proceed to checkout button
    And landed on the shipping tab
    Then user accept the terms and condition
    Then user clicks on proceed to checkout button
    And user landed on payment tab
    Then user verifies the product and price
    And user selects the payment method
    Then user landed on the order summary tab
    And user verifies the payment method and order amount
    Then user clicks on confirm order button
    And user landed on order confirmation page
    Then user verifies the order price at order confirmation page
    And get the order reference id for future reference
    Then user clicks on back to order link
    And user landed on order history page
    Then user verifies the order reference payment method and order price
    
    
    @UpdateFirstName
  Scenario: Update user First Name from Personal information
    Then user clicks on My Personal Information button
    And landed on the Personal information page
    Then user enters updated FirstName and clicks on save button
    And varifies updated FirstName at the header
