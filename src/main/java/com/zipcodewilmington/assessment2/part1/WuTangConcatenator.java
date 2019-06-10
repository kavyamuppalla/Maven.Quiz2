package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

//    public Integer getInput() {
//        return input;
//    }
//
//    public void setInput(Integer input) {
//        this.input = input;
//    }

    private Integer input;

    public WuTangConcatenator(Integer input) {

    this.input = input;
    }

    public Boolean isWu() {
        if(this.input % 3 != 0) {
            return false;
        }
        return true;
    }

    public Boolean isTang() {
        if(this.input %5 != 0) {
            return false;
        }
        return true;
    }

    public Boolean isWuTang() {
        if(this.input %5 != 0 || this.input%3 != 0) {
            return false;
        }
        return true;
    }
}
