package com.bridgelabz.testmaximum;

public class MaxOfThree <T extends Comparable<T>>{
    private T firstObject, secondObject, thirdObject;

    public MaxOfThree() {

    }

    public MaxOfThree(T firstObject, T secondObject, T thirdObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
    }

    public static <T extends Comparable<T>> T findMaxOfThree(T firstObject,
                                                             T secondObject, T thirdObject) {
        int comparison1 = firstObject.compareTo(secondObject);
        int comparison2 = secondObject.compareTo(thirdObject);
        int comparison3 = firstObject.compareTo(thirdObject);
        T maximum = comparison1 > 0 ? (comparison3 > 0 ? firstObject : thirdObject) :
                (comparison2 > 0 ? secondObject : thirdObject);
        return maximum;
    }

    public T findMaxOfThree() {
        T maximum = findMaxOfThree(this.firstObject,this.secondObject, this.thirdObject);
        return maximum;
    }
}
