Feature: Purchase TShirt and Update First Name  
   Description:This feature is to test the product purchase scenario and verifies the generated order and also verifies 
   First name updatation done correctly

 Background: User log in to the site
   Given user opens the site and logged in 
    And verify MyAccount page opens
  
  
  @PurchaseTShirtProduct
  Scenario: Purchase Tshirt product and verify the order   
    Given user clicks on the "T-shirts" product category link
    And choose "Faded Short Sleeve T-shirts" product for purchase
    Then proceed through the checkout process
    And get the order reference id from Order Confirmation page for future reference
    Then user clicks on back to order link
    And landed on order history page
    Then user verifies the order reference payment method and order price
    
    
    @UpdateFirstName
  Scenario: Update user First Name from Personal information
    Then user clicks on My Personal Information button
    And landed on the Personal information page
    Then user enters updated FirstName and clicks on save button
    And varifies updated FirstName at the header
