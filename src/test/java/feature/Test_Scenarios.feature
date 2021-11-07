Feature: Purchase TShirt and Update First Name  
   Description:This feature is to test the product purchase scenario and verifies the generated order and also verifies 
   First name updatation done correctly

 Background: User log in to the site
   Given user opens the site and logged in 
   And verify MyAccount page opens
  
  
  @PurchaseTShirtProduct
  Scenario: Purchase Tshirt product and verify the order   
    Given user clicks on the "T-shirts" product category link
    When choose "Faded Short Sleeve T-shirts" product for purchase
    And proceed through the checkout process
    And get the order reference id from Order Confirmation page for future reference
    And user clicks on back to order link and landed on Order History Page
    Then user verifies the order reference payment method and order price
    
    
    @UpdateFirstName
  Scenario: Update user First Name from Personal information
    Given user clicks on My Personal Information button
    When landed on the Personal information page
    Then user enters updated FirstName and clicks on save button
    And verifies updated FirstName at the header
