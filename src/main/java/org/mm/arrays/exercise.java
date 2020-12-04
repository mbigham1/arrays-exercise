package org.mm.arrays;

import java.util.Arrays;

public class exercise {

    public static boolean containsOutliers(final Object[] arraySuper, Object[] arraySub) {
        if(Arrays.asList(arraySub).stream().anyMatch(elm -> Arrays.asList(arraySuper).contains(elm))){
            return true;
        }
        return false;
    }
}
