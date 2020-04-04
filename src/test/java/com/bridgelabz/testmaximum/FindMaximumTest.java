package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum maxOfThree = new FindMaximum();

    @Test
    public void givenThreeIntegers_whenMaxAtFirst_shouldReturnTheSame() {
        int maximum = maxOfThree.findMaximum(5,2,4);
        Assert.assertEquals(5, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtSecond_shouldReturnTheSame() {
        int maximum = maxOfThree.findMaximum(1, 4,3);
        Assert.assertEquals(4, maximum);
    }

    @Test
    public void givenThreeIntegers_whenMaxAtThird_shouldReturnTheSame() {
        int maximum = maxOfThree.findMaximum(11, 22, 33);
        Assert.assertEquals(33, maximum);
    }

    @Test
    public void givenThreeFloats_whenMaxAtFirst_shouldReturnTheSame() {
        float maximum = maxOfThree.findMaximum(3.14f, 1.414f, 2.73f);
        boolean isEqual = maximum == 3.14f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloats_whenMaxAtSecond_shouldReturnTheSame() {
        float maximum = maxOfThree.findMaximum(1.6f, 9.8f, 6.14f);
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloats_whenMaxAtThird_shouldReturnTheSame() {
        float maximum = maxOfThree.findMaximum(1.6f, 9.8f, 9.8f);
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeStrings_whenMaxAtFirst_shouldReturnTheSame() {
        String maximum = maxOfThree.findMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStrings_whenMaxAtSecond_shouldReturnTheSame() {
        String maximum = maxOfThree.findMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStrings_whenMaxAtThird_shouldReturnTheSame() {
        String maximum = maxOfThree.findMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeIntegersToConstructor_whenMaxAtFirst_shouldReturnTheSame() {
        FindMaximum<Integer> maxOfThree = new FindMaximum<>(5,2,4);
        Integer maximum = (Integer) maxOfThree.findMaximum();
        Assert.assertEquals((Integer)5, maximum);
    }

    @Test
    public void givenThreeIntegersToConstructor_whenMaxAtSecond_shouldReturnTheSame() {
        FindMaximum<Integer> maxOfThree = new FindMaximum<>(1, 4,3);
        Integer maximum = (Integer) maxOfThree.findMaximum();
        Assert.assertEquals((Integer)4, maximum);
    }

    @Test
    public void givenThreeIntegersToConstructor_whenMaxAtThird_shouldReturnTheSame() {
        FindMaximum<Integer> maxOfThree = new FindMaximum<>(11, 22, 33);
        Integer maximum = (Integer) maxOfThree.findMaximum();
        Assert.assertEquals((Integer)33, maximum);
    }

    @Test
    public void givenThreeFloatsToConstructor_whenMaxAtFirst_shouldReturnTheSame() {
        FindMaximum<Float> maxOfThree = new FindMaximum<>(3.14f, 1.414f, 2.73f);
        Float maximum = (Float) maxOfThree.findMaximum();
        boolean isEqual = maximum == 3.14f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloatsToConstructor_whenMaxAtSecond_shouldReturnTheSame() {
        FindMaximum<Float> maxOfThree = new FindMaximum<>(1.6f, 9.8f, 6.14f);
        Float maximum = (Float) maxOfThree.findMaximum();
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeFloatsToConstructor_whenMaxAtThird_shouldReturnTheSame() {
        FindMaximum<Float> maxOfThree = new FindMaximum<>(1.6f, 9.8f, 9.8f);
        Float maximum = (Float) maxOfThree.findMaximum();
        boolean isEqual = maximum == 9.8f;
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenThreeStringsToConstructor_whenMaxAtFirst_shouldReturnTheSame() {
        FindMaximum<String> maxOfThree = new FindMaximum<>("Peach", "Apple", "Banana");
        String maximum = maxOfThree.findMaximum();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStringsToConstructor_whenMaxAtSecond_shouldReturnTheSame() {
        FindMaximum<String> maxOfThree = new FindMaximum<>("Apple", "Peach", "Banana");
        String maximum = maxOfThree.findMaximum();
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenThreeStringsToConstructor_whenMaxAtThird_shouldReturnTheSame() {
        FindMaximum<String> maxOfThree = new FindMaximum<>("Apple", "Banana", "Peach");
        String maximum = maxOfThree.findMaximum();
        Assert.assertEquals("Peach", maximum);
    }
}
