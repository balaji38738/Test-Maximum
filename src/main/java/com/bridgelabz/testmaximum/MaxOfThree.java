package com.bridgelabz.testmaximum;

public class MaxOfThree {
    private Integer firstInteger, secondInteger, thirdInteger;
    private Float firstFloat, secondFloat, thirdFloat;
    private String firstString, secondString, thirdString;

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

    public MaxOfThree(String firstString, String secondString,
                      String thirdString) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.thirdString = thirdString;
    }

    public int findMaxOfThreeIntegers() {
        int comparison1 = firstInteger.compareTo(secondInteger);
        int comparison2 = secondInteger.compareTo(thirdInteger);
        int comparison3 = firstInteger.compareTo(thirdInteger);
        int intMaximum = comparison1 > 0 ? (comparison3 > 0 ? firstInteger : thirdInteger) :
                (comparison2 > 0 ? secondInteger : thirdInteger);
        return intMaximum;
    }

    public float findMaxOfThreeFloats() {
        int comparison1 = firstFloat.compareTo(secondFloat);
        int comparison2 = secondFloat.compareTo(thirdFloat);
        int comparison3 = firstFloat.compareTo(thirdFloat);
        float floatMaximum = comparison1 > 0 ? (comparison3 > 0 ? firstFloat : thirdFloat) :
                (comparison2 > 0 ? secondFloat : thirdFloat);
        return floatMaximum;
    }

    public String findMaxOfThreeStrings() {
        int comparison1 = firstString.compareTo(secondString);
        int comparison2 = secondString.compareTo(thirdString);
        int comparison3 = firstString.compareTo(thirdString);
        String maxString = comparison1 > 0 ? (comparison3 > 0 ? firstString : thirdString) :
                (comparison2 > 0 ? secondString : thirdString);
        return maxString;
    }
}
