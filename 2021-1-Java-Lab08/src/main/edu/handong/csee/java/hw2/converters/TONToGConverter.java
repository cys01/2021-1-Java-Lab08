package main.edu.handong.csee.java.hw2.converters;

/**
 * This Converter class turn ton measure into gram.
 */
public class TONToGConverter implements Convertible{
    
    private double ton = 0;
    private double gram = 0;

    /**
     * get the ton value that will be exchanged into gram.
     * @param fromValue     this is the value about ton measure. ex) "100" ton
     */
    @Override
    public void setFromValue(double fromValue) {
        this.ton = fromValue;
    }

    /**
     * return the exchanged gram value.
     * @return double
     */
    @Override
    public double getConvertedValue() {
        return this.gram;
    }

    /**
     * convert ton value into gram value
     */
    @Override
    public void convert() {
        gram = ton * (1000 * 1000);
    }

}