package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {
    HashMap<String, String> map1 = new HashMap<String, String>();
    public void add(String path, String controller) {
        //HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put(path,controller);
    }

    public Integer size() {
        return map1.size();
    }

    public String getController(String path) {
        return map1.get(path);
    }

    public void update(String path, String studentController) {
        map1.replace(path, studentController);
    }

    public void remove(String path) {
        map1.remove(path);
    }
}
