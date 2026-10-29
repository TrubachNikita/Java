package org.example;
import java.util.List;
import java.util.Collections;


public class Device {
    protected String model;
    protected String id;
    private List<Integer> power;
    Device(String model, String id, List<Integer> power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }
    Device(String model, String id, int power) {

        this(model, id, List.of(power));
    }
    public String getModel() {
        return model;
    }
    public double getAveragePower() {
        if (power == null || power.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int r : power) {
            sum += r;
        }
        return sum / power.size();
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Мощность: " + power + " Вт";
    }
}
