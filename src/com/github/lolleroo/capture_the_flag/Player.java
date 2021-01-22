package com.github.lolleroo.capture_the_flag;

public class Player {

    private final String name;
    private double x,y,z;

    public Player(String name) {
        this.name = name;
    }

    public String getName(){return name;}

    public String getLocation(){
        return "(" + x + ", " + y + ", " + z +")";
    }

    public void setLocation(double set1, double set2, double set3){
        x = set1;
        y = set2;
        z = set3;
    }

    public boolean nearby(double near1, double near2, double near3){
        return (Math.abs(near1 - x) <= 5 &&
                Math.abs(near2 - y) <= 5 &&
                Math.abs(near3 - z) <= 5);
    }
}
