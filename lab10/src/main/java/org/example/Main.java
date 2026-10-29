package org.example;

public class Main{
    public static void main(String[] args){
        Planet mars = new Planet("Марс ",2.25,"Железо ");
        Planet jupiter = new Planet("Юпитер ",2.5,"Кислород ");
        Planet earth = new Planet("Земля ",2.35,"Свинец ");
        Moon phobos = new Moon("Фобос ", 0.38, mars);
        Moon europa = new Moon("Дэймос ", 0.45, mars);
        Explorable[] targets = {earth, mars, jupiter, phobos, europa};
        for (int i = 0; i < targets.length; i++) {
            targets[i].explore();
            System.out.println("Ресурсы: " + targets[i].getResources());
            System.out.println(" ");
        }
        Orbitable[] spaceObjects = {earth, mars, jupiter, phobos, europa};
        for (int i = 0; i < spaceObjects.length; i++) {
            spaceObjects[i].orbit();
            System.out.println("Время на орбите: " + spaceObjects[i].getOrbitTime());
            System.out.println(" ");
        }
    }
    }

