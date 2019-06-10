package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    HashMap<String, String> map1 = new HashMap<String, String>();
    public void add(String path, String controller) {
        HashMap<String, String> map1 = new HashMap<String, String>();

       //return map1.putAll(path,controller);
    }

    public Integer size() {
        return map1.size();
    }

    public String getController(String path) {
        return null;
    }

    public void update(String path, String studentController) {
    }

    public void remove(String path) {
    }
}
