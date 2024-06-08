package org.example;

public class USAddress extends Address {
    public static final String COUNTRY = "UNITED STATES";
    public static final String COMMA = ",";

    @Override
    public String getCountry() {
        return COUNTRY;
    }

    public String getFullAddress() {
        return getStreet() + EOL_STRING + getCity() +
                getRegion() + COMMA + SPACE + getRegion() +
                SPACE + getPostalCode() + EOL_STRING + COUNTRY + EOL_STRING;
    }
}
