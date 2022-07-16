package com.designpatterns;

import java.util.function.Supplier;

/**
 * Factory is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class.
 */
public class Factory {

    public static void main(String[] args) {
        Phone featurePhone = getPhone(PhoneType.FEATURE);
        featurePhone.makeCall();
        Phone smartPhone = getPhone(PhoneType.SMARTPHONE);
        smartPhone.makeCall();
    }

    public static Phone getPhone(PhoneType type){
        return type.getConstructor().get();
    }
}

interface Phone {
    void makeCall();
}

class FeaturePhone implements Phone{

    @Override
    public void makeCall() {
        System.out.println("Calling with 2G band");
    }
}

class SmartPhone implements Phone {

    @Override
    public void makeCall() {
        System.out.println("Calling with VoLTE feature");
    }
}

enum PhoneType {
    FEATURE(FeaturePhone::new),
    SMARTPHONE(SmartPhone::new);

    private final Supplier<Phone> constructor;
    PhoneType(Supplier<Phone> phone) {
        this.constructor = phone;
    }

    public Supplier<Phone> getConstructor() {
        return constructor;
    }
}