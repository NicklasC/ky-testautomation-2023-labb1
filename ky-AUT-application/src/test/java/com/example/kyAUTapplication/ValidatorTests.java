package com.example.kyAUTapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidatorTests {

    @Test
    void phoneNumberStartsWith0IsOK() {
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("040444555"));
    }

    @Test
    void phoneNumberStartsWith1IsNotOK() {
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("140444555"));
    }

    @Test
    void phoneNumberLengthLessThenSixIsNotOk() {
        //Start phonenumber with 0 as any phonenumber, no matter the length, is invalid if it does not start with 0.
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("03355"));
    }

    @Test
    void phoneNumberLengthSixIsOK() {
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("0333555"));
    }

    @Test
    void phoneNumberLength10IsOK() {
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("0333555777"));
    }

    @Test
    void phoneNumberLength11IsNotOK() {
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("03335557778"));
    }

    @Test
    void phoneNumberWithDigitsIsOK() {
        // This test is for completeness and is really tested elsewhere. true / false test together with phoneNumberWithNonDigitsIsNotOK
        Assertions.assertEquals(true, Validator.isPhoneNumberValid("0333555777"));
    }

    @Test
    void phoneNumberWithNonDigitsIsNotOK() {
        Assertions.assertEquals(false, Validator.isPhoneNumberValid("033355F777"));
    }
}
