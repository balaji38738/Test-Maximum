package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxOfThreeTest {

    @Test
    public void givenThreeIntegers_whenMaxAtFirst_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(5,2,4);
        int maximum = maxOfThree.findMaxOfThree();
        Assert.assertEquals(5, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtSecond_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(3, 4, 1);
        int maximum = maxOfThree.findMaxOfThree();
        Assert.assertEquals(4, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtThird_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(11, 22, 33);
        int maximum = maxOfThree.findMaxOfThree();
        Assert.assertEquals(33, maximum);
    }

}
