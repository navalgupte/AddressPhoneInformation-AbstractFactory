package org.example;

import java.io.File;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Abstract Factory Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating U. S. Address and Phone Number");
        AddressFactory usAddressFactory = new USAddressFactory();
        Address usAddress = usAddressFactory.createAddress();
        PhoneNumber usPhoneNumber = usAddressFactory.createPhoneNumber();

        usAddress.setStreet("143 Louis Lane");
        usAddress.setCity("Metropolis");
        usAddress.setRegion("WY");
        usAddress.setPostalCode("54321");
        usPhoneNumber.setPhoneNumber("7098905342");

        System.out.println("U. S. Address:");
        System.out.println(usAddress.getFullAddress());
        System.out.println("U. S. Phone Number:");
        System.out.println(usPhoneNumber.getPhoneNumber());

        System.out.println();
        System.out.println();

        System.out.println("Creating French Address and Phone Number");
        AddressFactory frenchAddressFactory = new FrenchAddressFactory();
        Address frenchAddress = frenchAddressFactory.createAddress();
        PhoneNumber frenchPhoneNumber = frenchAddressFactory.createPhoneNumber();

        frenchAddress.setStreet("21 Rue Victor Hugo");
        frenchAddress.setCity("Courbevoie");
        frenchAddress.setPostalCode("40792");
        frenchPhoneNumber.setPhoneNumber("011342560");

        System.out.println("French Address:");
        System.out.println(frenchAddress.getFullAddress());
        System.out.println("French Phone Number:");
        System.out.println(frenchPhoneNumber.getPhoneNumber());
        System.out.println("---- ---- ---- ---- ----");
    }
}