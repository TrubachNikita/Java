package org.example;

import java.util.List;

public class Phone extends Device {
    protected String camera;
    Phone(String model, String id, int power, String camera){
super(model, id, power);
this.camera=camera;
    }
    @Override
    public String toString() {
        return "Смартфон [" + super.toString() + ", Камера: " + camera + "]";
    }
}
