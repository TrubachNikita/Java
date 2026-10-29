package org.example;

import java.util.List;

public class Tablet extends Device{
    protected String screen;
    Tablet(String model, String id, int power, String screen){
        super(model, id, power);
        this.screen=screen;
    }
    @Override
    public String toString() {
        return "Планшет [" + super.toString() + ", Экран: " + screen + "]";
    }
}
