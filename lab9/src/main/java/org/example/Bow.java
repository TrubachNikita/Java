package org.example;

class Bow extends Weapon{
    private int arrows;
    public Bow(String name,int damage,int range,int arrows){
        super(name,damage,range);
        this.arrows=arrows;
    }

    @Override
    public void attack() {
        System.out.println("Стрельба из лука");
    }

    @Override
    public String getType() {
        return "Метательное оружие";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество стрел: "+ arrows);
    }
}
