package org.example;

public class Carrier {
    private String name;
    private double capacity;
    private int speed;

    public Carrier(String name, double capacity, int speed) {
        this.capacity = capacity;
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void deliver() {
        System.out.println(name + "доставит груз");
    }

    public void displayInfo() {
        System.out.println("Название корабля: " + name + "\n" + "Грузоподьемность: " + capacity + "\n" + "Скорость: " + speed + "\n");
    }

    public static class Ship extends Carrier {
        private double tonnage;

        public Ship(String name, double capacity, int speed, double tonnage) {
            super(name, capacity, speed);
            this.tonnage = tonnage;

        }

        @Override
        public double getCapacity() {
            return super.getCapacity();
        }

        @Override
        public void setCapacity(double capacity) {
            super.setCapacity(capacity);
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println(super.name);
            System.out.println("Тонаж: " + tonnage + "\n");

        }

        @Override
        public void deliver() {
            super.deliver();
            System.out.println(getName() + "По воде");

        }

        public void anchor() {
            System.out.println("Корабль на якоре" + getName());
        }
    }

    public  static class   Truck extends Carrier {
        private int wheels;

        public Truck(String name, double capacity, int speed, int wheels) {
            super(name, capacity, speed);
            this.wheels = wheels;
        }

        public int getWheels() {
            return wheels;
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Количество колес: " + wheels + "\n");
        }

        @Override
        public void deliver() {
            super.deliver();
            System.out.println("По суше " + getName());
        }

        public void loadCargo() {
            System.out.println("Загружает" + getName());
        }
    }


    static class Main {
        public static void main(String[] args) {
            Ship ship1 = new Ship("Ever Given", 20000.0, 42, 220000.0);
            Ship ship2 = new Ship("Черная Жемчужина", 1500.0, 35, 2500.0);
            Ship ship3 = new Ship("Титаник", 50000.0, 45, 52000.0);
            Truck truck1 = new Truck("Scania R500", 25.0, 90, 8);
            Truck truck2 = new Truck("КамАЗ-5490", 20.0, 85, 6);
            Carrier[] carriers = { ship1, ship2, ship3, truck1, truck2 };
            for (int i = 0; i < carriers.length; i++) {
                carriers[i].displayInfo();
                carriers[i].deliver();
                System.out.println("--------------------");
            }
            System.out.println("\n=== УНИКАЛЬНЫЕ МЕТОДЫ ===");
            ship1.anchor();
            truck1.loadCargo();
        }
    }
}