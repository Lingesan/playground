package com.designpatterns;

/**
 * Create an object based on an existing object through cloning.
 */
public class Prototype implements Cloneable{
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        System.out.println(prototype);
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }

    /**
     * super.clone() only does shallow copy. If the object has reference data type, a deep copy has to be done
     * @return the cloned object
     */
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Prototype{}";
    }
}
