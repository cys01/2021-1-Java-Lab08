package edu.handong.csee.java.hw2.converters;

/**
 * This Converter class turn ton measure into kilogram.
 */
public class TONToKGConverter implements Convertible{
    
    private double ton = 0;
    private double kg = 0;

    /**
     * get the ton value that will be exchanged into kilogram.
     * @param fromValue     this is the value about ton measure. ex) "100" ton
     */
    @Override
    public void setFromValue(double fromValue) {
        this.ton = fromValue;
    }

    /**
     * return the exchanged kilogram value.
     * @return double
     */
    @Override
    public double getConvertedValue() {
        return this.kg;
    }

    /**
     * convert ton value into kilogram value
     */
    @Override
    public void convert() {
        kg = ton * 1000;
    }

}