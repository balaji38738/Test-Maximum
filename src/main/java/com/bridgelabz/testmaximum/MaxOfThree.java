package com.bridgelabz.testmaximum;

public class MaxOfThree {

    public <T extends Comparable> T findMaxOfThree(T firstObject, T secondObject, T thirdObject) {
        int comparison1 = firstObject.compareTo(secondObject);
        int comparison2 = secondObject.compareTo(thirdObject);
        int comparison3 = firstObject.compareTo(thirdObject);
        T maximum = comparison1 > 0 ? (comparison3 > 0 ? firstObject : thirdObject) :
                (comparison2 > 0 ? secondObject : thirdObject);
        return maximum;
    }
}
