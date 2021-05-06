package edu.handong.csee.java.hw2.converters;

/**
 * This Converter class turn kilometer measure into meter.
 */
public class KMToMConverter implements Convertible{
    
    private double km = 0;
    private double meter = 0;

    /**
     * get the kilometer value that will be exchanged into meter.
     * @param fromValue     this is the value about kilometer measure. ex) "10.23" km
     */
    @Override
    public void setFromValue(double fromValue) {
        this.km = fromValue;
    }

    /**
     * return the exchanged meter value.
     * @return double
     */
    @Override
    public double getConvertedValue() {
        return this.meter;
    }

    /**
     * convert kilometer value into meter value
     */
    @Override
    public void convert() {
        meter = km * 1000;
    }

}