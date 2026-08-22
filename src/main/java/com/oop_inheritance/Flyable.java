package com.oop_inheritance;

public interface Flyable {
    void fly();

    default int minDistance(){
        return 10;
    }

    default void startFly(String name, int distance){
        System.out.println(name + " начинает полёт на дистацию " + distance + " метров");
    }
}
