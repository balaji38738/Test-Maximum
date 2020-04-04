package com.bridgelabz.testmaximum;

public class MaxOfThree {
    private Integer firstNum, secondNum, thirdNum;
    private int maximum;

    public MaxOfThree(Integer firstNum, Integer secondNum,
                      Integer thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public int findMaxOfThree() {
        int comparison1 = firstNum.compareTo(secondNum);
        int comparison2 = secondNum.compareTo(thirdNum);
        int comparison3 = firstNum.compareTo(thirdNum);
        maximum = comparison1 > 0 ? (comparison3 > 0 ? firstNum : thirdNum ) :
                (comparison2 > 0 ? secondNum : thirdNum);
        return maximum;
    }
}
