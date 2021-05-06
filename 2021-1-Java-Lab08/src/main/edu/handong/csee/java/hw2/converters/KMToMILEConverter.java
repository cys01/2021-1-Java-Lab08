package edu.handong.csee.java.hw2.converters;

/**
 * This Converter class turn kilometer measure into mile.
 */
public class KMToMILEConverter implements Convertible{
    
    private double km = 0;
    private double mile = 0;

    /**
     * get the kilometer value that will be exchanged into mile.
     * @param fromValue     this is the value about kilometer measure. ex) "10.23" km
     */
    @Override
    public void setFromValue(double fromValue) {
        this.km = fromValue;
    }

    /**
     * return the exchanged mile value.
     * @return double
     */
    @Override
    public double getConvertedValue() {
        return this.mile;
    }

    /**
     * convert kilometer value into mile value
     */
    @Override
    public void convert() {
        mile = km / 1.6;
    }

}