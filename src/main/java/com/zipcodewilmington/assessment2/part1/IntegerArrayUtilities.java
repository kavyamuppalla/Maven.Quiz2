package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                return false;

            }
        }
        return true;
    }


    public Integer[] range(int start, int stop) {

        return null;

    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        int sum = 0;
        for(int i = 0; i <array.length; i++) {
            sum = array[0]+ array[1];
        }

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int pro = 1;
        for(int i = 0; i <= array.length; i++) {
            pro = array[array.length -1] * array[array.length - 2];
        }
        return pro;
    }
}
