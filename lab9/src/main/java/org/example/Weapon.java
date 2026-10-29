package org.example;

abstract class Weapon {
    protected String name;
    protected int damage;
    protected int range;
    public Weapon(String name,int damage,int range){
        this.name=name;
        this.damage=damage;
        this.range=range;
    }
    public  void test(){
        System.out.println("Привет");
    }
    public abstract void attack();
    public abstract String getType();
public void displayInfo(){
    System.out.println("Название: "+name+"\n"+"Урон: "+damage+"\n"+"Дальность: "+range+"\n");
}
}



