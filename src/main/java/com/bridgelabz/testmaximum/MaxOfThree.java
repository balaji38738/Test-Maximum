package com.bridgelabz.testmaximum;

public class MaxOfThree {
    private Integer firstInteger, secondInteger, thirdInteger;
    private int intMaximum;
    private Float firstFloat, secondFloat, thirdFloat;
    private float floatMaximum;

    public MaxOfThree(Integer firstInteger, Integer secondInteger,
                      Integer thirdInteger) {
        this.firstInteger= firstInteger;
        this.secondInteger = secondInteger;
        this.thirdInteger = thirdInteger;
    }

    public MaxOfThree(Float firstFloat, Float secondFloat,
                      Float thirdFloat) {
        this.firstFloat = firstFloat;
        this.secondFloat = secondFloat;
        this.thirdFloat = thirdFloat;
    }

    public int findMaxOfThreeIntegers() {
        int comparison1 = firstInteger.compareTo(secondInteger);
        int comparison2 = secondInteger.compareTo(thirdInteger);
        int comparison3 = firstInteger.compareTo(thirdInteger);
        intMaximum = comparison1 > 0 ? (comparison3 > 0 ? firstInteger : thirdInteger ) :
                (comparison2 > 0 ? secondInteger : thirdInteger);
        return intMaximum;
    }

    public float findMaxOfThreeFloats() {
        int comparison1 = firstFloat.compareTo(secondFloat);
        int comparison2 = secondFloat.compareTo(thirdFloat);
        int comparison3 = firstFloat.compareTo(thirdFloat);
        floatMaximum = comparison1 > 0 ? (comparison3 > 0 ? firstFloat : thirdFloat ) :
                (comparison2 > 0 ? secondFloat : thirdFloat);
        return floatMaximum;
    }
}
