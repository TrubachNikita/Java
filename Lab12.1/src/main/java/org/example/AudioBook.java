package org.example;
import java.util.*;
import java.util.stream.Collectors;
class AudioBook {
    private int id;
    private String title;
    private String author;
    private double rating;
    private List<Integer> listenerRatings;

    public AudioBook(int id, String title, String author, double rating, List<Integer> listenerRatings) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.listenerRatings = listenerRatings;
    }
    public double getAverageRating() {
        if (listenerRatings == null || listenerRatings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int r : listenerRatings) {
            sum += r;
        }
        return sum / listenerRatings.size();
    }
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Название: \"%s\" | Автор: %s | Базовый рейтинг: %.1f | Средний рейтинг: %.2f",
                id, title, author, rating, getAverageRating());
    }
}
