package org.example;

import java.util.List;

public class Laptop extends Device{
    protected String battery;
    Laptop(String model, String id, int power, String battery){
        super(model, id, power);
        this.battery=battery;
    }
    @Override
    public String toString() {
        return "Ноутбук [" + super.toString() + ", Батарея: " + battery + "]";
    }
}
