package org.example;

public class FrenchPhoneNumber extends PhoneNumber {
    private static final String COUNTRY_CODE = "33";
    private static final int NUMBER_LENGTH = 9;

    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == NUMBER_LENGTH) {
            super.setPhoneNumber(phoneNumber);
        }
    }
}
