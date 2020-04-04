package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxOfThreeTest {
    MaxOfThree maxOfThree = new MaxOfThree();
    @Test
    public void givenThreeIntegers_whenMaxAtFirst_shouldReturnTheSame() {
        int maximum = maxOfThree.findMaxOfThree(5,2,4);
        Assert.assertEquals(5, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtSecond_shouldReturnTheSame() {
        int maximum = maxOfThree.findMaxOfThree(1, 4,3);
        Assert.assertEquals(4, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtThird_shouldReturnTheSame() {
        int maximum = maxOfThree.findMaxOfThree(11, 22, 33);
        Assert.assertEquals(33, maximum);
    }

    @Test
    public void givenThreeFloats_whenMaxAtFirst_shouldReturnTheSame() {
        float maximum = maxOfThree.findMaxOfThree(3.14f, 1.414f, 2.73f);
        boolean isEqual = maximum == 3.14f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloats_whenMaxAtSecond_shouldReturnTheSame() {
        float maximum = maxOfThree.findMaxOfThree(1.6f, 9.8f, 6.14f);
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloats_whenMaxAtThird_shouldReturnTheSame() {
        float maximum = maxOfThree.findMaxOfThree(1.6f, 9.8f, 9.8f);
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeStrings_whenMaxAtFirst_shouldReturnTheSame() {
        String maximum = maxOfThree.findMaxOfThree("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStrings_whenMaxAtSecond_shouldReturnTheSame() {
        String maximum = maxOfThree.findMaxOfThree("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStrings_whenMaxAtThird_shouldReturnTheSame() {
        String maximum = maxOfThree.findMaxOfThree("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximum);
    }

}
