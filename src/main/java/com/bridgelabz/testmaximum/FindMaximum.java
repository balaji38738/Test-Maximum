package com.bridgelabz.testmaximum;

public class FindMaximum<T extends Comparable<T>>{
    private T firstObject, secondObject, thirdObject;

    public FindMaximum() {

    }

    public FindMaximum(T firstObject, T secondObject, T thirdObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
        this.thirdObject = thirdObject;
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T findMaximum(T... parameters) {
        int hole;
        T value;
        //Insertion sorting
        for (int i = 1; i < parameters.length; i++) {
            hole = i;
            value = parameters[hole];
            while (hole > 0 && parameters[hole-1].compareTo(value) < 0) {
                parameters[hole] = parameters[hole-1];
                hole--;
            }
            parameters[hole] = value;
        }
        printMax(parameters[0]);
        return parameters[0];
    }

    private static <T extends Comparable<T>> void printMax(T maximum) {
        System.out.println(maximum);
    }

    public T findMaximum() {
        return findMaximum(this.firstObject, this.secondObject, this.thirdObject);
    }

}
