package org.example;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        List<AudioBook> books = new ArrayList<>(Arrays.asList(
                new AudioBook(1, "Преступление и наказание", "Ф. Достоевский", 4.0, Arrays.asList(5, 5, 4, 5)), // Средний: 4.75
                new AudioBook(2, "Капитанская дочка", "А. Пушкин", 3.5, Arrays.asList(3, 2, 2, 4)),       // Средний: 2.75
                new AudioBook(3, "Мертвые души", "Н. Гоголь", 4.2, Arrays.asList(4, 4, 4, 4)),            // Средний: 4.0
                new AudioBook(4, "Анна Каренина", "Л. Толстой", 4.5, Arrays.asList(5, 4, 5, 4)),           // Средний: 4.5
                new AudioBook(5, "Аэлита", "А. Толстой", 3.0, Arrays.asList(4, 4, 4, 4))                  // Средний: 4.0 (для проверки алфавита)
        ));

        System.out.println("Исходный список книг");
        books.forEach(System.out::println);
        books.removeIf(book -> book.getAverageRating() < 3);
        for (AudioBook book : books) {
            if (book.getAverageRating() >= 4.0) {
                book.setRating(book.getRating() + 0.5);
            }
        }
        System.out.println("\nСписок после удаления (ср < 3) и изменения рейтинга (ср >= 4)");
        books.forEach(System.out::println);
        System.out.println("\nМетод printAudioBooks (фильтр по базовому рейтингу >= 4.5)");
        printAudioBooks(books, 4.5);
        List<AudioBook> sortedBooks = books.stream()
                .sorted(Comparator
                        .comparingDouble(AudioBook::getAverageRating).reversed()
                        .thenComparing(Comparator.comparing(AudioBook::getTitle).reversed()))
                .collect(Collectors.toList());
        System.out.println("\nУпорядоченный список (ID, Название, Средний рейтинг)");
        for (AudioBook book : sortedBooks) {
            System.out.printf("ID: %d | Название: \"%s\" | Средний рейтинг: %.2f%n",
                    book.getId(), book.getTitle(), book.getAverageRating());
        }
    }
    public static void printAudioBooks(List<AudioBook> books, double minRating) {
        books.stream()
                .filter(book -> book.getRating() >= minRating)
                .forEach(System.out::println);
    }

}