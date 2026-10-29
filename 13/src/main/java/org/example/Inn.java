package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inn {
    private String name;
    private String location;
    private int rooms;
    private double pricePerNight;
    private double rating;
    private List<String> guests;
    public Inn(String name, String location, int rooms, double pricePerNight, double rating) throws InvalidInnDataException{
        setName(name);
        setLocation(location);
        setRooms(rooms);
        setPricePerNight(pricePerNight);
        setRating(rating);
        this.guests = new ArrayList<>();
    }
    public void setName(String name) throws InvalidInnDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidInnDataException("Название гостиницы не может быть пустым!");
        }
        this.name = name;
    }

    public void setLocation(String location) throws InvalidInnDataException {
        if (location == null || location.trim().isEmpty()) {
            throw new InvalidInnDataException("Локация не может быть пустой");
        }
        this.location = location;
    }

    public void setRooms(int rooms) throws InvalidInnDataException {
        if (rooms < 0) {
            throw new InvalidInnDataException("Количество комнат не может быть отрицательным");
        }
        this.rooms = rooms;
    }

    public void setPricePerNight(double pricePerNight) throws InvalidInnDataException {
        if (pricePerNight <= 0) {
            throw new InvalidInnDataException("Цена должна быть больше нуля");
        }
        this.pricePerNight = pricePerNight;
    }

    public void setRating(double rating) throws InvalidInnDataException {
        if (rating < 0.0 || rating > 5.0) {
            throw new InvalidInnDataException("В диапазоне от 0.0 до 5.0");
        }
        this.rating = rating;
    }


    public void bookRoom(String guest, int nights) throws BookingException {
        if (nights <= 0) {
            throw new BookingException("Количество ночей должно быть положительным числом");
        }
        if (rooms <= 0) {
            throw new BookingException("В гостинице " + name + " нет свободных мест");
        }

        rooms--;
        guests.add(guest);
        double cost = nights * pricePerNight;
        System.out.println("Номер забронирован для: " + guest + ". К оплате: " + cost + " руб.");
    }

    public void checkOut(String guest) throws BookingException {
        if (!guests.contains(guest)) {
            throw new BookingException("Гость " + guest + " не проживает в этой гостинице!");
        }

        guests.remove(guest);
        rooms++;
        System.out.println("Гость " + guest + " успешно выселен из гостиницы \"" + name + "\".");
    }

    public String getName() {
        return name;
    }

    public int getFreeRooms() {
        return rooms;
    }
}
