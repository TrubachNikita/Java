package org.example;

public class Main {
    public static void main(String[] args){
        Software ingenerSoft= new Software("Калькулятор","1.0",0.0);
        Game cyberpunk = new Game("Cyberpunk 2077", "2.1", 50.0, "RPG");
        Editor photoshop = new Editor("Adobe Photoshop", "2026", 100.0, "Графический");
        ingenerSoft.install();
        ingenerSoft.install("C:\\Games");
        ingenerSoft.install(70);
        Software[] catalog = {ingenerSoft, cyberpunk, photoshop};

        for (int i = 0; i < catalog.length; i++) {
            Software app = catalog[i];
            System.out.println(app.getName() + " -> " + app.getRequirements());
            if(app instanceof Game){
                Game uniqueGame = (Game) app;
                uniqueGame.play();
            }else if (app instanceof Editor){
                System.out.println("Редактор кода или графики");
            }
        }

    }
}
