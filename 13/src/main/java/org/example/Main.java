package org.example;

public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        System.out.println("Создание гостиниц");
        try {
            Inn inn1 = new Inn("Уют", "Минск", -2, 50.0, 4.8);
            system.addInn(inn1);
            System.out.println("Гостиница Уют успешно создана.");

            Inn inn2 = new Inn("Подвал", "Гродно", 0, 20.0, 2.0);
        } catch (InvalidInnDataException e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }

        System.out.println("\nБронирование и нехватка мест");
        try {
            Inn inn = system.findInn("Уют");

            inn.bookRoom("Иван", 3);
            inn.bookRoom("Анна", 2);
            inn.bookRoom("Олег", 1);
        } catch (InnNotFoundException | BookingException e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }

        System.out.println("\nВыселение гостя");
        try {
            Inn inn = system.findInn("Уют");
            inn.checkOut("Иван");
            inn.checkOut("Петр");
        } catch (InnNotFoundException | BookingException e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }

        System.out.println("\nПоиск несуществующей гостиницы");
        try {
            system.findInn("Президент Отель");
        } catch (InnNotFoundException e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: работа системы завершена.");
        }
    }
}
