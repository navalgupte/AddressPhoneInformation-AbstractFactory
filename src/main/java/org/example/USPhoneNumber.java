package org.example;

public class USPhoneNumber extends PhoneNumber {
    private static final String COUNTRY_CODE = "01";
    private static final int NUMBER_LENGTH = 10;

    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == NUMBER_LENGTH) {
            super.setPhoneNumber(phoneNumber);
        }
    }
}
