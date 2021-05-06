package edu.handong.csee.java.hw2.converters;

/**
 * This Converter class turn mile measure into kilometer.
 */
public class MILEToKMConverter implements Convertible{
    
    private double mile = 0;
    private double km = 0;

    /**
     * get the mile value that will be exchanged into kilometer.
     * @param fromValue     this is the value about mile measure. ex) "6.8" mile
     */
    @Override
    public void setFromValue(double fromValue) {
        this.mile = fromValue;
    }

    /**
     * return the exchanged kilometer value.
     * @return double
     */
    @Override
    public double getConvertedValue() {
        return this.km;
    }

    /**
     * convert mile value into kilometer value
     */
    @Override
    public void convert() {
        km = mile * 1.6;
    }

}