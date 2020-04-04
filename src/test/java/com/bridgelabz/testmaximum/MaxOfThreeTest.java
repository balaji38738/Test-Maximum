package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxOfThreeTest {

    @Test
    public void givenThreeIntegers_whenMaxAtFirst_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(5,2,4);
        int maximum = maxOfThree.findMaxOfThreeIntegers();
        Assert.assertEquals(5, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtSecond_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(3, 4, 1);
        int maximum = maxOfThree.findMaxOfThreeIntegers();
        Assert.assertEquals(4, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtThird_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(11, 22, 33);
        int maximum = maxOfThree.findMaxOfThreeIntegers();
        Assert.assertEquals(33, maximum);
    }

    @Test
    public void givenThreeFloats_whenMaxAtFirst_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(3.14f, 1.414f, 2.73f);
        float maximum = maxOfThree.findMaxOfThreeFloats();
        boolean isEqual = maximum == 3.14f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloats_whenMaxAtSecond_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(1.6f, 9.8f, 6.14f);
        float maximum = maxOfThree.findMaxOfThreeFloats();
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloats_whenMaxAtThird_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree(1.6f, 9.8f, 9.8f);
        float maximum = maxOfThree.findMaxOfThreeFloats();
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeStrings_whenMaxAtFirst_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree("Peach", "Apple", "Banana");
        String maximum = maxOfThree.findMaxOfThreeStrings();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStrings_whenMaxAtSecond_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree("Apple", "Peach", "Banana");
        String maximum = maxOfThree.findMaxOfThreeStrings();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStrings_whenMaxAtThird_shouldReturnTheSame() {
        MaxOfThree maxOfThree = new MaxOfThree("Apple", "Banana", "Peach");
        String maximum = maxOfThree.findMaxOfThreeStrings();
        Assert.assertEquals("Peach", maximum);
    }

}
