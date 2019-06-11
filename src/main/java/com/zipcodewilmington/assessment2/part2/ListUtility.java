package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> list = new ArrayList<>();
    public Boolean add(int i) {


       //if (!list.contains(i)) {
         //   list.add(i);

        //}
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> setString = new HashSet<>(list);
        list.clear();
        list.addAll(setString);
        return list;

    }

    public String join() {

        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
