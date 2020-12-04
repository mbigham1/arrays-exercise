package org.mm.arrays;

import static org.junit.Assert.*;

public class exerciseTest {

    Object[] superArray = {0,1,2,3};
    Object[] findMe = {0,1};
    Object[] dontFindMe = {-1,-2};

    @org.junit.Test
    public void containsOutliersPositive() {
        assertTrue(exercise.containsOutliers(superArray, findMe));
    }

    @org.junit.Test
    public void containsOutliersNegative() {
        assertFalse(exercise.containsOutliers(superArray, dontFindMe));
    }
}