package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] c = new Integer[array1.length + array2.length];
        int k=0;
        for (int n : array1)
            c[k++]=n;
        for (int n : array2)
            c[k++]=n;
        return c;
    }



    public Integer[] rotate(Integer[] array, Integer index) {
       return null;

    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {




        return null;
    }

    public Integer mostCommon(Integer[] array) {

        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;

    }
}
