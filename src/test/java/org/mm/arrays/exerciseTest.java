package org.mm.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class exerciseTest {

    private final Object[] superArray = {0,1,2,3};
    private final Object[] findMe = {0,1};
    private final Object[] dontFindMe = {-1,-2};

    @Test
    public void containsOutliersPositive() {
        assertTrue(exercise.containsOutliers(superArray, findMe));
    }

    @Test
    public void containsOutliersNegative() {
        assertFalse(exercise.containsOutliers(superArray, dontFindMe));
    }
}