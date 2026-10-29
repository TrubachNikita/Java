package org.example;
import java.util.ArrayList;
import java.util.List;
public class BookingSystem {
    private List<Inn> inns = new ArrayList<>();

    public void addInn(Inn inn) {
        inns.add(inn);
    }
    public Inn findInn(String name) throws InnNotFoundException {
        for (Inn inn : inns) {
            if (inn.getName().equalsIgnoreCase(name)) {
                return inn;
            }
        }
        throw new InnNotFoundException("Гостиница \"" + name + "\" не найдена!");
    }
}
