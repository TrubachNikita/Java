package org.example;

class Main{
    public static void main(String[] args){
        Weapon[] inventory = new Weapon[5];
        inventory[0] = new Sword("Экскалибур", 50, 2, 4.8);
        inventory[1] = new Sword("Катана", 40, 2, 5.0);
        inventory[2] = new Sword("Громобой", 65, 3, 3.5);
        inventory[3] = new Bow("Длинный английский лук", 35, 50, 20);
        inventory[4] = new Bow("Композитный лук", 45, 60, 15);
        for (int i = 0; i < inventory.length; i++) {
            System.out.print(inventory[i].name + " -> Тип: " + inventory[i].getType() + " | ");
            inventory[i].attack();
        }
        Weapon weapon = new Sword("Экскалибур", 50, 2, 4.8);
        Sword sword = new Sword("Экскалибур", 50, 2, 4.8);
        sword.test();;
        sword.test1();
    }
}
