package com.Junittesting;
import com.UserRegitration.*;

import org.junit.Assert;
import org.junit.Test;

public class ValidateUserTest {


    //    Testing for first name
    @Test
    public void givenFirstname_when1stLetterCap_ReturnsTrue(){
        boolean result = FirstName.validateFirstName("Vishal");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstname_when1stLetterSmall_ReturnsFalse(){
        boolean result = FirstName.validateFirstName("vishalk04");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstname_whenItContainsNumber_ReturnsFalse(){
        boolean result = FirstName.validateFirstName("Dipak10");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstname_whenItContainsSpecialSymbol_ReturnsFalse(){
        boolean result = FirstName.validateFirstName("Dip@ak^10");
        Assert.assertEquals(false, result);
    }

    //  Testing for last name
    @Test
    public void givenLastname_when1stLetterCap_ReturnsTrue(){
        boolean result = LastName.validateLastName("Kale");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastname_when1stLetterSmall_ReturnsFalse(){
        boolean result = LastName.validateLastName("kale");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastname_whenItContainsNumber_ReturnsFalse(){
        boolean result = LastName.validateLastName("kl256");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastname_whenItContainsSpecialSymbol_ReturnsFalse(){
        boolean result = LastName.validateLastName("kl257%&@8");
        Assert.assertEquals(false, result);
    }

    //    Testing for emails
    @Test
    public void givenEmail_WithMandatoryParts_ReturnsTrue(){
        boolean result = UserEmail.validateUserEmail("kalevish@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WithOptionalParts_ReturnsTrue(){
        boolean result = UserEmail.validateUserEmail("vish.kale@gmail.com.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WithOutMandatoryParts_ReturnsFalse(){
        boolean result = UserEmail.validateUserEmail("vish@.com");
        Assert.assertEquals(false,result);
    }

    //Testing for phone number
    @Test
    public void givenPhoneNumber_WithCountryCodeAndSpace_ReturnsTrue(){
        boolean result = PhoneNumber.validatePhoneNumber("91 9021892392");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_WithoutCountryCodeAndSpace_ReturnsFalse(){
        boolean result = PhoneNumber.validatePhoneNumber("9021892392");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_WithAlphabet_ReturnsFalse(){
        boolean result = PhoneNumber.validatePhoneNumber("91 90vs21R392");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_WithSpace_ReturnsFalse(){
        boolean result = PhoneNumber.validatePhoneNumber("91 90vs2 R392");
        Assert.assertEquals(false,result);
    }

    //    Testing for password
    @Test
    public void giverPassword_WithMinimumLengthOf8_returnsTrue(){
        boolean result = FinalPassword.validatePassword("V@22sha2l");
        Assert.assertEquals(true,result);
    }
    @Test
    public void giverPassword_WithoutMinimumLengthOf8_returnsFalse(){
        boolean result = FinalPassword.validatePassword("v@57kal");
        Assert.assertEquals(false,result);
    }
    @Test
    public void giverPassword_WithSpecialCharacter_returnsFalse(){
        boolean result = FinalPassword.validatePassword("l@71vish7");
        Assert.assertEquals(false,result);
    }
}