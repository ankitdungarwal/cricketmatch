package com.ankit.cricket.util;

public enum Batsman {

    normal(0),hitter(1),defender(2);
    //private final String type;
    private final int number;

    /*Batsman(String type, int number) {
        this.type = type;
        this.number = number;
    }*/

    Batsman(int i) {
        this.number = i;
    }

    public int getNumber() {
        return number;
    }

    public static Batsman valOf(String type)
    {
        return Batsman.valueOf(type);
    }
}
