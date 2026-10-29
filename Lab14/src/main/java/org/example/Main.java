package org.example;
import java.io.*;
import java.util.*;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("     ЛАБОРАТОРНАЯ РАБОТА: ВАРИАНТ 23       ");
            System.out.println("1. Любимый напиток (Да Хун Пао)");
            System.out.println("2. 10 целых чисел: кратные 2 и не кратные 3");
            System.out.println("3. Разделение чисел: в 'g' (кратн. 3 и не 5), в 'h' (остальные)");
            System.out.println("4. 12 значений pH (среднее)");
            System.out.println("5. 10 целых чисел: количество меньших 30");
            System.out.println("0. Выход");
            System.out.print("Выберите задание: ");

            int choice = readInt();

            try {
                switch (choice) {
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    case 3:
                        task3();
                        break;
                    case 4:
                        task4();
                        break;
                    case 5:
                        task5();
                        break;
                    case 0:
                        System.out.println("Выход из программы. До свидания!");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Ошибка: пункта " + choice + " нет в списке. Выберите от 0 до 5.");
                        break;
                }
            } catch (IOException e) {
                System.err.println("Ошибка ввода-вывода при работе с файлом: " + e.getMessage());
            }
        }
    }

    private static void task1() throws IOException{
        System.out.println("\nЗадание 1");
        File file = new File("da_hong_pao.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Напиток: Да Хун Пао (Большой Красный Халат)\n");
            writer.write("Тип: Утёсный улун сильной ферментации с гор Уишань.\n");
            writer.write("Итак, первую строчку моего хит-парада\n" );
            writer.write("Я смело отдаю Большому Красному Халату\n");
            writer.write("Вот, что мне по нраву, — так это Да Хун Пао @Гуф\n");
            writer.write("Эффект: Насыщенный древесный вкус, согревает тело и проясняет разум.");
        }
        System.out.println("Файл успешно создан: " + file.getName());
        System.out.println("\nСвойства файла:");
        System.out.println("- Имя файла: " + file.getName());
        System.out.println("- Путь: " + file.getAbsolutePath());
        System.out.println("- Размер: " + file.length() + " байт");
        System.out.println("- Доступен для чтения: " + (file.canRead() ? "Да" : "Нет"));
        System.out.println("- Доступен для записи: " + (file.canWrite() ? "Да" : "Нет"));

        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    private static void task2() throws IOException {
        System.out.println("\n ЗАДАНИЕ 2 ");
        File fileF = new File("task2_f.txt");

        System.out.println("Режим ввода:\n1 - вручную с клавиатуры\n2 - случайные числа");
        int mode = readMode();

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
            if (mode == 1) {
                System.out.println("Введите 10 целых чисел:");
                for (int i = 1; i <= 10; i++) {
                    System.out.print("Число [" + i + "]: ");
                    writer.print(readInt() + " ");
                }
            } else {
                Random rnd = new Random();
                for (int i = 0; i < 10; i++) {
                    writer.print((rnd.nextInt(100) + 1) + " ");
                }
            }
        }
        int count = 0;
        System.out.print("Числа из файла: ");
        try (Scanner fileScanner = new Scanner(fileF)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");


                if (num % 2 == 0 && num % 3 != 0) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел (кратных 2 и не кратных 3): "+count);
    }
    private static void task3() throws IOException {
        System.out.println("\n ЗАДАНИЕ 3 ");
        File fileF = new File("task3_f.txt");
        File fileG = new File("task3_g.txt");
        File fileH = new File("task3_h.txt");


        Random rnd = new Random();
        try (PrintWriter writerF = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 15; i++) {
                writerF.print((rnd.nextInt(100) + 1) + " ");
            }
        }


        System.out.print("Сгенерировано в файле 'f': ");
        try (Scanner scannerF = new Scanner(fileF);
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            while (scannerF.hasNextInt()) {
                int num = scannerF.nextInt();
                System.out.print(num + " ");

                if (num % 3 == 0 && num % 5 != 0) {
                    writerG.print(num + " ");
                } else {
                    writerH.print(num + " ");
                }
            }
        }
        System.out.println("\nЧисла успешно записаны в файлы task3_g.txt и task3_h.txt");
    }
    private static void task4() throws IOException {
        System.out.println("\n ЗАДАНИЕ 4 ");
        File file = new File("task4_ph.txt");

        System.out.println("Режим ввода:\n1 - вручную с клавиатуры\n2 - случайные числа");
        int mode = readMode();

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            if (mode == 1) {
                System.out.println("Введите 12 значений pH (шкала от 0.0 до 14.0):");
                for (int i = 1; i <= 5; i++) {
                    System.out.print("pH [" + i + "]: ");
                    writer.print(readPhValue() + " ");
                }
            } else {
                Random rnd = new Random();
                for (int i = 0; i < 12; i++) {
                    double val = Math.round((rnd.nextDouble() * 14.0) * 100.0) / 100.0;
                    writer.print(val + " ");
                }
            }
        }


        double sum = 0;
        int count = 0;
        System.out.print("Считанные значения pH: ");
        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.useLocale(Locale.US);
            while (fileScanner.hasNextDouble()) {
                double ph = fileScanner.nextDouble();
                System.out.print(ph + "  ");
                sum += ph;
                count++;
            }
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.printf("\nСреднее значение pH: %.2f (из %d измерений)\n", avg, count);
        }
    }
    private static void task5() throws IOException {
        System.out.println("\n ЗАДАНИЕ 5 ");
        File fileF = new File("task5_f.txt");

        Random rnd = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 10; i++) {
                writer.print((rnd.nextInt(60) + 1) + " ");
            }
        }

        int count = 0;
        System.out.print("Числа из файла: ");
        try (Scanner fileScanner = new Scanner(fileF)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num < 30) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, меньших 30: " + count);
    }
    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Ошибка! Введите целое число: ");
            }
        }
    }

    private static int readMode() {
        while (true) {
            int mode = readInt();
            if (mode == 1 || mode == 2) {
                return mode;
            }
            System.out.print("Введите 1 (ручной) или 2 (автоматический): ");
        }
    }

    private static double readPhValue() {
        while (true) {
            try {
                String input = scanner.nextLine().trim().replace(',', '.');
                double val = Double.parseDouble(input);
                if (val < 0.0 || val > 14.0) {
                    System.out.print("pH не может быть меньше 0 или больше 14! Повторите: ");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.print("Ошибка! Введите число (например, 7.2): ");
            }
        }
    }
}
