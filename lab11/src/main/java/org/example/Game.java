package org.example;

 class Game extends Software {
private String genre;
public Game(String name, String version, double price, String genre){
    super(name,version,price);
    this.genre=genre;
}

     @Override
     public String getRequirements() {
         return "Требования не подходят";
     }
     public void play(){
         System.out.println("Запуск игры"+ getName());
     }
 }

