package org.example;

/*
    AddressFactory - Defines 2 factory methods createAddress() and createPhoneNumber()
    that create abstract products Address and Phone Number.
 */
public interface AddressFactory {
    public Address createAddress();
    public PhoneNumber createPhoneNumber();
}
