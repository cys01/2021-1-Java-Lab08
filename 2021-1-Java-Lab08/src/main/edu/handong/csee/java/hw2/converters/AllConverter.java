package edu.handong.csee.java.hw2.converters;

/**
 * This is the Converter class about all convertible measure by converter implemented by interface
 */

public class AllConverter{

    private double value = 0;
    private String origin = "";

    /**
     * Get the double value to convert into other measure, 
     * then return self for method chain.
     * @param fromValue         this is the value of origin measure
     * @return AllConverter
     */
    public AllConverter setFromValue(double fromValue) {
        this.value = fromValue;
        return this;
    }

    /**
     * Get the Measure String about converted measure type,
     * then return self for method chain.
     * @param originMeasure     thie is the String about measure to be converted
     * @return AllConverter
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.origin = originalMeasure.toUpperCase();
        return this;
    }
    
    /**
     * <pre>
     * According to Measure type, convert measure into other convertible types.
     * if there is no convertible type, print that it is not supported measure type.
     * </pre>
     */
    public void convertAndPrintOut() {
        if(origin.equals("KM")) {
            System.out.println("" + value + " " + origin + " to " + value * 1000 + " M");
            System.out.println("" + value + " " + origin + " to " + value / 1.6 + " MILE");
        }
        else if(origin.equals("TON")) {
            System.out.println("" + value + " " + origin + " to " + value * 1000 + " KG");
            System.out.println("" + value + " " + origin + " to " + value * 1000 * 1000 + " G");
        }
        else {
            System.out.println("AllConverter cannot support the measure!");
        }
    }

}