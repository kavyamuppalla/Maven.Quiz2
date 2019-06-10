package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer input) {
        this.input = input;
    }

    private Integer input;

    public WuTangConcatenator(Integer input) {

    this.input = input;
    }

    public Boolean isWu() {
        if(getInput() / 3 == 0) {
            return true;
        }
        return false;
    }

    public Boolean isTang() {
        return null;
    }

    public Boolean isWuTang() {
        return null;
    }
}
