package org.example;

class Sword extends Weapon{
    private double sharpness;
    public Sword(String name,int damage,int range,double sharpness){
        super(name,damage,range);
        this.sharpness=sharpness;
    }

    @Override
    public void attack() {
        System.out.println("Удар");
    }

    @Override
    public String getType() {
        return "Оружие";
    }
public void test1(){
    System.out.println("Да");
}


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(super.name);
        System.out.println("Острота"+sharpness);
    }

}
