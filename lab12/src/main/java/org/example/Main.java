package org.example;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Device> deviceMap = new HashMap<>();

        Phone p1 = new Phone("iPhone 15", "P001", 15, "48 MP");
        Phone p2 = new Phone("Samsung S24", "P002", 25, "50 MP");
        Phone p3 = new Phone("Xiaomi 14", "P003", 90, "50 MP");
        deviceMap.put(p1.getModel(), p1);
        deviceMap.put(p2.getModel(), p2);
        deviceMap.put(p3.getModel(), p3);
        Tablet t1 = new Tablet("iPad Air", "T001", 30, "11 inch Liquid Retina");
        Tablet t2 = new Tablet("Galaxy Tab S9", "T002", 45, "11 inch AMOLED");
        Tablet t3 = new Tablet("Lenovo Tab P12", "T003", 20, "12.7 inch LCD");
        deviceMap.put(t1.getModel(), t1);
        deviceMap.put(t2.getModel(), t2);
        deviceMap.put(t3.getModel(), t3);
        Laptop l1 = new Laptop("MacBook Pro", "L001", 70, "72.4 Wh");
        Laptop l2 = new Laptop("Asus Zenbook", "L002", 65, "75 Wh");
        deviceMap.put(l1.getModel(), l1);
        deviceMap.put(l2.getModel(), l2);

        deviceMap.values().removeIf(device -> device.getAveragePower() < 30);
        System.out.println("Список всех устройств в Map");
        deviceMap.forEach((key, value) ->
                System.out.println("Модель (Ключ): " + key + ":  " + value)
        );

    }
}
