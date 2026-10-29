package org.example;

public class Software {
    private String name;
    private String version;
    private double price;
    public Software(String name,String version,double price){
        this.name=name;
        this.price=price;
        this.version=version;
    }
    public void install(){
        System.out.println(name+"Устанавливаю пакет");

    }
    public void install(String path){
        System.out.println(name+"Устанавливаю в папку"+path);
    }
    public void install(int size){
        System.out.println(name+"Установка требуется места"+size);

    }
    public String getRequirements() {
        return "Стандартные требования к системе";
    }

    public String getName() {
        return name;
    }
}
