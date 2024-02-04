

  Feature: Login functionlity
    
 
   @Reg
    Scenario: validate login with details
    When user enter username "error_user" and password "secret_sauce"
    And user click on login button
    Then validate login success
    

@Reg
    Scenario: validate login with invalid details
    When user enter username "err_user" and password "sec_sce"
    And user click on login button
    
 